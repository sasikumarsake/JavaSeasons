package flowcontrolstatements;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {

		/*
		 * System.out.println("Enter your date of birth..:");
		 * System.out.println("Enter Date"); Scanner input=new Scanner(System.in); int
		 * date=input.nextInt(); System.out.println("Enter month"); int
		 * mon=input.nextInt(); System.out.println("Enter Year"); int
		 * year=input.nextInt();
		 * 
		 * 
		 * String month=null;
		 */

		//switch case
		
		int date = 1;
        int monthNum = 3;  // Corrected: month should be an int, not a String
        int year = 2000;

        String month;

        switch (monthNum) {
            case 1: month = "Jan"; break;
            case 2: month = "Feb"; break;
            case 3: month = "Mar"; break;
            case 4: month = "Apr"; break;
            case 5: month = "May"; break;
            case 6: month = "Jun"; break;
            case 7: month = "Jul"; break;
            case 8: month = "Aug"; break;
            case 9: month = "Sep"; break;
            case 10: month = "Oct"; break;
            case 11: month = "Nov"; break;
            case 12: month = "Dec"; break;
            default:
                System.out.println("Invalid data entered");
                return; // Exit if invalid month
        }

        System.out.printf("%02d-%s-%04d%n", date, month, year);
	}
}
