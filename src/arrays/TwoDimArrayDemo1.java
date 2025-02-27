package arrays;

public class TwoDimArrayDemo1 {
	public static void main(String[] args) {


		String[][] obj = new String[2][4];
		
		System.out.println(obj.length);//==>2
		System.out.println(obj[0].length);//==>4
		System.out.println(obj[1].length);//==>4
		
		for(int i=0;i<obj.length;i++)
		{
			for(int j=0;j<obj[i].length;j++)
			{
				System.out.print(obj[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Dummy Names");
		
		obj[0][0]="Name1";
		obj[0][1]="Name1";
		obj[0][2]="Name1";
		obj[0][3]="Name1";
		
		System.out.println("SSK Names");
		
		obj[1][0]="SSK1";
		obj[1][1]="SSK2";
		obj[1][2]="SSK3";
		obj[1][3]="SSK4";
		
		for(int i=0;i<obj.length;i++)
		{
			for(int j=0;j<obj[i].length;j++)
			{
				System.out.println(obj[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
