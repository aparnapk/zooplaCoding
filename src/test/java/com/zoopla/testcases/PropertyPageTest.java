package com.zoopla.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.base.Base;
import com.zoopla.pages.AgentDetailsPage;
import com.zoopla.pages.LandingPage;
import com.zoopla.pages.PropertiesPage;
import com.zoopla.pages.PropertyPage;
import com.zoopla.utility.Utils;

public class PropertyPageTest extends Base {
	LandingPage landingPage;
	PropertiesPage propertiesPage;
	PropertyPage propertyPage;
	AgentDetailsPage agentDetailsPage;

	public PropertyPageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {
		initialization();
		Utils.acceptCookies();
		landingPage = new LandingPage();
		propertiesPage = landingPage.search("London");
		propertyPage = propertiesPage.clickOnFifthElement();

	}

	@Test(priority = 0)
	public void printAgentDetailsTest() {
		System.out.println("Agent name" + propertyPage.getAgentName());
		System.out.println("Agent Logo" + propertyPage.getAgentLogo());
		System.out.println("Agent number" + propertyPage.getAgentNumber());
	}

	@Test(priority = 1)
	public void verifyAgentDetailsTest() {
		agentDetailsPage = propertyPage.clickOnAgentName();
	}

	@AfterMethod
	public void tearDown() {
		// driver.close();
	}
}
