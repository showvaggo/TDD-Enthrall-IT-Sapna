package pages;

import static common.CommonActions.*;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	WebDriverWait wait;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@FindBy(xpath = "//a[@id='logo-id']")
	WebElement logo;

	@FindBy(xpath = "//a[@class='nav-link' and @id='login-link']")
	WebElement loginHeaderElement;

	@FindBy(xpath = "//h2[text()='Login into your account']")
	WebElement loginPageText;

	@FindBy(xpath = "//input[@id='emails']")
	WebElement useremail;

	@FindBy(xpath = "//input[@id='password']")
	WebElement userpassword;

	@FindBy(xpath = "//button[@id='login' and @name='login']")
	WebElement userlogin;

	public void click_login_button() {
		pause(3000);
		clickElement(loginHeaderElement);
		pause(4000);
	}

	public void logoValidation() {
		pause(4000);
		elementDisplayed(logo);
		clickElement(logo);
		pause(4000);
	}

	public void titleValidation() {
		pause(3000);
		verifyTitle(driver, "Enthrall IT");
		pause(4000);
	}

	public void login_page_url_validation() {
		pause(3000);
		clickElement(logo);
		verifyCurrentUrl(driver, "https://enthrallit.com/");
		verifyTitle(driver, "Enthrall IT");
		pause(4000);
		clickElement(loginHeaderElement);
		pause(3000);

	}

	public void login_page_text_validation() {
		pause(4000);
		verifyTextOfTheWebElement(loginPageText, "Login into your account");

	}

	public void login_steps_validation() {
		login_page_url_validation();
		pause(3000);
		elementEnabled(useremail);
		clickElement(useremail);
		pause(2000);
		inputText(useremail, "sr8950601@gmail.com");
		pause(2000);
		inputText(userpassword, "Saffollow?!1956");
		pause(4000);
		clickElement(userlogin);
		pause(3000);
		verifyTitle(driver, "Enthrall IT - Dashboard");

	}
}
