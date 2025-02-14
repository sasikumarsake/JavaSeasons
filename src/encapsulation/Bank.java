package encapsulation;

public class Bank {

	//public double balance = 10000.0;
	
	private double balance = 10000.0;
	
	//public methods, Some Validations
	//getters
	
	public double getBalance(int pin)
	{
		//validation
		if(pin==9876)
		{
			return balance;
		}
		else
		{
			System.out.println("Invalid Pin Entered..\n"
			+"Please enter correct pin");
			
			return 0.0;
		}
	}
	//setters
	public void setBalance(double deposit)
	{
		balance=balance+deposit;
	}

}
