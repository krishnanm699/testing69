package com.test;

import org.testng.annotations.Test;

public class TestNFgFeatures {
	
	@Test()
	public void LoginTest() {
		System.out.println("LoginTest");
		int i =9/0;
	}

	@Test(dependsOnMethods="LoginTest")
	public void HomeTest() {
		System.out.println("HomeTest");
	}
	@Test(dependsOnMethods="LoginTest")
	public void SearchPageTest() {
		System.out.println("SearchPageTest");
	}
}
