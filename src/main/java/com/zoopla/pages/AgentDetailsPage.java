package com.zoopla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.base.Base;

public class AgentDetailsPage extends Base {
	@FindBy(xpath = "//h1[@class='bottom-half']/b[1]")
	WebElement agentName;

	public AgentDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	public String AgentNameOnAgentPage() {
		return agentName.getText();
	}

}
