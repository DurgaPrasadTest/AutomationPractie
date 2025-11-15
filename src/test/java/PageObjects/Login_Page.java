package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends Base_Page {

	public Login_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//h2[normalize-space()='Login to your account']")
	WebElement msgloginform;
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	WebElement Enteremail;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Enterpassword;
	
	@FindBy(xpath="(//button[normalize-space()='Login'])[1]")
	WebElement clickonLogin;
	
	@FindBy(xpath="//p[normalize-space()='Your email or password is incorrect!']")
	WebElement msglogiincorrect;
	
	@FindBy(xpath="//header[@id='header']//li[10]//a[1]")
	WebElement LoginUsername;
	
	public String verifyloginform()
	{
		return msgloginform.getText();
	}
	
	public void EnterLoginemail(String Lemail)
	{
		Enteremail.sendKeys(Lemail);
	}
	
	public void EnterLoginPassword(String Lpassword) {
		
		Enterpassword.sendKeys(Lpassword);
	}
	
	public void ClickonLogin() {
		clickonLogin.click();
	}
	
	public String verifyloginincorrectmessgae() {
		return msglogiincorrect.getText();
	}
	
public String verifyUserloggedin() {
		
		return (LoginUsername.getText());
	}

}
