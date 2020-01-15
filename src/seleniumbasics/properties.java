package seleniumbasics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class properties {

	public static WebDriver driver;
public static void main(String[] args) throws IOException {
	
	Properties prop = new Properties();
	FileInputStream ip = new FileInputStream("C:\\Newselenium\\Naveen\\src\\seleniumbasics\\config.properties");
	prop.load(ip);
	
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("age"));
	System.out.println(prop.getProperty("url"));
	
	String browserName=prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();

	}
	else if(browserName.equals("ff"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
		 driver= new FirefoxDriver();

	}
	
	driver.get(prop.getProperty("url"));
	driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys("Testing");
}
 
	}


