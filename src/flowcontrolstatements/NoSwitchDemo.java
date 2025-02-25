package flowcontrolstatements;

import java.util.Scanner;

public class NoSwitchDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter your date of birth..:");
		System.out.println("Enter Date");
		Scanner input=new Scanner(System.in);
		int date=input.nextInt();
		System.out.println("Enter month");
		int mon=input.nextInt();
		System.out.println("Enter Year");
		int year=input.nextInt();

		
		String month=null;
		
		if(mon==1)
		{
			month="Jan";
		}
		else if(mon==2)
		{
			month="Feb";
		}
		else if(mon==3)
		{
			month="Mar";
		}
		else if(mon==4)
		{
			month="Apr";
		}
		else if(mon==5)
		{
			month="May";
		}
		else if(mon==6)
		{
			month="Jun";
		}
		else if(mon==7)
		{
			month="Jul";
		}
		else if(mon==8)
		{
			month="Aug";
		}
		else if(mon==9)
		{
			month="Sep";
		}
		else if(mon==10)
		{
			month="Oct";
		}
		else if(mon==11)
		{
			month="Nov";
		}
		else if(mon==12)
		{
			month="Dec";
		}
		else
		{
			System.out.println("Invalid month entered..!!");
		}
		System.out.format("%02d-%s-%04d",date,month,year);
		input.close();
	}
}
