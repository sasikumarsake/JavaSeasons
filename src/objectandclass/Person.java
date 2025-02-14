package objectandclass;

public class Person {
	
	String name;
	
	int age;
	
	long ph;
	
	
	public void greet()
	{
		System.out.println("Hey "+name+" How you are man...!");
		System.out.println("Hey "+name+" your age is "+age);
		System.out.println("Hey "+name+" your mobile number is "+ph);
	}
	
	
	String empName;
	int empCode;
	long empMobileNumber;
	String empAddress;
	
	
	
	public static Person getPerson()
	{
		return new Person();
	}
}
