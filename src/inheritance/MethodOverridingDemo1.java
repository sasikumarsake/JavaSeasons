package inheritance;

public class MethodOverridingDemo1 {

	public static void main(String[] args) {
	
		//case1
//	C obj1=new C();
//	obj1.m2();
//	obj1.greet("Sasikumar");
	
		//case 2
//		P obj1=new P();
//		obj1.m1();
//		obj1.greet("SSK");
		
		//case3
		
		//C obj1=new P();//Type mismatch: cannot convert from P to C
	
		//case 4
		P obj1=new C();
		System.out.println("Expecteing Override method");
		obj1.m1(); //P Class value will print here
		obj1.greet("SSK "); //C Class text would be print here
		System.out.println(obj1.x);  //10
		
	}

}
