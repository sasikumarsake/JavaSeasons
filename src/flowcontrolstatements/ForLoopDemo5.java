package flowcontrolstatements;

public class ForLoopDemo5 {

	public static void main(String[] args) {
		
		//2.Reverse a string using a for loop
		
		String value="Hello";
		String reverseString ="";
		
		for(int i=value.length()-1;i>=0;i--)
		{
			reverseString+=value.charAt(i);
		}
		System.out.println(reverseString);
	}
}
