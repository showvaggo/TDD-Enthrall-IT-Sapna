package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import constants.Attribute;
import static common.CommonActions.*;
import static common.CommonWaits.*;

import java.time.Duration;

public class HomePage {
	/*
	 * Create Constructor Create Web Element Create method to test
	 */
	WebDriver driver;
	WebDriverWait wait;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@FindBy(xpath = "//a[@id='logo-id']")
	WebElement logo;

	@FindBy(xpath = "//li[@id='home' and @name='home']")
	WebElement homeHeaderElement;

	@FindBy(xpath = "//a[@id='home' and @name='home']")
	WebElement homeFooterElement;

	@FindBy(xpath = "//li[@id='courses']")
	WebElement courseHeaderElement;

	@FindBy(xpath = "//li[@id='courses' and @name='courses']")
	WebElement courseFooterElement;

	@FindBy(xpath = "//li[@id='mentors']")
	WebElement mentorHeaderElement;

	@FindBy(xpath = "//li[@id='mentors']")
	WebElement mentorFooterElement;

	@FindBy(xpath = "//li[@id='alumni' and @name='alumni']")
	WebElement alumniHeaderElement;

	@FindBy(xpath = "//li[@id='alumni' and @name='alumni']")
	WebElement alumniFooterElement;

	@FindBy(xpath = "//li[@id='about us']")
	WebElement aboutUsHeaderElement;

	@FindBy(xpath = "//li[@id='about us']")
	WebElement aboutUsFooterElement;

	@FindBy(xpath = "//a[@class='nav-link' and @id='login-link']")
	WebElement loginButtonHeaderElement;

	@FindBy(xpath = "//a[text()='Login' and @id='login-link' and @ name='login-link' and @ class='nav-link']")
	WebElement loginButtonFooterElement;

	@FindBy(xpath = "//a[@id='enroll_now']")
	WebElement enrollNowFooterElement;

	@FindBy(xpath = "//p[text()='info@enthrallit.com']")
	WebElement emailAddress;

	@FindBy(xpath = "//p[@class='phone-number']")
	WebElement phoneNumberElement;

	@FindBy(xpath = "//h2[text()='Contact Us']")
	WebElement contuctUsElement;

	@FindBy(xpath = "//h2[text()='Do You Have Any Questions']")
	WebElement doYouHaveAnyQuestionHeaderElement;

	@FindBy(xpath = "//input[@id='id_name']")
	WebElement nameFromDoYouHaveAnyQuestionHeaderElement;

	@FindBy(xpath = "//input[@id='id_email']")
	WebElement emailFromDoYouHaveAnyQuestionHeaderElement;

	@FindBy(xpath = "//input[@id='id_subject']")
	WebElement subjectFromDoYouHaveAnyQuationHeaderElement;

	@FindBy(xpath = "//input[@id='id_experiance']")
	WebElement experianceFromDoYouHaveAnyQuestionHeaderElement;

	@FindBy(xpath = "//textarea[@id='id_message']")
	WebElement massageFromDoYouHaveAnyQuestionHeaderElement;

	@FindBy(xpath = "//button[text()='send now']")
	WebElement sendNowFromDoYouHaveAnyQuestionHeaderElement;

	@FindBy(xpath = "//h3[@id='find-us']")
	WebElement findUsFromHomePagElement;

	/*
	 * 1) is the logo displayed? 2) What is the title? 3) Header validation for
	 * rest: All the button like Home, courses, Mentors, Alumni, About Us, Login
	 * enroll Now button, phone number, Id. You have to find out the web element and
	 * click them to see if they are redirecting to the page. 4) When they redirect,
	 * please validate title, current url and header if present. 5) Validate Footer
	 * for Home, courses, Mentors, Alumni, About Us, Login, enroll Now button 6)
	 * Scroll down and go to Contact Us. Create method for
	 * "fill out the form and submit, validate the success or error message" and
	 * test
	 */
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

