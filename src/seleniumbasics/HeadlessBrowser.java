package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.gmail.com/");
		System.out.println("Before login username"+driver.getTitle());
		

	}

}
