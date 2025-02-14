package encapsulation;

public class NumbersTest {

	public static void main(String[] args) {
		
		//we need create object for numbers class
		Numbers n1 = new Numbers();
		n1.setXY(50, 100); // calling this setXY method through object reference and assigning values for x y
		n1.getXY(); // printing those assigned values in the console.

	}

}
