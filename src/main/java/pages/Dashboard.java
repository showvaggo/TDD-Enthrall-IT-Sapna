package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import constants.Attribute;
import static common.CommonActions.*;
import static common.CommonWaits.*;

public class Dashboard {
	/*
	 * Test 1) Click Return Site, validate Homepage again Test 2) click on profile
	 * photo and logout to see you can logout Test 3) Test all aside element except
	 * "Automation", When they redirect, please validate title, current url and
	 * header if present. Test 4) Click Automation and go to form, When they
	 * redirect, please validate title, current url and header, sub header etc if
	 * present.
	 * 
	 * Test 5) Each field should be separtely tested based on requirement Test 6)
	 * Submit without any data Test 7) test back button Test 8) test cancel button
	 * Test 9) Submit with all data (happy path), validate success message
	 * 
	 */
	WebDriver driver;
	WebDriverWait wait;

	public Dashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@FindBy(xpath = "//a[text()='Return site']")
	WebElement returnSite;

	@FindBy(xpath = "//span[text()=' Dashboard']")
	WebElement dashboard;

	// @FindBy(xpath = "//a[@id='dashboard-link']")
	// WebElement dashboard;
	@FindBy(xpath = "//span[text()='Profile']")
	WebElement profile;

	@FindBy(xpath = "//span[text()='Add Course']")
	WebElement add_course;

	@FindBy(xpath = "//span[text()='Quiz List']")
	WebElement quiz_list;

	@FindBy(xpath = "//span[text()='Home Work']")
	WebElement home_work;

	@FindBy(xpath = "//span[text()='Codding Challenge']")
	WebElement cording_challenge;

	@FindBy(xpath = "//span[text()='Exam']")
	WebElement exam;

	@FindBy(xpath = "//span[text()='Bootcamp']")
	WebElement bootcamp;

	@FindBy(xpath = "//span[text()='Class Notes']")
	WebElement class_note;

	@FindBy(xpath = "//span[text()='Class Schedule']")
	WebElement class_schedule;

	@FindBy(xpath = "//span[text()='Join The Class']")
	WebElement join_the_class;

	@FindBy(xpath = "//span[text()='Class recording']")
	WebElement class_recording;

	@FindBy(xpath = "//span[text()='Others']")
	WebElement others;

	public void dashboard_page_validetion() {
		pause(3000);
		clickElement(dashboard);
		pause(1000);
		elementEnabled(dashboard);
		pause(1000);
		verifyTitle(driver, "Enthrall IT");
		pause(3000);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");
		pause(4000);
	}

}
