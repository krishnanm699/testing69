package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parientid =it.next();
		System.out.println(parientid);
		String Childid =it.next();
		System.out.println(Childid);
		driver.switchTo().window(Childid);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parientid);
		System.out.println(driver.getTitle());
		
	}

}
