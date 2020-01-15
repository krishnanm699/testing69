package com.parameteters;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParametersTest {
	WebDriver driver;
 @Test
 @Parameters({"env","browser","url","userid","password"})
	public void parameterss(String env,String browser,String url,String userid,String password) {
	 
	  if(browser.equals("chrome"))
	  {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	  }
	  else if(browser.equals("firebox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
			driver = new ChromeDriver();
	  }
	  
	
		driver.get(url);
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys(userid);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@name='proceed']")).click();
}
}
