package flowcontrolstatements;

import java.util.Scanner;

public class IfElseDemo1 {
	public static void main(String[] args) {
		
		System.out.println("Enter your salary : ");
		Scanner s1=new Scanner(System.in);
		double sal=s1.nextDouble();
		
		// if-else-if ladder
		if(sal>0 && sal<=10000)
		{
			sal=sal+(sal*0.1);
		}
		else if(sal>10000 && sal<=20000)
		{
			sal+=(sal*0.2); //==> short curcuit opearatoe
		}
		else if(sal>20000 && sal<=30000)
		{
			sal+=(sal*0.3);
		}
		else 
		{
			sal+=(sal*0.4);
		}
		
		System.out.println("Your Current sal:"+sal);
		
		s1.close();
	}

}
