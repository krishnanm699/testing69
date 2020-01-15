package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elmentvisibility {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		boolean b1=driver.findElement(By.xpath("//*[@name='proceed']")).isDisplayed();
		System.out.println(b1);
		boolean b2=driver.findElement(By.xpath("//*[@name='proceed']")).isEnabled();
		System.out.println(b2);
		boolean b3=driver.findElement(By.xpath("//*[@id='remember']")).isSelected();
		System.out.println(b3);
	}
}
