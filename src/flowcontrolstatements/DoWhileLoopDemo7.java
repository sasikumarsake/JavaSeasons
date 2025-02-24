package flowcontrolstatements;

import java.util.Scanner;

public class DoWhileLoopDemo7 {


	/*
	 * 6. Factorial of a Number
	 */

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int factorial=1,i=number;

		do {
			factorial=factorial+i;
			i--;
		}while(i>=0);
		{
			System.out.println("Factorial: " + factorial);
			scanner.close();
		}

	}
}