	public void validationForAllHeaderMenu() {

		pause(4000);
		elementEnabled(homeHeaderElement);
		clickElement(homeHeaderElement);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/");

		pause(4000);
		elementEnabled(courseHeaderElement);
		clickElement(courseHeaderElement);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/courses/");

		pause(3000);
		elementEnabled(mentorHeaderElement);
		clickElement(mentorHeaderElement);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/mentors/");

		pause(3000);
		elementEnabled(alumniHeaderElement);
		clickElement(alumniHeaderElement);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/alumni/");

		pause(3000);
		elementEnabled(aboutUsHeaderElement);
		clickElement(aboutUsHeaderElement);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/about/");

		pause(3000);
		elementEnabled(loginButtonHeaderElement);
		clickElement(loginButtonHeaderElement);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");

	}

	public void scroll_into_redirect_page_and_validate_title_current_url_and_header() {
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, contuctUsElement);

		pause(4000);
		validationOfHeader(doYouHaveAnyQuestionHeaderElement, "Do You Have Any Questions");

		pause(4000);
		elementEnabled(nameFromDoYouHaveAnyQuestionHeaderElement);
		clickElement(nameFromDoYouHaveAnyQuestionHeaderElement);
		inputTextThenClickTab(nameFromDoYouHaveAnyQuestionHeaderElement, "Purnota");

		pause(4000);
		elementEnabled(emailFromDoYouHaveAnyQuestionHeaderElement);
		clickElement(emailFromDoYouHaveAnyQuestionHeaderElement);
		inputTextThenClickTab(emailFromDoYouHaveAnyQuestionHeaderElement, "toroni1980@gmail.com");

		pause(3000);
		elementEnabled(subjectFromDoYouHaveAnyQuationHeaderElement);
		clickElement(subjectFromDoYouHaveAnyQuationHeaderElement);
		inputTextThenClickTab(subjectFromDoYouHaveAnyQuationHeaderElement, "QA(Atomation)");

		pause(3000);
		elementDisplayed(experianceFromDoYouHaveAnyQuestionHeaderElement);
		clickElement(experianceFromDoYouHaveAnyQuestionHeaderElement);
		inputTextThenClickTab(experianceFromDoYouHaveAnyQuestionHeaderElement, "5 years job(IT base)");

		pause(3000);
		elementEnabled(massageFromDoYouHaveAnyQuestionHeaderElement);
		clickElement(massageFromDoYouHaveAnyQuestionHeaderElement);
		inputTextThenClickTab(massageFromDoYouHaveAnyQuestionHeaderElement,
				"I need more Information about Enthrall IT school QA Atomation program.");

		pause(4000);
		elementEnabled(sendNowFromDoYouHaveAnyQuestionHeaderElement);
		clickElement(sendNowFromDoYouHaveAnyQuestionHeaderElement);
		inputTextThenClickEnter(sendNowFromDoYouHaveAnyQuestionHeaderElement, "click");

		pause(4000);

	}

	public void validationForAllFooterMenu() {
		pause(3000);
		elementEnabled(homeFooterElement);
		clickElement(homeFooterElement);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/");

		pause(3000);
		elementEnabled(courseFooterElement);
		clickElement(courseFooterElement);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/courses/");

		pause(3000);
		elementEnabled(mentorFooterElement);
		clickElement(mentorFooterElement);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/mentors/");

		pause(3000);
		elementEnabled(alumniFooterElement);
		clickElement(alumniFooterElement);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/alumni/");

		pause(3000);
		elementEnabled(aboutUsFooterElement);
		clickElement(aboutUsFooterElement);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/about/");

		pause(3000);
		elementEnabled(loginButtonFooterElement);
		clickElement(loginButtonFooterElement);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");

		pause(3000);
		elementEnabled(enrollNowFooterElement);
		clickElement(enrollNowFooterElement);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/course/dashboard/enroll/");

	}

	public void phoneAndEmailValidation() {
		pause(4000);
		verifyTextOfTheWebElement(emailAddress, "info@enthrallit.com");
		pause(3000);
		verifyTextOfTheWebElement(phoneNumberElement, "+1 929-301-6028");
		pause(3000);
	}

}
