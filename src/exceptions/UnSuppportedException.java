package exceptions;

public class UnSuppportedException extends RuntimeException {
	
	//call the constructor
	public UnSuppportedException()
	{
		super("Please enter valid browser in listed Chrome, Edge and Firefox..!!");
	}
}
