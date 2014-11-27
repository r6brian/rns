package com.rns.graduation;


public class GettingAnswersByPassingArgs {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		
		if ( args != null && args.length == 3){
			
			String firstName;
			String lastName;
			int age = 0;

			firstName = args[0];
			lastName = args[1];
			age = Integer.parseInt(args[2]);

			int currentYear = 2014;
			int graduationYear = 0;
			int ageAtGraduation = 18;
			
			int yearsToGraduate = ageAtGraduation - age;
			graduationYear = currentYear + yearsToGraduate;
			
			System.out.println( "My name is " + firstName + " " + lastName + " and I'll graduate in " + graduationYear + "." );
		} else {
			System.out.println("please add args!");
		}

	}
}
