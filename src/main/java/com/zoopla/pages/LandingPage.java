package com.zoopla.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.base.Base;

public class LandingPage extends Base{

	
	//@FindBy(className="search-input-location-placeholder-1 ")
	@FindBy(xpath="//input[@id='search-input-location']")
	WebElement searchTab;
	
	@FindBy(xpath="//button[@id='search-submit' and @type='submit']")
	WebElement searchButton;
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public PropertiesPage search(String cityName) {
		searchTab.sendKeys(cityName);
		
		//searchTab.sendKeys(Keys.ENTER);
		
	//	driver.findElement(By.xpath("//button[text()='Accept all cookies']")).click();
		searchButton.click();
		return new PropertiesPage();
	}
}
