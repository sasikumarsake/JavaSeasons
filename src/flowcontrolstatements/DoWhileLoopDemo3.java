package flowcontrolstatements;

import java.util.Scanner;

public class DoWhileLoopDemo3 {

	
	/*
	 * 2. Menu-Driven Program 
	 * Displays a menu until the user chooses to exit.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Menu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
			choice=scanner.nextInt();
		}
		while(choice != 3);
		{
			System.out.println("Exiting program...");
			scanner.close();
		}
	}
}