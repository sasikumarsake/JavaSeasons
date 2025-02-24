package flowcontrolstatements;

import java.util.Scanner;

public class DoWhileLoopDemo2 {

	
	/*
	 * 1. User Input Validation Ensures the user enters a valid number within a
	 * range.
	 */
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int number;
		
		do {
			System.out.println("Enter a number between 1 and 10:");
			number=input.nextInt();
		}
		while(number<1 || number>10);
		{
			System.out.println("Valid Number Entered : "+number);
			input.close();
		}
	}
}