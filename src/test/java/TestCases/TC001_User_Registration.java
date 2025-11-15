package TestCases;


import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjects.User_Registration_Page;


public class TC001_User_Registration extends BaseClass {
	
	@Test
	public void VerifyUserRegistration() {
		
		logger.info("********Login/Registration Page is Opened**********");
		User_Registration_Page urp=new User_Registration_Page(driver);
		SoftAssert softassert=new SoftAssert();
		logger.info("********Verification of Login/Registration Page is opened & click on signup**********");
		boolean actualogo=urp.verifylogo();
		softassert.assertEquals(actualogo,true);
		urp.clickOnSignup_login();
		logger.info("********Verification of Signup form**********");
		String actualformmsg=urp.verifysigupform();
		softassert.assertEquals(actualformmsg,"New User Signup!");
		logger.info("********Enter Username & Password**********");
		String Uname=urp.EnterName(randomstring().toUpperCase());
		urp.EnterEmail(randomstring().toUpperCase()+"@gmail.com");
		logger.info("********Click on Signup**********");
		urp.clickOnSignup();
		logger.info("********Verification of Account information**********");
		String actualaccountinfomsg=urp.verifyaccountinformationform();
		softassert.assertEquals(actualaccountinfomsg,"ENTER ACCOUNT INFORMATION");
		logger.info("********Enter all account information details**********");
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
		logger.info("********Click on create account**********");
		urp.clickOnCreateaccount();
		logger.info("********Verification of account created**********");
		String accountcreate=urp.verifyaccountcreated();
		softassert.assertEquals(accountcreate,"ACCOUNT CREATED!");
		logger.info("*******Click on Continue**********");
		urp.clickOncontinue();
		logger.info("********Verication user logged into to account**********");
		String userverify=urp.verifyUserloggedin();
		softassert.assertEquals(userverify,"Logged in as "+Uname);
		logger.info("********Click on delete account**********");
		urp.clickondeleteaccount();
		logger.info("********Verification of delete account**********");
		String accountdeletemsg=urp.verifyaccountdeleted();
		softassert.assertEquals(accountdeletemsg, "ACCOUNT DELETED!");
		logger.info("********Click on Continue and return to Home Page**********");
		urp.deleteclikoncontinue();
		softassert.assertAll();
		
	}
	

}
