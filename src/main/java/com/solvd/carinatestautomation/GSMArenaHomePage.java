package com.solvd.carinatestautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class GSMArenaHomePage extends AbstractPage{
	
	@FindBy(xpath = "//*[@id=\"body\"]/aside/div[1]/ul/li[5]/a")
	
	private ExtendedWebElement sonyText;
	
	public GSMArenaHomePage(WebDriver driver) {
		super(driver);
	}

	public GSMArenaSonyPhonesPage getSonyPhonesPage() {
		sonyText.click();
		return new GSMArenaSonyPhonesPage(driver);
	}

	@Override
	public void open() {
		super.openURL(Configuration.getEnvArg("DEMO.base"));
	}
}
