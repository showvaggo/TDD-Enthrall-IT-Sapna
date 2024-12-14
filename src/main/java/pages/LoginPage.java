package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	/*
	 Create Constructor
	 Create Web Element	 
	 Create method to test
	 */
	WebDriver driver;
	WebDriverWait wait;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	/*
	 1) Click Login from header
	 2) The page will direct to Login Page, validate title, current url, header etc.
	 3) provide your email and password and click submit button
	 4) When click a button make sure, the button is enabled, verify text and them click, verify logo, current url, title, header
	 */

}
