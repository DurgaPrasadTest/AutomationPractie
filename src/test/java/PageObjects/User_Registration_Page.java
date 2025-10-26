package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Registration_Page extends Base_Page {
	
	public User_Registration_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//img[@alt=\"Website for automation practice\"]")
	WebElement logo;
	
	@FindBy(xpath="//a[@href=\"/login\"]")
	WebElement linkOnSignup_Login;
	
	@FindBy(xpath="//h2[normalize-space()='New User Signup!']")
	WebElement txtMsgNewUserSignup;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement input_Name;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement input_Email;
	
	@FindBy(xpath="//b[normalize-space()='Enter Account Information']")
	WebElement txtMsg_EnterAccountInformation;
	
	@FindBy(xpath="//input[@id='id_gender1']")
	WebElement radiBtnTitle;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement inputPassword;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement drpDay;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement drpMonth;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement drpYear;
	
	@FindBy(xpath="//input[@id='newsletter']")
	WebElement checkboxSignupforournewsletter;
	
	@FindBy(xpath="//input[@id='optin']")
	WebElement checkboxReceivespecialoffersfromourpartners;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement inputFirstname;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement inputLastname;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement inputCompanyName;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement inputaddress1;
	
	@FindBy(xpath="//input[@id='address2']")
	WebElement inputaddress2;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement drpCountry;
	
	@FindBy(xpath="//input[@id='state']")
	WebElement inputState;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement inputCity;
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement inputZipcode;
	
	@FindBy(xpath="//input[@id='mobile_number']")
	WebElement inputMobileNumber;
	
	@FindBy(xpath="//button[@data-qa=\"create-account\"]")
	WebElement btnCreateaccount;
	
	
}

