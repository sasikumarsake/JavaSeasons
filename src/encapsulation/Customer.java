package encapsulation;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		
	//Bank b1 = new Bank();
//	
//	//System.out.println(b1.balance);
//	System.out.println(b1.getBalance(9876));
	
	//running it in console level
	Bank b1 =new Bank();
	Scanner scanner = new Scanner(System.in);
	int pin=scanner.nextInt();
	
	double balance = b1.getBalance(pin);
	if (balance>0)
	{
		System.out.println("Your balance is: " + balance);
	}
	scanner.close();
	
	}

}
