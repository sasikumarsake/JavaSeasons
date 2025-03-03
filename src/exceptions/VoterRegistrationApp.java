package exceptions;

import java.util.Scanner;

public class VoterRegistrationApp {
	public static void main(String[] args) {
		
		
		System.out.println("Enter into Voter Registration App..!");
		System.out.println("Enter details");
		System.out.println("Enter your Age..!");
		
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		
		if(i>18)
		{
			System.out.println("Please proceed with furthur details and register you vote..!");
		}
		else
		{
			//System.out.println("You are not a valid voter, please check your age.!!");
		
			try
			{
				throw new InvalidAgeException();
			}
			catch(InvalidAgeException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		input.close();
	}

}
