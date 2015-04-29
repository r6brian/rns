package com.rns;

import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

import com.rns.entity.Person;
import com.rns.manager.BMIManager;

public class BMIMain {
	
    private static String LOG_PROPERTIES_FILE = "conf/log4j.configuration";

	public static void main(String[] args) {
		SetUp();
    	BMIManager bmiManager = new BMIManager();
    	ArrayList<Person> persons = bmiManager.readPersons();
    	if ( persons != null && persons.size() > 0 ){
    		for ( Person person : persons){
        		System.out.println(person.getName() + " has a BMI of " + person.calculateBodyMassIndex());
    		}
    	}
	}
	
    private static void SetUp (){
    	
        BasicConfigurator.configure();
        PropertyConfigurator.configure(LOG_PROPERTIES_FILE);
    }

}
