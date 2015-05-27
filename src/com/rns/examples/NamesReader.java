package com.rns.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.rns.util.ApplicationProperty;
import com.rns.util.NumericUtil;

public class NamesReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static ArrayList<String> readNames(){
		
		ArrayList<String> names = null;
		
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
						
						if ( names == null)
							names = new ArrayList<String>();
						
						names.add(line);

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

		return names;
	}
}
