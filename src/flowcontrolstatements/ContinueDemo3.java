package flowcontrolstatements;

public class ContinueDemo3 {
	public static void main(String[] args) {

label:
		for(int j=1;j<=10;j++)
		{
			for (int i=1;i<=10;i++)
			{
				if(i==5)
				{
					continue label;
				}
				else
					System.out.println(j+"\t"+i);
			}
		}
		System.out.println("End Program..!");
	}

}
