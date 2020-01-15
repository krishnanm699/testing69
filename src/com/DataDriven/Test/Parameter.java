package com.DataDriven.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class Parameter {
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.contents.irctc.co.in/eticketing/userSignUp.jsf");
		
		// TODO Auto-generated method stub
		Xls_Reader reader = new Xls_Reader("C:\\Newselenium\\Naveen\\src\\com\\testdata\\irtcTestData.xlsx");
		int rowcount =reader.getRowCount("RegTestData");
		reader.addColumn("RegTestData", "Status");
		
		for(int rownum=2;rownum<=rowcount;rownum++)
		{
		String userid=	reader.getCellData("RegTestData", "userid",rownum);
		String pwd=	reader.getCellData("RegTestData", "password",rownum);
		String cpwd=	reader.getCellData("RegTestData", "confirmpassword",rownum);
		String sq=	reader.getCellData("RegTestData", "securityquestion",rownum);
		String sa=	reader.getCellData("RegTestData", "securityanswer",rownum);
		
	
		driver.findElement(By.xpath("//*[@id='userRegistrationForm:userName']")).clear();
		driver.findElement(By.xpath("//*[@id='userRegistrationForm:userName']")).sendKeys(userid);
		driver.findElement(By.xpath("//*[@id='userRegistrationForm:password']")).clear();
		driver.findElement(By.xpath("//*[@id='userRegistrationForm:password']")).sendKeys(pwd);
		//driver.findElement(By.xpath("//*[@id='userRegistrationForm:confpasword']")).clear();
		//driver.findElement(By.xpath("//*[@id='userRegistrationForm:confpasword']")).sendKeys(cpwd);
		Select select = new Select(driver.findElement(By.xpath("//*[@id='userRegistrationForm:securityQ']")));
		select.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id='userRegistrationForm:securityAnswer']")).clear();
		driver.findElement(By.xpath("//*[@id='userRegistrationForm:securityAnswer']")).sendKeys(sa);
		reader.setCellData("RegTestData", "Status", rownum, "Pass");
		}

	}

}
