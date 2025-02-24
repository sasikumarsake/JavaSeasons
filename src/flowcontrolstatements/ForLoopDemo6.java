package flowcontrolstatements;

public class ForLoopDemo6 {

	public static void main(String[] args) {
		
		//2.Find all even numbers in a given array
		
		int[] numbers = {10, 15, 20, 25, 30, 35};
		for (int num : numbers)
		{
			if (num%2==0)
			{
				System.out.println(num);
			}
		}
	}
}
