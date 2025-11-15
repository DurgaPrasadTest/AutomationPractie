package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends Base_Page{

	public Home_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement clickonlogout;
	
	public void ClickOnLogout() {
		clickonlogout.click();
	}

}
