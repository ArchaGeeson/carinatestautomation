package com.solvd.carinatestautomation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;

public class FacebookLoginTest implements IAbstractTest {

	@Test(dataProvider = "InvalidCredentials")
	@MethodOwner(owner = "archa")
	public void facebookLoginTest(String TUID, String email, String password) {
		FacebookLoginPage fbLogin = new FacebookLoginPage(getDriver());
		fbLogin.open();
		FacebookLoginErrorPage fbErrorLogin = fbLogin.invalidLogin(email, password);
		Assert.assertEquals(fbErrorLogin.getErrorMessage(),
				"The email or mobile number you entered isn’t connected to an account. Find your account and log in.",
				"Error texts  are not same for TUID:" + TUID + "1111");

	}

	@DataProvider(parallel = false, name = "InvalidCredentials")
	public static Object[][] dataprovider() {
		return new Object[][] { { "TUID: Data1", "sbajhdjk@gmail.com", "jhasvdhuas" },
				{ "TUID: Data2", "asjfyubj@gmail.com", "hsgjahg" },
				{ "TUID: Data3", "shgdhas@yahoo.com", "jshgduys" } };
	}
	
	

}
