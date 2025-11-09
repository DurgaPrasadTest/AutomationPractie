package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Page {
WebDriver driver;	
WebDriverWait wait;
	public Base_Page(WebDriver driver) {
		
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

}
