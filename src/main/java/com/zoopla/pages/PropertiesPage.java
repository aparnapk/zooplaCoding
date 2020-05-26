package com.zoopla.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.base.Base;

public class PropertiesPage extends Base {

	@FindBy(xpath = "//a[@class='listing-results-price text-price']")
	List<WebElement> price;

	public PropertiesPage() {
		PageFactory.initElements(driver, this);
	}

	public List<String> getPriceValues() {
		ArrayList<String> ar = new ArrayList<String>();

		for (WebElement i : price) {
			ar.add(i.getText());

		}

		return ar;

	}

	public PropertyPage clickOnFifthElement() {
		// ArrayList<String> ar = new ArrayList<String>();
		for (int i = 0; i < price.size(); i++) {
			price.get(5).click();

		}
		return new PropertyPage();
	}

}
