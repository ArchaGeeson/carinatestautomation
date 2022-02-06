package com.solvd.carinatestautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class GSMArenaSonyPhonesPage extends AbstractPage{
	
	@FindBy(linkText = "Xperia Pro")
	private ExtendedWebElement xperiaPro;
	
	@FindBy(linkText = "Xperia 1")
	private ExtendedWebElement xperiaOne;
	
	@FindBy(linkText = "Xperia 5")
	private ExtendedWebElement xperiaFive;
	
	public GSMArenaSonyPhonesPage(WebDriver driver) {
		super(driver);
		
	}

	public SonyPhoneInfoPage getXperiaPro() {
		xperiaPro.click();
		return new SonyPhoneInfoPage(driver);
	}
	
	public SonyPhoneInfoPage getXperiaOne() {
		xperiaOne.click();
		return new SonyPhoneInfoPage(driver);
	}
	
	public SonyPhoneInfoPage getXperiaFive() {
		xperiaFive.click();
		return new SonyPhoneInfoPage(driver);
	}
}
