package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

	}

	@Test(priority = 1,groups="Title")
	public void GoogleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority = 2,groups="Logo")
	public void googlelogoTest() {

		Boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println(b);
	}

	@Test(priority = 3,groups="link")
	public void LinkTest() {

		Boolean b2 = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b2);

	}

	@Test(priority = 4,groups="Test")
	public void Test4() {
		System.out.println("Test4");
	}

	@Test(priority = 5,groups="Test")
	public void Test5() {
		System.out.println("Test5");
	}

	@Test(priority = 6,groups="Test")
	public void Test6() {
		System.out.println("Test6");
	}

	@AfterMethod

	public void tearDown() {
		driver.quit();

	}
}
