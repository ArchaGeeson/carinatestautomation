package com.solvd.carinatestautomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;

public class GSMSonyXperiaTest implements IAbstractTest {

	@Test(priority = 2)
	@MethodOwner(owner = "archa")
	public void xperiaProTest() {
		GSMArenaHomePage homePage = new GSMArenaHomePage(getDriver());
		homePage.open();
		GSMArenaSonyPhonesPage sonyPhones = homePage.getSonyPhonesPage();
		SonyPhoneInfoPage xperiaProInfo = sonyPhones.getXperiaPro();
		Assert.assertEquals(xperiaProInfo.getOSText(), "Android 10", "OS mismatch");
		Assert.assertEquals(xperiaProInfo.getMemoryText(), "microSDXC (uses shared SIM slot)512GB 12GB RAM",
				"mismatch");
		Assert.assertEquals(xperiaProInfo.getSoundText(), "Yes, with stereo speakers", "mismatch");
	}

	@Test(priority = 1)
	@MethodOwner(owner = "archa")
	public void xperiaOneTest() {
		GSMArenaHomePage homePage = new GSMArenaHomePage(getDriver());
		homePage.open();
		GSMArenaSonyPhonesPage sonyPhones = homePage.getSonyPhonesPage();
		SonyPhoneInfoPage xperiaOneInfo = sonyPhones.getXperiaOne();
		Assert.assertEquals(xperiaOneInfo.getOSText(), "Android 9.0 (Pie), upgradable to Android 11", "OS mismatch");
		Assert.assertEquals(xperiaOneInfo.getMemoryText(), "microSDXC (uses shared SIM slot) - dual SIM model only64GB 6GB RAM, 128GB 6GB RAM",
				"mismatch");
		Assert.assertEquals(xperiaOneInfo.getSoundText(), "Yes, with stereo speakers", "mismatch");
	}

	@Test(priority = 0)
	@MethodOwner(owner = "archa")
	public void xperiaFiveTest() {
		GSMArenaHomePage homePage = new GSMArenaHomePage(getDriver());
		homePage.open();
		GSMArenaSonyPhonesPage sonyPhones = homePage.getSonyPhonesPage();
		SonyPhoneInfoPage xperiaFiveInfo = sonyPhones.getXperiaFive();
		Assert.assertEquals(xperiaFiveInfo.getOSText(), "Android 9.0 (Pie), upgradable to Android 11", "OS mismatch");
		Assert.assertEquals(xperiaFiveInfo.getMemoryText(),"microSDXC (uses shared SIM slot)128GB 6GB RAM", "mismatch");
		Assert.assertEquals(xperiaFiveInfo.getSoundText(), "Yes, with stereo speakers", "mismatch");
	}

}
