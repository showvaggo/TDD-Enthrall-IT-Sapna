package pages;

import java.time.Duration;
import java.util.List;

import org.apache.commons.exec.LogOutputStream;
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
	LoginPage loginPage;

	public Dashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		loginPage = new LoginPage(driver);
	}

	@FindBy(xpath = "//a[text()='Return site']")
	WebElement returnSitefromDashboard;

	@FindBy(xpath = "//img[@class='avatar-rounded']")
	WebElement imgElement;

	@FindBy(xpath = "//span[text()='Logout']")
	WebElement returnSitefromLogOutButton;

	//// @FindBy(xpath = "//*[@name='dashboard-link']")
	// WebElement dashboard;

	@FindBy(xpath = "//li[@class='submenu active']")
	WebElement dashboard;

	@FindBy(xpath = "//div[@class='breadcrumb-holder']")
	WebElement dashboardHeader;

	@FindBy(xpath = "//span[text()='Profile']")
	WebElement profile;

	@FindBy(xpath = "//div[@class='breadcrumb-holder']")
	WebElement profileHeader;

	@FindBy(xpath = "//span[text()='Add Course']")
	WebElement add_course;

	@FindBy(xpath = "//h1[text()='Enroll Course']")
	WebElement courseHeader;

	@FindBy(xpath = "//span[text()='Quiz List']")
	WebElement quiz_list;

	@FindBy(xpath = "(//span[text()='Quiz List'])[1]")
	WebElement quizListHeader;

	@FindBy(xpath = "//span[text()='Home Work']")
	WebElement home_work;

	@FindBy(xpath = "//span[text()='Homework List']")
	WebElement homeWorkHeader;

	@FindBy(xpath = "//span[text()='Codding Challenge']")
	WebElement cording_challenge;

	@FindBy(xpath = "//span[text()='Coding Challenge List']")
	WebElement cordingChallengeHeader;

	@FindBy(xpath = "//span[text()='Exam']")
	WebElement exam;

	@FindBy(xpath = "//span[text()='Exam List']")
	WebElement examListHeader;

	@FindBy(xpath = "//span[text()='Bootcamp']")
	WebElement bootcamp;

	@FindBy(xpath = "//span[text()='Bootcamp List']")
	WebElement bootcampListHeader;

	@FindBy(xpath = "//span[text()='Class Notes']")
	WebElement class_note;

	@FindBy(xpath = "//h1[text()='Class Note List']")
	WebElement classNoteHeader;

	@FindBy(xpath = "//span[text()='Class Schedule']")
	WebElement class_schedule;

	@FindBy(xpath = "//h1[text()='Class Calendar']")
	WebElement classScheduleHeader;

	@FindBy(xpath = "//span[text()='Join The Class']")
	WebElement join_the_class;

	@FindBy(xpath = "//h1[text()='Meeting List']")
	WebElement joinTheClassHeader;

	@FindBy(xpath = "//span[text()='Class recording']")
	WebElement class_recording;

	@FindBy(xpath = "//h1[text()='Meeting List']")
	WebElement classRecordingHeader;

	@FindBy(xpath = "//span[text()='Others']")
	WebElement others;

	@FindBy(xpath = "//h1[text()='Others']")
	WebElement othersHeader;

	@FindBy(xpath = "//a[@id='logo-id']")
	WebElement logo;

	@FindBy(xpath = "//a[@id='login-link' and @name='login-link' and @class='nav-link']")
	WebElement loginHeaderElement;

	@FindBy(xpath = "//h2[text()='Login into your account']")
	WebElement loginPageText;

	@FindBy(xpath = "//input[@id='emails']")
	WebElement useremail;

	@FindBy(xpath = "//input[@id='password']")
	WebElement userpassword;

	@FindBy(xpath = "//button[@id='login' and @name='login']")
	WebElement userlogin;

	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automation;
	@FindBy(xpath = "//h3[text()='Automation']")
	WebElement automationHeader;
	@FindBy(xpath = "//h1[@class='sub-title']")
	WebElement automationSubHeader;
	@FindBy(xpath = "//button[text()='Enroll Now']")
	WebElement enrollNow;
	@FindBy(xpath = "(//div[@class='row'])[1]")
	WebElement homeEnrollButton;
	@FindBy(xpath = "//h3[text()='Select your course from the dropdown']")
	WebElement enrollNowHeader;
	@FindBy(xpath = "//h5[text()='Please enter your personal and contact information.']")
	WebElement enrollNowSubHeader;
	@FindBy(xpath = "//p[text()='All fields are required unless marked (optional).']")
	WebElement enrollNowOtherHeader;

	@FindBy(xpath = "//div[@class='container']")
	WebElement mouseHoverActionElement;

	@FindBy(xpath = "//a[text()='Enroll Now']")
	WebElement enrollNowPageHeader;

	@FindBy(xpath = "//h3[text()='Select your course from the dropdown']")
	WebElement selectYourCourseFromTheDropdown;

	@FindBy(xpath = "//input[@id='id_f_name']")
	WebElement first_Name;
	@FindBy(xpath = "//small[@id='f_name_error']")
	WebElement first_name_alphabetic_error;
	@FindBy(xpath = "//small[text()='First Name is a required field.']")
	WebElement First_name_is_a_required_field;

	@FindBy(xpath = "//input[@id='id_m_name']")
	WebElement middle_Name;
	@FindBy(xpath = "//small[@id='m_name_error']")
	WebElement middle_name_alphabetic_error;

	@FindBy(xpath = "//input[@id='id_l_name']")
	WebElement last_Name;
	@FindBy(xpath = "//small[@id='l_name_error']")
	WebElement last_name_alphabetic_error;
	@FindBy(xpath = "//small[text()='Last Name is a required field.']")
	WebElement last_name_is_a_requird_field;

	// @FindBy(xpath = "//small[@id='i_am_error']")
	// WebElement i_am_dropdown_btn;

	// @FindBy(xpath = "//small[@id='i_am_error']")
	// WebElement I_m_is_a_required_field;
	@FindBy(xpath = "//select[@id='id_i_am']")
	WebElement iAmFromDropdown;
	@FindBy(xpath = "//small[@id='i_am_error']")
	WebElement iAmIsARequierdField;

	@FindBy(xpath = "//select[@id='id_course_wish_to_enroll']")
	WebElement courseWishToEnrollFromDropdown;
	@FindBy(xpath = "//small[@id='course_wish_error']")
	WebElement courseWishToEnrollIsArequaredField;
	
	@FindBy(xpath = "//input[@id='id_phone']")
	WebElement phoneNumber;
	@FindBy(xpath = "//small[text()='Phone Number is a required field.']")
	WebElement phoneNumberIsARequerdField;
	@FindBy(xpath = "//small[text()='Must be a valid Phone Number.']")
	WebElement mustBeAValidPhoneNumber;
	@FindBy(xpath = "//small[@id='phone_error']")
	WebElement phNMustBeExactly10Digit;
	@FindBy(xpath = "//small[@id='phone_error']")
	WebElement phNMustNotStartWithA1Or0;
	@FindBy(xpath = "//small[@id='phone_error']")
	WebElement phnNotAllowUperOrLowerCaseLetter;

	public void login_easy_step() {
		pause(2000);
		clickElement(loginHeaderElement);
		pause(2000);
		inputTextThenClickTab(useremail, "sr8950601@gmail.com");
		pause(2000);
		inputTextThenClickTab(userpassword, "Saffollow?!1956");
		pause(2000);
		clickElement(userlogin);
		pause(2000);

	}

	public void dashboard_page_validetion() {
		pause(3000);
		login_easy_step();
		pause(3000);
		clickElement(imgElement);
		pause(3000);
		clickElement(returnSitefromDashboard);
		pause(3000);
		clickElement(dashboard);
		pause(1000);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");
		pause(1000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(1000);
		clickElement(imgElement);
		pause(1000);
		clickElement(returnSitefromLogOutButton);
		pause(1000);

	}

	public void dashboard_aside_validation_step() {
		pause(3000);
		login_easy_step();
		pause(3000);
		clickElement(dashboard);
		pause(3000);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");
		pause(3000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(3000);
		clickElement(dashboardHeader);
		pause(3000);

		clickElement(profile);
		pause(1000);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/profile/");
		pause(1000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(3000);
		clickElement(profileHeader);
		pause(1000);

		clickElement(add_course);
		pause(1000);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/enroll/course/");
		pause(1000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(3000);
		clickElement(courseHeader);
		pause(3000);

		clickElement(quiz_list);
		pause(1000);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/qz/");
		pause(1000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(3000);
		clickElement(quizListHeader);
		pause(3000);

		clickElement(home_work);
		pause(1000);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/data/list/hw/");
		pause(1000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(3000);
		clickElement(homeWorkHeader);
		pause(3000);

		clickElement(cording_challenge);
		pause(1000);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/cc/");
		pause(1000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(3000);
		clickElement(cordingChallengeHeader);
		pause(3000);

		clickElement(exam);
		pause(1000);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/exam/");
		pause(1000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(3000);
		clickElement(examListHeader);
		pause(3000);

		clickElement(bootcamp);
		pause(1000);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/data/list/bt/");
		pause(1000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(3000);
		clickElement(bootcampListHeader);
		pause(3000);

		clickElement(class_note);
		pause(1000);
		verifyCurrentUrl(driver, "https://enthrallit.com/modules/class/note/list/#class_note");
		pause(1000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(3000);
		clickElement(classNoteHeader);
		pause(3000);

		clickElement(class_schedule);
		pause(1000);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/");
		pause(1000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(3000);
		clickElement(classScheduleHeader);
		pause(3000);

		clickElement(join_the_class);
		pause(1000);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/next-class/");
		pause(1000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(3000);
		clickElement(joinTheClassHeader);
		pause(3000);

		clickElement(others);
		pause(1000);
		verifyCurrentUrl(driver, "https://enthrallit.com/schedule/others/list/");
		pause(1000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(3000);
		clickElement(othersHeader);
		pause(3000);
	}

	public void Automation_page_validation_step() {
		pause(3000);
		login_easy_step();
		pause(3000);
		clickElement(dashboard);
		pause(3000);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");
		pause(3000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(3000);
		clickElement(dashboardHeader);
		pause(3000);

		clickElement(automation);
		pause(1000);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/dashboard/automation/");
		pause(1000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(3000);
		clickElement(enrollNow);
		pause(1000);
		clickElement(automationHeader);
		pause(3000);
		clickElement(automationSubHeader);
		pause(3000);
		clickElement(homeEnrollButton);
		pause(1000);
		// verifyCurrentUrl(driver, "https://enthrallit.com/course/dashboard/enrolls/");
		// pause(1000);
	}

	public void EnrollNowHomePageStepValidation() {

		pause(2000);
		Automation_page_validation_step();
		pause(3000);
		switchToChildWindow(driver, automation, enrollNow);
		clickElement(homeEnrollButton);
		pause(1000);
		// verifyCurrentUrl(driver, "https://enthrallit.com/course/dashboard/enrolls/");
		// pause(1000);
		// verifyTitle(driver, "Enthrall IT - Dashboard");
		pause(3000);
		validationOfHeader(enrollNowHeader, "Select your course from the dropdown");
		pause(1000);
		validationOfSubHeader(enrollNowSubHeader, "Please enter your personal and contact information.");
		pause(3000);
		validationOfOtherHeader(enrollNowOtherHeader, "All fields are required unless marked (optional).");
		// pause(3000);
		// clickElement(first_Name);
		// pause(1000);
		// inputText(first_Name, "Purnota");
		pause(2000);
	}

	public void firstNameValidation() {
		pause(3000);
		// EnrollNowHomePageStepValidation();
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);
		clickElement(first_Name);
		verifyLengthOfTheFieldContent(first_Name, Attribute.MAX_LENGTH, "20");
		pause(3000);
		inputTextThenClickTab(first_Name, "@##$%");
		pause(3000);
		verifyErrorMessageUnderTheField(first_name_alphabetic_error, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(2000);
		inputTextThenClickTab(first_Name, "7654321");
		verifyErrorMessageUnderTheField(first_name_alphabetic_error, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		clearTextFromTheField(first_Name);
		clickElement(first_Name);
		verifyErrorMessageUnderTheField(First_name_is_a_required_field, Attribute.INNER_HTML,
				"First Name is a required field.");

		inputTextThenClickTab(first_Name, "'Purnota- Sarker'");
		pause(2000);
	}

	public void MiddleNameValidation() {
		// pause(3000);
		// EnrollNowHomePageStepValidation();
		pause(3000);
		firstNameValidation();
		clickElement(middle_Name);
		verifyLengthOfTheFieldContent(middle_Name, Attribute.MAX_LENGTH, "20");
		pause(3000);
		inputTextThenClickTab(middle_Name, "@##$%");
		pause(3000);
		verifyErrorMessageUnderTheField(middle_name_alphabetic_error, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(2000);

		clearTextFromTheField(middle_Name);
		pause(2000);
		inputTextThenClickTab(middle_Name, "123456");
		verifyErrorMessageUnderTheField(middle_name_alphabetic_error, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		clearTextFromTheField(middle_Name);
		clickElement(middle_Name);
		inputTextThenClickTab(middle_Name, "Pihu");
		pause(2000);
	}

	public void lastNameValidation() {
		MiddleNameValidation();
		pause(3000);
		clickElement(last_Name);
		verifyLengthOfTheFieldContent(last_Name, Attribute.MAX_LENGTH, "25");
		pause(3000);
		inputTextThenClickTab(last_Name, "*&^%%$$$#");
		pause(3000);
		verifyErrorMessageUnderTheField(last_name_alphabetic_error, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(2000);
		inputTextThenClickTab(last_Name, "1233445");
		verifyErrorMessageUnderTheField(last_name_alphabetic_error, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		clearTextFromTheField(last_Name);
		pause(3000);
		verifyErrorMessageUnderTheField(last_name_is_a_requird_field, Attribute.INNER_HTML,
				"Last Name is a required field.");
		clickElement(last_Name);
		inputTextThenClickTab(last_Name, "kaha");
		pause(2000);
	}

	public void iAmDropdownBtnValidation() {
		pause(3000);
		 lastNameValidation();
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
	    clickElementThenTab(iAmFromDropdown);
	    pause(2000);
		verifyErrorMessageUnderTheField(iAmIsARequierdField, Attribute.INNER_HTML, "I'm is a required field.");
		// clickElement(iAmFromDropdown);
		selectDropdown(iAmFromDropdown, "a Student");
		pause(3000);
		
		
	}

	public void courseWishToEnrollValidation() {
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		clickElementThenTab(courseWishToEnrollFromDropdown);
		verifyErrorMessageUnderTheField(courseWishToEnrollIsArequaredField, Attribute.INNER_HTML,
				"Course Wish to Enroll is a required field. ");
		selectDropdown(courseWishToEnrollFromDropdown, "Python");
		pause(5000);
	}
	public void phoneNumberValidation() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);
		clickElement(phoneNumber);
		verifyLengthOfTheFieldContent(phoneNumber, Attribute.MAX_LENGTH, "10");
		pause(3000);
		inputTextThenClickTab(phoneNumber, "@#$%^&*+*-");
		verifyErrorMessageUnderTheField(mustBeAValidPhoneNumber, Attribute.INNER_HTML, "Must be a valid Phone Number.");
		pause(3000);
		inputTextThenClickTab(phoneNumber, "1032");
		verifyErrorMessageUnderTheField(phNMustBeExactly10Digit, Attribute.INNER_HTML, "Must be a valid Phone Number.");
		pause(3000);
		inputTextThenClickTab(phoneNumber, "0192765446");
		verifyErrorMessageUnderTheField(phNMustNotStartWithA1Or0, Attribute.INNER_HTML, "Must be a valid Phone Number.");
		pause(3000);
		inputTextThenClickTab(phoneNumber, "AabBDEabab");
		verifyErrorMessageUnderTheField(phnNotAllowUperOrLowerCaseLetter, Attribute.INNER_HTML, "Must be a valid Phone Number.");
		pause(3000);
		clearTextFromTheField(phoneNumber);
		pause(3000);
		verifyErrorMessageUnderTheField(phoneNumberIsARequerdField, Attribute.INNER_HTML, "Phone Number is a required field.");
		inputTextThenClickTab(phoneNumber, "9297276956");
		pause(6000);
		
	}

}
