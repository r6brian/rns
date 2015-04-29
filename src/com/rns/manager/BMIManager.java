package com.rns.manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.rns.entity.Person;
import com.rns.util.ApplicationProperty;
import com.rns.util.NumericUtil;

public class BMIManager {

	private static Logger logger = Logger.getLogger(BMIManager.class);
	
	public ArrayList<Person> readPersons(){
		
		logger.info("ENTER processStrings()");
		ArrayList<Person> persons = null;
		
		String fileName = ApplicationProperty.getInstance().GetPropertyValue("input.fileName");
		String filePath = ApplicationProperty.getInstance().GetPropertyValue("input.filePath");
		
		BufferedReader inputFile = null;
		
		try 
		{
			String line = "";
			
			inputFile = new BufferedReader(new FileReader(filePath + "//" +fileName));
			if ( inputFile != null ){
			
				while ((line = inputFile.readLine()) != null) {

					if ( ! NumericUtil.isEmptyOrNull(line)){

						
						if ( line.contains(",")){
							
							String [] items = line.split(",");
							if ( items != null && items.length == 4){
								Person person = new Person();
								person.setName(items[0]);
								person.setHeight(NumericUtil.getFloatValue(items[1]));
								person.setWeight(NumericUtil.getFloatValue(items[2]));
								
								
								
								if ( persons == null)
									persons = new ArrayList<Person>();
								
								
								persons.add(person);
							}
						}
					}
				}
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inputFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		logger.info("EXIT readStrings() ");
		return persons;
	}
}
