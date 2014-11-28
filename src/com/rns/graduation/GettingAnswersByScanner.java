package com.rns.graduation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GettingAnswersByScanner {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		String firstName;
		String lastName;
		int age = 0;
		boolean cont = false;
		int currentYear = 2014;
		int graduationYear = 0;
		int ageAtGraduation = 18;

		System.out.println( "What's your first name? " );
		firstName = keyboard.next();

		System.out.println( "What's your last name? " );
		lastName = keyboard.next();

		System.out.println( "How old are you? " );
		//keyboard.nextInt();
		do{
		
		try{
		age = Integer.parseInt(keyboard.next());
		cont = true;
		}catch(InputMismatchException|NumberFormatException e){
			System.out.println("Please input an integer!");
		}
		}while(!cont);
		
		int yearsToGraduate = ageAtGraduation - age;
		graduationYear = currentYear + yearsToGraduate;
		
		System.out.println( "My name is " + firstName + " " + lastName + " and I'll graduate in " + graduationYear + "." );

	}
}
