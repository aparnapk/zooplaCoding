package com.zoopla.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.base.Base;
import com.zoopla.pages.AgentDetailsPage;
import com.zoopla.pages.LandingPage;
import com.zoopla.pages.PropertiesPage;
import com.zoopla.pages.PropertyPage;
import com.zoopla.utility.Utils;

public class AgentDetailsPageTest extends Base {
	LandingPage landingPage;
	PropertiesPage propertiesPage;
	PropertyPage propertyPage;
	AgentDetailsPage agentDetailsPage;
	String expectedAgentName;

	public AgentDetailsPageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {
		initialization();
		Utils.acceptCookies();
		landingPage = new LandingPage();
		propertiesPage = landingPage.search("London");
		propertyPage = propertiesPage.clickOnFifthElement();
		expectedAgentName = propertyPage.getAgentName();
		agentDetailsPage = propertyPage.clickOnAgentName();

	}

	@Test
	public void verifyAgentDetailsTest() {
		Assert.assertEquals(agentDetailsPage.AgentNameOnAgentPage(), expectedAgentName, "Names are not matching");
	}

	@AfterMethod
	public void tearDown() {
		// driver.close();
	}

}
