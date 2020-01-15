package com.DataDriven.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {
	public static void main(String[] args) {
		// get testdata from xls

		Xls_Reader reader = new Xls_Reader("C:\\Newselenium\\Naveen\\src\\com\\testdata\\irtcTestData.xlsx");
		String userid = reader.getCellData("RegTestData", "userid", 2);
		System.out.println(userid);
		String pwd = reader.getCellData("RegTestData", "password", 2);
		System.out.println(pwd);
		String cpwd = reader.getCellData("RegTestData", "confirmpassword", 2);
		System.out.println(cpwd);
		String sq = reader.getCellData("RegTestData", "securityquestion", 2);
		System.out.println(sq);
		String sa = reader.getCellData("RegTestData", "securityanswer", 2);
		System.out.println(sa);

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.contents.irctc.co.in/eticketing/userSignUp.jsf");

		driver.findElement(By.xpath("//*[@id='userRegistrationForm:userName']")).sendKeys(userid);
		driver.findElement(By.xpath("//*[@id='userRegistrationForm:password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id='userRegistrationForm:confpasword']")).sendKeys(cpwd);
		Select select = new Select(driver.findElement(By.xpath("//*[@id='userRegistrationForm:securityQ']")));
		select.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id='userRegistrationForm:securityAnswer']")).sendKeys(sa);
	}
}
