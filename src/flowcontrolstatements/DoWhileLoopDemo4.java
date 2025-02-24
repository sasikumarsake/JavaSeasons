package flowcontrolstatements;

import java.util.Scanner;

public class DoWhileLoopDemo4 {

	
	/*
	 * 3. Printing Numbers from 1 to 10
	 */
	
	public static void main(String[] args) {
		
		int i=1;
		
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);
	}
}