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
	WebElement home_header;

	@FindBy(xpath = "//a[@id='home' and @name='home']")
	WebElement home_footer;

	@FindBy(xpath = "//li[@id='courses']")
	WebElement course_header;

	@FindBy(xpath = "//li[@id='courses' and @name='courses']")
	WebElement course_footer;

	@FindBy(xpath = "//li[@id='mentors']")
	WebElement mentor_header;

	@FindBy(xpath = "//li[@id='mentors']")
	WebElement mentor_footer;

	@FindBy(xpath = "//li[@id='alumni' and @name='alumni']")
	WebElement alumni_header;

	@FindBy(xpath = "//li[@id='alumni' and @name='alumni']")
	WebElement alumni_footer;

	@FindBy(xpath = "//li[@id='about us']")
	WebElement about_us_header;

	@FindBy(xpath = "//li[@id='about us']")
	WebElement about_us_footer;

	@FindBy(xpath = "//a[@class='nav-link' and @id='login-link']")
	WebElement login_button_header_menu;

	@FindBy(xpath = "//a[text()='Login' and @id='login-link' and @ name='login-link' and @ class='nav-link']")
	WebElement login_button_footer_menu;

	@FindBy(xpath = "//a[@id='enroll_now']")
	WebElement enroll_now_footer;

	@FindBy(xpath = "//p[text()='info@enthrallit.com']")
	WebElement email_address;

	@FindBy(xpath = "//p[@class='phone-number']")
	WebElement phone_number;

	@FindBy(xpath = "//h2[text()='Contact Us']")
	WebElement contuct_us_element;

	@FindBy(xpath = "//h2[text()='Do You Have Any Questions']")
	WebElement do_you_have_any_question_header;

	@FindBy(xpath = "//input[@id='id_name']")
	WebElement name_from_do_you_have_any_question_header;

	@FindBy(xpath = "//input[@id='id_email']")
	WebElement email_from_do_you_have_any_question_header;

	@FindBy(xpath = "//input[@id='id_subject']")
	WebElement subject_from_do_you_have_any_quation_header;

	@FindBy(xpath = "//input[@id='id_experiance']")
	WebElement experiance_from_do_you_have_any_question_header;

	@FindBy(xpath = "//textarea[@id='id_message']")
	WebElement massage_from_do_you_have_any_question_header;

	@FindBy(xpath = "//button[text()='send now']")
	WebElement send_now_from_do_you_have_any_question_header;

	@FindBy(xpath = "//h3[@id='find-us']")
	WebElement find_us_from_homePag;

	public void logo_validation() {
		pause(4000);
		elementDisplayed(logo);
		clickElement(logo);
		pause(4000);
	}

	public void title_validation() {
		pause(3000);
		verifyTitle(driver, "Enthrall IT");
		pause(4000);
	}

	public void login_button_from_menu_bar_validation() {

		elementEnabled(login_button_header_menu);
		clickElement(login_button_header_menu);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");

	}

	public void validation_for_all_header_menu() {

		pause(4000);
		elementEnabled(home_header);
		clickElement(home_header);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/");

		pause(4000);
		elementEnabled(course_header);
		clickElement(course_header);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/courses/");

		pause(3000);
		elementEnabled(mentor_header);
		clickElement(mentor_header);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/mentors/");

		pause(3000);
		elementEnabled(alumni_header);
		clickElement(alumni_header);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/alumni/");

		pause(3000);
		elementEnabled(about_us_header);
		clickElement(about_us_header);
		verifyTitle(driver, "About us");
		verifyCurrentUrl(driver, "https://enthrallit.com/about/");

		pause(3000);
		elementEnabled(login_button_header_menu);
		clickElement(login_button_header_menu);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");

	}

	public void scroll_into_redirect_page_and_validate_title_current_url_and_header() {
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, contuct_us_element);

		pause(4000);
		validationOfHeader(do_you_have_any_question_header, "Do You Have Any Questions");

		pause(4000);
		elementEnabled(name_from_do_you_have_any_question_header);
		clickElement(name_from_do_you_have_any_question_header);
		inputTextThenClickTab(name_from_do_you_have_any_question_header, "Purnota");

		pause(4000);
		elementEnabled(email_from_do_you_have_any_question_header);
		clickElement(email_from_do_you_have_any_question_header);
		inputTextThenClickTab(email_from_do_you_have_any_question_header, "toroni1980@gmail.com");

		pause(3000);
		elementEnabled(subject_from_do_you_have_any_quation_header);
		clickElement(subject_from_do_you_have_any_quation_header);
		inputTextThenClickTab(send_now_from_do_you_have_any_question_header, "QA(Atomation)");

		pause(3000);
		elementDisplayed(experiance_from_do_you_have_any_question_header);
		clickElement(experiance_from_do_you_have_any_question_header);
		inputTextThenClickTab(experiance_from_do_you_have_any_question_header, "5 years job(IT base)");

		pause(3000);
		elementEnabled(massage_from_do_you_have_any_question_header);
		clickElement(massage_from_do_you_have_any_question_header);
		inputTextThenClickTab(massage_from_do_you_have_any_question_header,
				"I need more Information about Enthrall IT school QA Atomation program.");

		pause(4000);
		elementEnabled(send_now_from_do_you_have_any_question_header);
		clickElement(send_now_from_do_you_have_any_question_header);
		inputTextThenClickEnter(send_now_from_do_you_have_any_question_header, "click");

		pause(4000);

	}

	public void validation_for_all_footer_menu() {
		pause(3000);
		elementEnabled(home_footer);
		clickElement(home_footer);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/");

		pause(3000);
		elementEnabled(course_footer);
		clickElement(course_footer);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/courses/");

		pause(3000);
		elementEnabled(mentor_footer);
		clickElement(mentor_footer);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/mentors/");

		pause(3000);
		elementEnabled(alumni_footer);
		clickElement(alumni_footer);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/alumni/");

		pause(3000);
		elementEnabled(about_us_footer);
		clickElement(about_us_footer);
		verifyTitle(driver, "About us");
		verifyCurrentUrl(driver, "https://enthrallit.com/about/");

		pause(3000);
		elementEnabled(login_button_footer_menu);
		clickElement(login_button_footer_menu);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");

		pause(3000);
		elementEnabled(enroll_now_footer);
		clickElement(enroll_now_footer);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/course/apply/");

	}

	public void phone_and_email_validation() {
		
		pause(4000);
		verifyTextOfTheWebElement(email_address, "info@enthrallit.com");
		pause(3000);
		verifyTextOfTheWebElement(phone_number, "+1 929-301-6028");
		pause(3000);
	}

}
