package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBascies {

	// @ pre-condtion annotation -Stating with@Before
	@BeforeSuite

	public void SetUp() {// 1
		System.out.println("Setup System property for chrome");
	}

	@BeforeTest // 2

	public void LaunchBrowser() {
		System.out.println("aunch chrome Browser");
	}

	@BeforeClass//3
	public void login() {
		System.out.println("login to app");
	}

	@BeforeMethod//4
	public void Enterurl() {
		System.out.println("Enter url");
	}

	// @testcase -stating with @Test

	@Test//5
	public void GoogltTitleTest() {
		System.out.println("Google Title Test");
	}
	@Test//5
	public void SearchTest() {
		System.out.println("SearchTest");
	}
	// @ post-condtion annotation -End with@After
	@AfterMethod//6

	public void logout() {
		System.out.println("logout app");
	}

	@AfterClass//7

	public void closebrowser() {
		System.out.println("closeBrowser");
	}


	@AfterTest//8

	public void Deletecookies() {
		System.out.println("DeleteAllcookies");
	}

	@AfterSuite//9

	public void generateReports() {
		System.out.println("GenerateReports");
	}

}
