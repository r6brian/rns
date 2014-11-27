package com.rns.bmi;

import com.rns.entity.Person;
import com.rns.util.NumericUtil;

public class BMICalculator {

	public static void main(String[] args) {
		
		//1 Venus	0.78
		//2	Mars	0.39
		//3	Jupiter	2.65
		//4	Saturn	1.17
		//5	Uranus	1.05
		//6	Neptune	1.23
		
		Person person = null;
		
		person = new Person("brian",26.0f,1.75f);
		System.out.println(person.calculateBodyMassIndex());
		System.out.println(person.calculateBodyMassIndex(getGravity("venus")));
		
		person = new Person();
		
		if ( args != null && args.length > 0 ){
				
			String input = args[0];
			
			String [] values = input.split(",");
			if ( values != null && values.length == 5  ){

				person.setName(values[0]);
				
				float height = NumericUtil.getFloatValue(values[1]);
				person.setHeight(height);
				
				float weight = NumericUtil.getFloatValue(values[2]);
				person.setWeight(weight);
				
				System.out.println(person.calculateBodyMassIndex(getGravity(values[3])));

			}
		}		
		
		//this is a method to set the height of a person
		
		person.setHeight(1.75f);
		person.setWeight(26.0f);
		person.setName("Jonah");
		System.out.println(person.calculateBodyMassIndex());
		System.out.println(person.calculateBodyMassIndex(getGravity("venus")));		
		

	}
	
	private static float getGravity(String planet){
		float gravity = 1.0f;
		
		if ( planet != null && planet.length() > 0 ){
						
			if ( planet.toLowerCase().equals("venus")){
				gravity = 0.78f;
			} else if (planet.toLowerCase().equals("jupiter") ) {
				gravity = 2.65f;
			} else {
				gravity = 1.0f;
			}
		}
		
		return gravity;
	}

}
