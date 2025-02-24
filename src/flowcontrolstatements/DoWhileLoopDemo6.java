package flowcontrolstatements;

import java.util.Scanner;

public class DoWhileLoopDemo6 {


	/*
	 * 5. Reverse a Number
	 */

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int number=input.nextInt();
		int reversed=0;
		
		do {
			int digit=number%10;
			reversed=reversed*10+digit;
			number/=10;
		}while(number>0);
		{
			System.out.println("Reversed Number: " + reversed);
			input.close();
		}
		
	}
}