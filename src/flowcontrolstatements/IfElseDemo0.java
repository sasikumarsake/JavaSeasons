package flowcontrolstatements;

import java.util.Scanner;

public class IfElseDemo0 {
	public static void main(String[] args) {
		
		System.out.println("Enter the Number. :");
		
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		
		if(x>=0)
		{
			System.out.println("the value is Positive..!");
		}
		else
		{
			System.out.println("the Vlaue is negative..!");
		}
		input.close();
	}

}
