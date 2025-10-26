package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(xpath="//b[normalize-space()='Account Created!']")
	WebElement txtMsgAccountCreated;
	
	@FindBy(xpath="//a[@data-qa=\"continue-button\"]")
	WebElement btnContinue;
	
	@FindBy(xpath="//b[normalize-space()='TesterUser']")
	WebElement txtUsername;
	
	public void verifylogo() {
		logo.isDisplayed();
	}
	
	public void clickOnSignup_login() {
		linkOnSignup_Login.click();
	}
	
	public void verifyaccountinformationform() {
		txtMsg_EnterAccountInformation.getText();
	}
	
	public void EnterName(String name) {
		input_Name.sendKeys(name);
	}
	
	public void EnterEmail(String email) {
		input_Email.sendKeys(email);
	}
	
	public void verifysigupform() {
		txtMsgNewUserSignup.getText();
	}
	
	public void clickOnTitle() {
		radiBtnTitle.click();
	}
	
	public void EnterPassword(String password) {
		inputPassword.sendKeys(password);
	}
	
	public void SelectDay(String day) {
		Select Date=new Select(drpDay);
		Date.selectByVisibleText(day);
		
	}
	
	public void SelectMonth(String month) {
		Select Month=new Select(drpMonth);
		Month.selectByVisibleText(month);
		
	}
	
	public void SelectYear(String year) {
		Select Year=new Select(drpYear);
		Year.selectByVisibleText(year);
		
	}
	
	public void clicknewsletter() {
		checkboxSignupforournewsletter.click();
	}
	
	public void clickspecicaloffers() {
		checkboxReceivespecialoffersfromourpartners.click();
	}
	
	public void EnterFirstName(String fname) {
		inputFirstname.sendKeys(fname);
	}
	
	public void EnterLastName(String lname) {
		inputLastname.sendKeys(lname);
	}
	
	public void EnterCompanyName(String companyname) {
		inputCompanyName.sendKeys(companyname);
	}
	
	public void EnterAdd1(String address1) {
		inputaddress1.sendKeys(address1);
	}
	
	public void EnterAdd2(String address2) {
		inputaddress2.sendKeys(address2);
	}
	
	public void SelectCountry(String country) {
		Select Country=new Select(drpCountry);
		Country.selectByVisibleText(country);
		
	}
	
	public void EnterState(String state) {
		inputState.sendKeys(state);
	}
	
	public void EnterCity(String city) {
		inputCity.sendKeys(city);
	}
	
	public void EnterZipcode(String Zcode) {
		inputZipcode.sendKeys(Zcode);
	}
	
	public void EnterMobileNumber(String phoneNumber) {
		inputMobileNumber.sendKeys(phoneNumber);
	}
	
	public void clickOnCreateaccount() {
		btnCreateaccount.click();
	}
	
	public void verifyaccountcreated() {
		txtMsgAccountCreated.getText();
	}
	
	public void clickOncontinue() {
		btnContinue.click();
	}
	
	public void verifyUserloggedin() {
		txtUsername.getText();
	}
	

}

