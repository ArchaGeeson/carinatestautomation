package com.solvd.carinatestautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class SonyPhoneInfoPage extends AbstractPage{

	@FindBy(xpath = "//div[@id='specs-list']/table[5]/tbody/tr[1]/td[2]")
	private ExtendedWebElement osText;
	
	@FindBy(xpath = "//div[@id='specs-list']/table[6]/tbody/tr[2]/td[2]")
	private ExtendedWebElement memoryInternalText;
	
	@FindBy(xpath = "//div[@id='specs-list']/table[6]/tbody/tr[1]/td[2]")
	private ExtendedWebElement memoryCardText;
	
	@FindBy(xpath = "//div[@id='specs-list']/table[9]/tbody/tr[1]/td[2]")
	private ExtendedWebElement soundText;
	
	
	public SonyPhoneInfoPage(WebDriver driver) {
		super(driver);
		
	}

	public String getOSText() {
		return osText.getText();
	}
	
	public String getMemoryText() {
		return memoryCardText.getText() + memoryInternalText.getText() ;
	}
	public String getSoundText() {
		return soundText.getText();
	}
	
}
