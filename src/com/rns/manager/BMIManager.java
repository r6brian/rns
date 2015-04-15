package com.rns.manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.rns.util.ApplicationProperty;
import com.rns.util.NumericUtil;

public class BMIManager {

	private static Logger logger = Logger.getLogger(BMIManager.class);
	
	public ArrayList<String> readStrings(){
		
		logger.info("ENTER processStrings()");
		ArrayList<String> strings = null;
		
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
		return strings;
	}
}
