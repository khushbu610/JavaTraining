package com;
public class ExcerciseDataType {

	/**
	 * This data type program you need to create the following:
	 * 
	 *  1. Create at least three identifiers
	 *  2. Create few variables using different data types
	 *  3. Add few arithmetic operations
	 *  4. Add few logical operators 	 
	 *  
	 */

	public static void main( String[] args ){  
 
		//TODO you need to create your logic here..
		String myName ="Khushbu";
		int subject1 =80;
		int subject2 = 30;
		int average = (subject1 + subject2)/2;
		boolean a = true;
		boolean b = false;
		
	System.out.println(myName);
	System.out.println(average);
	System.out.println("Total marks you obtained out of 200 is:" + (subject1 + subject2));
	System.out.println("Average of two subject is: " + ((subject1 + subject2)/2));
	System.out.println("a && b = " + (a && a));
	System.out.println("a || b = " + (a||a) );
	System.out.println("!(a && b) = " + !(a && a));	
			
		

	}
}


