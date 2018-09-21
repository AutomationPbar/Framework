package com.qa.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fw.qa.baseclass.TestBase;

public class SampleTestCase extends TestBase{
	
	@BeforeTest
	public void setup(){
		
		initialization();
		
	}

	@Test
	public void launch(){
		
		System.out.println("testing testing");
		Assert.assertEquals(true, true);
		
	}
	
	@AfterTest
	public void teardown(){
		
		driver.close();
		driver.quit();
	}
}
