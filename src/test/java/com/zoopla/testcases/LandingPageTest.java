package com.zoopla.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.base.Base;
import com.zoopla.pages.LandingPage;
import com.zoopla.utility.Utils;

public class LandingPageTest extends Base {
	LandingPage landingPage;
	public LandingPageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		landingPage = new LandingPage();
	}
	
	@Test
	public void searchLocationTest() {
		Utils.acceptCookies();
		landingPage.search("London");
		System.out.println("Done");
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.findElement(By.xpath("//div[@class='ui-cookie-consent-choose__buttons']//button[text()='Accept all cookies']")).click();
		driver.close();
	}

}
