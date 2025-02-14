package abstraction;

public class MyTest {

	public static void main(String[] args) {
		
		//Cannot instantiate the type MyInter
		//new MyInter();
		
		
		MyInter m1=new MyClass();
		System.out.println(MyInter.PI);
		m1.display(20);
		//MyInter.PI=30.24; //The final field MyInter.PI cannot be assigned
		System.out.println("Printed the value..!!");
	}

}
