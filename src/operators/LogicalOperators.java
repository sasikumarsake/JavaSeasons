package operators;

import java.util.Scanner;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		System.out.println("Enter value in the console");
		
		Scanner input=new Scanner(System.in);
		int s1=input.nextInt();
		
		//System.out.println(s1>0 && s1<10);
		System.out.println(!(s1>0 || s1<10));
		System.out.println(!(s1>0 && s1<10));
	}

}
