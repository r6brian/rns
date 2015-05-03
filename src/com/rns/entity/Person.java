package com.rns.entity;

public class Person {

	private float _Height = 0.0f;
	private float _Weight = 0.0f;
	private String _Name = "";

	public Person(){
		
	}

	public Person(String name, float weight, float height){
		
		_Name = name;
		_Weight = weight;
		_Height = height;
		
	}

	public void setHeight(float height){
		_Height = height;
	}
	public float getHeight(){
		return _Height;
	}
	
	public void setWeight(float weight){
		_Weight = weight;
	}
	public float getWeight(){
		return _Weight;
	}
	
	public void setName(String name){
		_Name = name;
	}
	public String getName(){
		return _Name;
	}
	
	public double calculateBodyMassIndex(){
		return calculateBodyMassIndex(1.0f);}
	public double calculateBodyMassIndex(double gravity){
		double bmi = ( _Weight * gravity ) / ( _Height * _Height);
		return bmi;}
}
