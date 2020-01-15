package daraProvider;

import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utill.TestUtil;

public class LoginTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
	}
	@DataProvider
	public Object[][] logindata() throws InvalidFormatException 
	{
		Object data [][]  =TestUtil.getTestData("logindetails");
		return data;
	}

	@Test(dataProvider="logindata")
	public void loginTest(String username,String password)

	{
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);

		WebElement loginelement = driver.findElement(By.xpath("//*[contains(text(),'Login')]  "));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click()", loginelement);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}