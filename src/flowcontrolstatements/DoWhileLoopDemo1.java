package flowcontrolstatements;

import java.util.Scanner;

public class DoWhileLoopDemo1 {

	public static void main(String[] args) {
		
		
	Scanner input=new Scanner(System.in);
	
	String username = null;
	String passward = null;
	
	do {
		System.out.println("Enter the Username :");
		username=input.next();
		System.out.println("Enter Passward :");
		passward=input.next();
		
		if(username.equals("Sasikumar") && passward.equals("Sake@6754"))
		{
			System.out.println("You're Successfully entered into page..!!");
			break;
		}
		else
		{
			System.out.println("You have entered wrong credentilas,"
					+ " Please recheck your credentials accordingly..!!");
		}
	}
	while(true);
	input.close();	
	}
	

}
