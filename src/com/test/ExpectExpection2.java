package com.test;

import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;

public class ExpectExpection2 {

		
		@Test(expectedExceptions=NumberFormatException.class)
		public void ExpectedExceptionTest()
		{
			String s ="100A";
			Integer.parseInt(s);
			
		}

}
