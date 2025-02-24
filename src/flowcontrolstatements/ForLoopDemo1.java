package flowcontrolstatements;

public class ForLoopDemo1 {

	public static void main(String[] args) {

		// 1.Print numbers from 1 to 10

		/*
		 * System.out.println("Hello Java..!"); System.out.println("Hello Java..!");
		 * System.out.println("Hello Java..!"); System.out.println("Hello Java..!");
		 * System.out.println("Hello Java..!");
		 */

		// Type1

		/*
		 * for(int i=1;i<=5;i++) { System.out.println("Hello Java..!"); }
		 */

		// Type 2
		int i = 1;
		for (; i <= 5;) {
			System.out.println("Hello Java");
			i++;
		}
	}
}
