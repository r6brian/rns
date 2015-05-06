package com.rns.manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.rns.entity.Person;
import com.rns.entity.Planet;
import com.rns.util.ApplicationProperty;
import com.rns.util.NumericUtil;

public class BMIManager {

	private static Logger logger = Logger.getLogger(BMIManager.class);
	
	public void generateBMIs(){
		
    	ArrayList<Person> persons = readPersons();
    	if ( persons != null && persons.size() > 0 ){
    		for ( Person person : persons){
    			
    			if ( person != null ){
    				
    				float gravity = getGravity(person.getPlanet());
    				
    				System.out.println(person.getName() + " has a BMI of " + person.calculateBodyMassIndex(gravity));
    			}
    		}
    	}
	}
	
	private ArrayList<Person> readPersons(){
		
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
								person.setPlanet(items[3]);
								
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
	
	private float getGravity(String planet){
		
		float gravity = 1.0f;
		
		if ( ! NumericUtil.isEmptyOrNull(planet) ){
			
			Planet[] planets = Planet.values().clone();
			if ( planets != null && planets.length > 0){
				for ( int i = 0; i < planets.length; i++){
					if (planets[i].getName().equals(planet.toLowerCase()) ){
						gravity = planets[i].getGravity();
					}
				}
			}
		}
		
		return gravity;
	}
}
