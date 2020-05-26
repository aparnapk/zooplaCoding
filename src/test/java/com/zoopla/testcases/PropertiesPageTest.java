package com.zoopla.testcases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.base.Base;
import com.zoopla.pages.LandingPage;
import com.zoopla.pages.PropertiesPage;
import com.zoopla.pages.PropertyPage;
import com.zoopla.utility.Utils;

public class PropertiesPageTest extends Base {
	LandingPage landingPage;
	PropertiesPage propertiesPage;

	public PropertiesPageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {
		initialization();
		Utils.acceptCookies();
		landingPage = new LandingPage();
		propertiesPage = landingPage.search("London");
	}

	@Test(priority = 0)
	public void printPropertiesPriceTest() {
		List<String> sr = propertiesPage.getPriceValues();
		for (String s : sr) {
			s = s.replaceAll("[^0-9]", "");
			System.out.println(s);
		}

	}

	@Test(priority = 1)
	public void printPriceInReverseOrderTest() {
		List<String> sr = propertiesPage.getPriceValues();
		List<Integer> inte = new ArrayList<Integer>();
		for (String s : sr) {
			int va = getIntVal(s);
			inte.add(va);

		}

		System.out.println("sort in ascen");
		Collections.sort(inte);
		/*
		 * for (int l : inte) { System.out.println(l); }
		 */
		inte.forEach(i -> System.out.println(i));

		Collections.reverse(inte);
		System.out.println("rev sort");
		/*
		 * for (int k : inte) { System.out.println(k); }
		 */
		inte.forEach(k -> System.out.println(k));

	}

	public static int getIntVal(String s) {
		String S = s.replaceAll("[^0-9]", "");
		int h = Integer.parseInt(S);
		return h;

	}

	@Test(priority = 2)
	public PropertyPage clickOnFifthPropertyTest() {
		propertiesPage.clickOnFifthElement();
		return new PropertyPage();
	}

	@AfterMethod
	public void tearDown() {
		// driver.close();
	}
}
