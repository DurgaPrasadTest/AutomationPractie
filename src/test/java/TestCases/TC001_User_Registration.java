package TestCases;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjects.User_Registration_Page;


public class TC001_User_Registration extends BaseClass {
	
	@Test
	public void VerifyUserRegistration() {
		
		
		User_Registration_Page urp=new User_Registration_Page(driver);
		SoftAssert softassert=new SoftAssert();
		boolean actualogo=urp.verifylogo();
		softassert.assertEquals(actualogo,true);
		urp.clickOnSignup_login();
		String actualformmsg=urp.verifysigupform();
		softassert.assertEquals(actualformmsg,"New User Signup!");
		String Uname=urp.EnterName(randomstring().toUpperCase());
		urp.EnterEmail(randomstring().toUpperCase()+"@gmail.com");
		urp.clickOnSignup();
		String actualaccountinfomsg=urp.verifyaccountinformationform();
		softassert.assertEquals(actualaccountinfomsg,"ENTER ACCOUNT INFORMATION");
		urp.clickOnTitle();
		urp.EnterPassword(randomAlphaNumberic());
		urp.SelectDay("1");
		urp.SelectMonth("March");
		urp.SelectYear("1996");
		urp.clicknewsletter();
		urp.clickspecicaloffers();
		urp.EnterFirstName(randomstring().toUpperCase());
		urp.EnterLastName(randomstring().toUpperCase());
		urp.EnterCompanyName(randomstring().toUpperCase());
		urp.EnterAdd1(randomstring().toUpperCase());
		urp.EnterAdd2(randomstring().toUpperCase());
		urp.SelectCountry("Canada");
		urp.EnterState(randomstring().toUpperCase());
		urp.EnterCity(randomstring().toUpperCase());
		urp.EnterZipcode(randomnumber());
		urp.EnterMobileNumber(randomnumber());
		urp.clickOnCreateaccount();
		String accountcreate=urp.verifyaccountcreated();
		softassert.assertEquals(accountcreate,"ACCOUNT CREATED!");
		urp.clickOncontinue();
		String userverify=urp.verifyUserloggedin();
		softassert.assertEquals(userverify,Uname);
		softassert.assertAll();
		
	}
	

}
