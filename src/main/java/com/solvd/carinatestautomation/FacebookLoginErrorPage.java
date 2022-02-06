package com.solvd.carinatestautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class FacebookLoginErrorPage extends AbstractPage{
	
	@FindBy(xpath = "//div[@id='email_container']/div[2]")
	private ExtendedWebElement errorText;

	
	public FacebookLoginErrorPage(WebDriver driver) {
		super(driver);
		
	}

	public String getErrorMessage() {
		return errorText.getText();
	}
	
}
