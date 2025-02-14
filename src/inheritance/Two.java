package inheritance;

public class Two extends One {
	int a;

	Two()
	{
		System.out.println("Two's Constructor..!!");
	}
	void putA(int a)
	{
		this.a=a;
	}
	void display()
	{
		//System.out.println("a is "+a);
		System.out.println("a is "+super.a);
		//greet();  ==> Child class value printing
		super.greet(); //==> Parent class value will print
	}
	void greet()
	{
		System.out.println("HELLO Machaa..!");
	}
}
