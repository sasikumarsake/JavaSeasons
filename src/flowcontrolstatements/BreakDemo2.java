package flowcontrolstatements;

public class BreakDemo2 {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			else
			{
				System.out.println(i);
			}
		}
		System.out.println("End of the Program..!");
	}

}
