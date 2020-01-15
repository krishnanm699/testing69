package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booststrapbasices {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_3");
		driver.findElement(By.xpath("//button[contains(@class,'multiselect ')]")).click();
	List<WebElement>list=	driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container ')]//li//a//label"));
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++)
	{
		String listvalues =list.get(i).getText();
		if(listvalues.contains("Java"))
		{
			list.get(i).click();
			break;
		}
	}

	}

}
