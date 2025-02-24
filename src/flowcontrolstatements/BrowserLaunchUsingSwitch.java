package flowcontrolstatements;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchUsingSwitch {

	public static void main(String[] args) {
		
		
		System.out.println("Launching Browser..!");
		Scanner s1=new Scanner(System.in);
		String input=s1.next();
		
		switch(input)
		{
		case "chrome" : 
		
			new ChromeDriver();
			break;
		
		case "firefox" :
		
			new FirefoxDriver();
			break;
		
		case "edge" :
		
			new EdgeDriver();
			break;
	
		default :
		
			System.out.println("Invalid browser choice ..!");
	
		}
		
		s1.close();
		

	}

}
