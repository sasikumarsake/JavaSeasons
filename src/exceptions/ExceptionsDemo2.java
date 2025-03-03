package exceptions;

public class ExceptionsDemo2 {
	public static void main(String[] args) {
		
		
		int x=10;
		//int y =2;  //==> without exception
		int y =0; //==> with exception
		
		try
		{
			System.out.println(x/y);
			System.out.println(x%y);
		}
		catch(Exception e)
		{
			System.out.println("Dont initialize the zero for y..!!");
		}
		
		System.out.println("End of program.!!");

		
	}

}
