package operators;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		
		System.out.println("Enter the Number. :");
		
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		
		//instead of writing so many lines we can optimize the lines by using the ternary operator
		System.out.println(x>=0?"+ve":"-ve");
		
		input.close();
	}

}
