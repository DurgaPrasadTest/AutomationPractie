package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjects.Home_Page;
import PageObjects.Login_Page;
import PageObjects.User_Registration_Page;

public class TC002_Login_Page extends BaseClass {
	
	@Test(priority=1)
	public void VerifcationogLoginSuccess() {
		logger.info("********Login/Registration Page is Opened**********");
		User_Registration_Page urp=new User_Registration_Page(driver);
		SoftAssert softassert=new SoftAssert();
		logger.info("********Verification of Login/Registration Page is opened & click on signup**********");
		boolean actualogo=urp.verifylogo();
		softassert.assertEquals(actualogo,true);
		urp.clickOnSignup_login();
		logger.info("********Verification of Login form**********");
		Login_Page Loginpage=new Login_Page(driver);
		String loginform=Loginpage.verifyloginform();
		softassert.assertEquals(loginform, "Login to your account");
		logger.info("********Enter Email and Password**********");
		Loginpage.EnterLoginemail(P.getProperty("email"));
		Loginpage.EnterLoginPassword(P.getProperty("password"));
		logger.info("********Click on Login**********");
		Loginpage.ClickonLogin();
		logger.info("********Verification of login user**********");
		String loginusername=Loginpage.verifyUserloggedin();
		softassert.assertEquals(loginusername,P.getProperty("username"));
		Home_Page Hm=new Home_Page(driver);
		logger.info("********Logout and return Home Page**********");
		Hm.ClickOnLogout();
		
	}
	
	@Test(priority=2)
	public void VerifcationogLoginFail() {
		logger.info("********Login/Registration Page is Opened**********");
		User_Registration_Page urp=new User_Registration_Page(driver);
		SoftAssert softassert=new SoftAssert();
		logger.info("********Verification of Login/Registration Page is opened & click on signup**********");
		boolean actualogo=urp.verifylogo();
		softassert.assertEquals(actualogo,true);
		urp.clickOnSignup_login();
		logger.info("********Verification of Login form**********");
		Login_Page Loginpage=new Login_Page(driver);
		String loginform=Loginpage.verifyloginform();
		softassert.assertEquals(loginform, "Login to your account");
		logger.info("********Enter correct email and incorrect password**********");
		Loginpage.EnterLoginemail(P.getProperty("email"));
		Loginpage.EnterLoginPassword(randomAlphaNumberic());
		logger.info("********Click on Login**********");
		Loginpage.ClickonLogin();
		logger.info("********Verification of login Failure**********");
		String loginfailmsg=Loginpage.verifyloginincorrectmessgae();
		softassert.assertEquals(loginfailmsg,"Your email or password is incorrect!");
		
	}

}
