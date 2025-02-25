package operators;

public class AssignmentOperators {
	public static void main(String[] args) {
		
		int x=10;
		
		//System.out.println(x=x+10); //==> short curcuit operation
		System.out.println(x+=10);  //==>20
		
		System.out.println(x-=10); //==>10
		System.out.println(x*=10); //==>100
		System.out.println(x/=10); //==>
		System.out.println(x%=10);
	}

}
