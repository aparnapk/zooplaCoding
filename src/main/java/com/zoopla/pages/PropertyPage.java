package com.zoopla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.base.Base;

public class PropertyPage extends Base {
	@FindBy(xpath = "//div[@class='ui-agent__text']//h4")
	WebElement agentName;
	@FindBy(xpath = "//div[@class='ui-agent__logo']//img")
	WebElement agentLogo;
	@FindBy(xpath = "//p[@class='ui-agent__tel ui-agent__text']//a[@class='ui-link']")
	WebElement agentNumber;

	public PropertyPage() {
		PageFactory.initElements(driver, this);
	}

	public String getAgentName() {
		return agentName.getText();
	}

	public String getAgentLogo() {
		return agentLogo.getAttribute("alt");
	}

	public String getAgentNumber() {
		return agentNumber.getAttribute("href");
	}

	public AgentDetailsPage clickOnAgentName() {
		agentName.click();
		return new AgentDetailsPage();
	}
}
