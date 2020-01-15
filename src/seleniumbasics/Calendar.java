package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

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
		
	}
}
