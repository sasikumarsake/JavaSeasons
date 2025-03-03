package exceptions;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunching {
	public static void main(String[] args) {

		System.out.println("Enter Browsewr Name..!");
		Scanner input = new Scanner(System.in);
		String browserName = input.next();

		switch (browserName) {
		case "chrome": {

			new ChromeDriver();
			break;

		}
		case "firefox":
			new FirefoxDriver(); {
			break;
		}
		case "edge":
			new EdgeDriver(); {
			break;
		}
		default:
			try {
				throw new UnSuppportedException();
			} catch (UnSuppportedException e) {
				System.out.println(e.getMessage());
			}
			break;
		}

	}

}
