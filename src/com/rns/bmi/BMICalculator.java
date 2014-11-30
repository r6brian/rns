package com.rns.bmi;

import java.awt.FlowLayout;
import java.awt.List;

import javax.swing.*;

import com.rns.entity.Person;
import com.rns.util.NumericUtil;
import com.rns.bmi.BMIWindow;

public class BMICalculator extends JFrame{
	
	//GUI Frame and buttons
	
	//Enum of planet gravitational forces (relative to earth?)
	//Access using Planet.planetname.GForce
	public enum Planet{
		EARTH(1.0),
		VENUS(0.78),
		MARS(0.39),
		JUPITER(2.65),
		SATURN(1.17),
		URANUS(1.05),
		NEPTUNE(1.23);
	
	private double GForce;
	
	double getGForce(){return GForce;}
	
	private Planet(double G){
		this.GForce = G;
	};
}


	public static void main(String[] args) {
		
		//1 Venus	0.78
		//2	Mars	0.39
		//3	Jupiter	2.65
		//4	Saturn	1.17
		//5	Uranus	1.05
		//6	Neptune	1.23
		
		new BMIWindow();
		
		Planet cur_Planet;
		cur_Planet = Planet.EARTH;
		
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
