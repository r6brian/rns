package com.rns.bmi;
//Simple enum to  hold each planets gravitational force relative to earth
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
