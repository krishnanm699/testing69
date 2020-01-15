package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasices {
	public static void main(String[] args) {

		//System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		//WebDriver driver= new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google"))
		{
			System.out.println("correct title");
		}
			else
			{
				System.out.println("incorrect title");
		}
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.quit();

	}
}


