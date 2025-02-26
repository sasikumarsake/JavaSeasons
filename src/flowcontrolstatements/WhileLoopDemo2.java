package flowcontrolstatements;

import java.util.Scanner;

public class WhileLoopDemo2 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the Character :");			
			char ch1=input.next().charAt(0);

			if(ch1!='x' && ch1!='X')
			{
				System.out.println("You have entered the value "+ch1+" Character");
			}
			else
			{
				System.out.println("Game Over :");
				break;
			}
			
		}
		input.close();	
	}

}
