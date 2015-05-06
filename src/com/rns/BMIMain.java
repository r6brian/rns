package com.rns;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;


import com.rns.manager.BMIManager;

public class BMIMain {
	
    private static String LOG_PROPERTIES_FILE = "conf/log4j.configuration";

	public static void main(String[] args) {
		SetUp();
    	BMIManager bmiManager = new BMIManager();
    	bmiManager.generateBMIs();

	}
	
    private static void SetUp (){
    	
        BasicConfigurator.configure();
        PropertyConfigurator.configure(LOG_PROPERTIES_FILE);
    }

}
