package flowcontrolstatements;

import java.util.Scanner;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		
		
		//print the value through the console
		//System.out.println("Enter the Interger Value:");
		//Scanner input=new Scanner(System.in);
		//int x=input.nextInt();
		
		int x=2; //==> Based on the x value it will accordingly
		
		switch(x)
		{
		case 1: System.out.println("Hi");
				break;
		case 2: System.out.println("Hello");
				break;
		default: System.out.println("Bye");		
		
		}
		//input.close();
	}

}
