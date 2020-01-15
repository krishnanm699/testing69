package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boosstrap3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
	List<WebElement>list=	driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu show')]//a"));
	System.out.println(list.size());
	for(int i=0;i<list.size();i++)
	{
		//String listvalues=list.get(i).getText();
	
	if(list.get(i).getText().equals("Another action"))
	{
		Thread.sleep(3000);
		list.get(i).click();
		break;
	}
	}
	}
}
