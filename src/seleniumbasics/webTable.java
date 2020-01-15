package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://ui.cogmento.com/");
	driver.findElement(By.name("email")).sendKeys("krishnanm69@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Testing@12");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[contains(text(),'Login')]")).click();
	
	//Method 1
	//driver.switchTo().frame(0);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='main-nav']/a[3]/span")).click();
	String Before_Xpath ="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
	String After_xpath ="]/td[2]";
	for(int i=1;i<=2;i++)
	{
		Thread.sleep(3000);
		String name =driver.findElement(By.xpath(Before_Xpath + i+ After_xpath)).getText();
		//Thread.sleep(3000);
		System.out.println(name);

	
	if(name.contains("test 2 xfx"))
	{
        Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[1]/div/input/label")).click();  
		//driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[" + i + "]/td[1]/div/input")).click();
	}


}
}
}
