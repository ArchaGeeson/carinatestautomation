package com.solvd.carinatestautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class FacebookLoginPage extends AbstractPage {

	@FindBy(id = "email")
	private ExtendedWebElement emailInputField;

	@FindBy(id = "pass")
	private ExtendedWebElement passwordInputField;

	@FindBy(xpath = "//button[@value='1']")
	private ExtendedWebElement loginButton;

	public FacebookLoginPage(WebDriver driver) {
		super(driver);
		// setPageAbsoluteURL("https://www.facebook.com");
	}

	public void login(String login, String password) {
		emailInputField.type(login);
		passwordInputField.type(password);
		loginButton.click();
	}

	public FacebookLoginErrorPage invalidLogin(String login, String password) {
		emailInputField.type(login);
		passwordInputField.type(password);
		loginButton.click();
		return new FacebookLoginErrorPage(driver);
	}

	@Override
	public void open() {
		super.openURL(Configuration.getEnvArg("facebookURL"));
	}
}
