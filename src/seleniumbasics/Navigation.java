package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.navigate().to("https://www.amazon.in");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();
	
}

}
