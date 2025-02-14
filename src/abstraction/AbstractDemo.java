package abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		
		//Numbers n1=new Sum();
		Numbers n1=new Sub();
		n1.compute(30, 20);
		n1.greet();
	}

}
