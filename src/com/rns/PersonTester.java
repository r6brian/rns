package com.rns;

import com.rns.entity.Person;

public class PersonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person testperson = new Person();
		testperson.setWeight(1000);
		System.out.println(Float.MAX_VALUE);
		testperson.setWeight(Float.MAX_VALUE + 1);
		System.out.println(testperson.getWeight());
		testperson.setHeight(Float.MIN_VALUE -1);
		testperson.setHeight(-1000);
		System.out.println(testperson.calculateBodyMassIndex(2.65));

	}

}
