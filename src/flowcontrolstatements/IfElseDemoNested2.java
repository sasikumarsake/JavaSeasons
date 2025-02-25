package flowcontrolstatements;

import java.util.Scanner;

public class IfElseDemoNested2 {
	public static void main(String[] args) {
		
		//int x=90;  ==> Direct Value Assigning
		
		System.out.println("Enter Student Marks..: ");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		
		if(x>90)
		{
			System.out.println("Result is Grade A+");
		}
		else if(x>80)
		{
			System.out.println("Result is Grade A");
		}
		else if(x>70)
		{
			System.out.println("Result is Grade B");
		}
		else
		{
			System.out.println("Fail");
		}
		System.out.println("Student result is "+x);
		input.close();
	}

}
