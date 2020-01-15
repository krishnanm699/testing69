package com.test;

import org.testng.annotations.Test;

public class ExpectionTimeOut {
	
	@Test(invocationCount=2,expectedExceptions=NumberFormatException.class)
	public void infintloop()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}

}
