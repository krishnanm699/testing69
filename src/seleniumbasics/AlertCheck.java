package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCheck {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.name("proceed")).click();
	Alert alert =driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	}

}
