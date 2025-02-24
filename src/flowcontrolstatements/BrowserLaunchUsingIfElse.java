package flowcontrolstatements;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchUsingIfElse {

	public static void main(String[] args) {
		
		System.out.println("Browser Launching ..!!");
		Scanner input=new Scanner(System.in);
		String browserLaunch=input.next();
		
		if(browserLaunch.equals("chrome"))
		{
			new ChromeDriver();
		}else if(browserLaunch.equals("firefox"))
		{
			new FirefoxDriver();
		}else if(browserLaunch.equals("edge"))
		{
			new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid browser Launch..!!");
		}
		
		input.close();

	}

}
