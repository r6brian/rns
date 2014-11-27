package com.rns.graduation;

import java.util.Scanner;

public class GettingAnswersByScanner {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		String firstName;
		String lastName;
		int age;
		
		int currentYear = 2014;
		int graduationYear = 0;
		int ageAtGraduation = 18;

		System.out.println( "what's your first name? " );
		firstName = keyboard.next();

		System.out.println( "what's your last name? " );
		lastName = keyboard.next();

		System.out.println( "how old are you? " );
		keyboard.nextInt();

		age = Integer.parseInt(keyboard.next());
		
		int yearsToGraduate = ageAtGraduation - age;
		graduationYear = currentYear + yearsToGraduate;
		
		System.out.println( "My name is " + firstName + " " + lastName + " and I'll graduate in " + graduationYear + "." );

	}
}
