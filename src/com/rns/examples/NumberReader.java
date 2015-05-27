package com.rns.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


import com.rns.util.ApplicationProperty;
import com.rns.util.NumericUtil;

public class NumberReader {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = readNumbers();
		float total = 0.0f;
		if ( numbers != null && numbers.size() > 0 ){
			for ( int number : numbers ){
				total += number;
			}
			if ( total > 0 ){
				System.out.println( total / numbers.size() );
			}
		}

	}
	
	private static ArrayList<Integer> readNumbers(){
		
		ArrayList<Integer> numbers = null;
		
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
						
						int number = (int) NumericUtil.getFloatValue(line);
						
						if ( numbers == null)
							numbers = new ArrayList<Integer>();
						
						numbers.add(number);

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

		return numbers;
	}
}
