package exceptions;

public class ExceptionsDemo1 {
	public static void main(String[] args) {
		
		
		//int i = 90909090909; //==> The literal 90909090909 of type int is out of range   (Compile Time Error)
		int I=90909090;
		
		int x=10;
		//int y=0;
		int y=2;
		
		System.out.println(x/y);  //==> int y=0; Exception in thread "main" java.lang.ArithmeticException: / by zero at exceptions.ExceptionsDemo1.main(ExceptionsDemo1.java:13)
		System.out.println(x%y);
		System.out.println("End of Program..!!");

	}

}
