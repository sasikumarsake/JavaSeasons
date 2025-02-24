package flowcontrolstatements;

import java.util.Scanner;

public class DoWhileLoopDemo5 {


	/*
	 * 4. Sum of Digits of a Number
	 */

	public static void main(String[] args) {

		Scanner s1=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=s1.nextInt();
		int sum=0;
		
		do {
			sum+=num%10;
			num/=10;
			
		}while (num > 0);
        System.out.println("Sum of digits: " + sum);
        s1.close();
	}
}