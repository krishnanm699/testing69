package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-webdriver/mouse-hover-action/");

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a/span/span"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[2]/a/span/span")).click();

	}

}
