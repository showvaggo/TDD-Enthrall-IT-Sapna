package pages;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.zip.ZipEntry;

import org.apache.commons.exec.LogOutputStream;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import constants.Attribute;
import static common.CommonActions.*;
import static common.CommonWaits.*;

public class Dashboard {

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

	@FindBy(xpath = "//span[text()=' Dashboard']")
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

	// First Name
	@FindBy(xpath = "//input[@id='id_m_name']")
	WebElement middle_Name;

	@FindBy(xpath = "//small[@id='m_name_error']")
	WebElement middle_name_alphabetic_error;

	// Last Name
	@FindBy(xpath = "//input[@id='id_l_name']")
	WebElement last_Name;

	@FindBy(xpath = "//small[@id='l_name_error']")
	WebElement last_name_alphabetic_error;

	@FindBy(xpath = "//small[text()='Last Name is a required field.']")
	WebElement last_name_is_a_requird_field;

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

	@FindBy(xpath = "//input[@id='id_email']")
	WebElement email;

	@FindBy(xpath = "//span[@id='email_error']")
	WebElement email_address_is_a_required_field;

	@FindBy(xpath = "//span[@id='email_error']")
	WebElement must_be_a_valid_email_address;

	@FindBy(xpath = "//span[@id='email_error']")
	WebElement mustBeValidEmail;
//password
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//span[@id='password_error']")
	WebElement passwordIsARequiredField;

	@FindBy(xpath = "//span[@id='password_error' and @class='error-message']")
	WebElement password_cannot_contain_first_name_Last_name_or_email;

	@FindBy(xpath = "//span[text()='Please refer to Password requirements.']")
	WebElement please_refer_to_password_requirements;

	@FindBy(xpath = "//i[@id='password-icon']")
	WebElement hiden_password;

	@FindBy(xpath = "//span[@ id='password_error']")
	WebElement must_contain_a_minimum_of_8_characters;

	@FindBy(xpath = "//select[@id='id_gender']")
	WebElement gender;

	@FindBy(xpath = "//input[@id='id_image']")
	WebElement personal_id;

	@FindBy(xpath = "//span[text()='Personal Image is a required field.']")
	WebElement personal_image_is_a_required_field;

	@FindBy(xpath = "//input[@id='id_photo_id']")
	WebElement photoId;

	@FindBy(xpath = "//span[text()='Photo Id is a required field.']")
	WebElement photo_Id_is_a_required_field;

	@FindBy(xpath = "//select[@id='id_birth_year']")
	WebElement birthYear;

	@FindBy(xpath = "//span[text()='Birth Year is a required field.']")
	WebElement birth_year_is_a_required_field;

	@FindBy(xpath = "//select[@id='id_birth_month']")
	WebElement birthMonth;

	@FindBy(xpath = "//span[text()='Birth Month is a required field.']")
	WebElement birth_month_is_a_require_field;

	@FindBy(xpath = "//select[@id='id_birth_date']")
	WebElement birthDate;

	@FindBy(xpath = "//span[text()='Birth Date is a required field.']")
	WebElement birth_date_is_a_required_field;

//Home address line-1
	@FindBy(xpath = "//input[@id='id_home_address_line_1']")
	WebElement home_address_line_1;

	@FindBy(xpath = "//span[@id='home_address_error']")
	WebElement home_address_line_1_is_a_required_field;

	@FindBy(xpath = "//span[text()='Must be alphanumeric characters.']")
	WebElement must_be_alphanumeric_characters;

	// Home address line 2
	@FindBy(xpath = "//input[@name='home_address_line_2']")
	WebElement home_address_line_2;

	@FindBy(xpath = "//span[@id='home_address_line_2_error']")
	WebElement mustBeAlphanumericCharacters;
	// City
	@FindBy(xpath = "//input[@id='id_city' and @name='city']")
	WebElement city;

	@FindBy(xpath = "//span[text()='City is a required field.']")
	WebElement cityIsARequiredField;

	@FindBy(xpath = "//span[@id='city_error']")
	WebElement cityNameMustBeAlphabeticCharacters;
	// state
	@FindBy(xpath = "//select[@id='id_state']")
	WebElement state;

	@FindBy(xpath = "//span[text()='State is a required field.']")
	WebElement state_is_a_required_field;

	// ZIP Code
	@FindBy(xpath = "//input[@id='id_zip_code']")
	WebElement zipCode;

	@FindBy(xpath = "//span[@id='zip_code_error']")
	WebElement zip_code_is_a_required_field;

	@FindBy(xpath = "//span[@id='zip_code_error']")
	WebElement must_be_a_valid_numeric_zip_code;

	@FindBy(xpath = "//select[@id='id_immigration_status']")
	WebElement immigration_status;

	@FindBy(xpath = "//input[@id='id_arrival_date']")
	WebElement dateOfArrival;

	@FindBy(xpath = "//span[@id='arrival_date_error']")
	WebElement Must_be_alphanumeric_characters;

	@FindBy(xpath = "//input[@id='id_emergency_contact']")
	WebElement emergency_contact;

	@FindBy(xpath = "//span[@id='emergency_contact_error']")
	WebElement e_contuct_must_be_alphanumeric_characters;

	@FindBy(xpath = "//input[@id='id_know_us']")
	WebElement HowDidYouKnowAboutEnthrallIt;

	@FindBy(xpath = "//span[@id='how_did_you_know_error']")
	WebElement e_it_must_be_alphabetic_characters;

	@FindBy(xpath = "//select[@id='id_highest_education']")
	WebElement highest_education;

	@FindBy(xpath = "//select[@id='id_country_of_origin']")
	WebElement country_of_origin;

	@FindBy(xpath = "//input[@id='selected_language']")
	WebElement primaryLanguage;

	@FindBy(xpath = "//input[@id='id_sign_by_name']")
	WebElement signature;

	@FindBy(xpath = "//span[@id='signature_error']")
	WebElement signature_is_a_required_field;

	@FindBy(xpath = "//span[text()='Please provide your full name as above']")
	WebElement Please_provide_your_full_name_as_above;

	@FindBy(xpath = "//input[@id='is_agree']")
	WebElement selectBoxIagree;

	@FindBy(xpath = "//a[text()='Terms and condition']")
	WebElement double_click_to_the_terms_and_condition;

	@FindBy(xpath = "//button[@id='submit_button']")
	WebElement Submitbutton;

	@FindBy(xpath = "//li[text()='Back']")
	WebElement backButton;

	@FindBy(xpath = "//button[text()='Right Click Action']")
	WebElement rightClickAction;

	@FindBy(xpath = "//li[text()='Cancel']")
	WebElement cancelButton;
	

	public void login_page_validation() {
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

	public void dashboard_page_validation() {
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
		login_page_validation();
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

	public void automation_page_validation_step() {

		pause(3000);

		login_page_validation();

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
	}

	public void enroll_now_home_page_step_validation() {

		pause(2000);
		automation_page_validation_step();
		pause(3000);
		switchToChildWindow(driver, automation, enrollNow);
		clickElement(homeEnrollButton);
		pause(1000);
		validationOfHeader(enrollNowHeader, "Select your course from the dropdown");
		pause(1000);
		validationOfSubHeader(enrollNowSubHeader, "Please enter your personal and contact information.");
		pause(3000);
		validationOfOtherHeader(enrollNowOtherHeader, "All fields are required unless marked (optional).");
		pause(2000);
	}

	public void firstNameValidation() {
		// pause(3000);
		// enroll_now_home_page_step_validation();
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

	public void middleNameValidation() {
		// pause(3000);
		// enroll_now_home_page_step_validation();
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
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
		// pause(1000);
		// enroll_now_home_page_step_validation();
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
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
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		clickElementThenTab(iAmFromDropdown);
		pause(2000);
		verifyErrorMessageUnderTheField(iAmIsARequierdField, Attribute.INNER_HTML, "I'm is a required field.");
		selectDropdown(iAmFromDropdown, "a Student");
		pause(3000);

	}

	public void courseWishToEnrollValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		clickElementThenTab(courseWishToEnrollFromDropdown);
		verifyErrorMessageUnderTheField(courseWishToEnrollIsArequaredField, Attribute.INNER_HTML,
				"Course Wish to Enroll is a required field. ");
		selectDropdown(courseWishToEnrollFromDropdown, "Python");
		pause(5000);
	}

	public void phoneNumberValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
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
		inputTextThenClickTab(phoneNumber, "0");
		verifyErrorMessageUnderTheField(phNMustNotStartWithA1Or0, Attribute.INNER_HTML,
				"Must be a valid Phone Number.");
		pause(3000);
		inputTextThenClickTab(phoneNumber, "1");
		verifyErrorMessageUnderTheField(phNMustNotStartWithA1Or0, Attribute.INNER_HTML,
				"Must be a valid Phone Number.");

		pause(3000);
		inputTextThenClickTab(phoneNumber, "A");
		verifyErrorMessageUnderTheField(phnNotAllowUperOrLowerCaseLetter, Attribute.INNER_HTML,
				"Must be a valid Phone Number.");
		pause(3000);
		inputTextThenClickTab(phoneNumber, "a");
		verifyErrorMessageUnderTheField(phnNotAllowUperOrLowerCaseLetter, Attribute.INNER_HTML,
				"Must be a valid Phone Number.");

		pause(3000);
		clearTextFromTheField(phoneNumber);
		pause(3000);
		verifyErrorMessageUnderTheField(phoneNumberIsARequerdField, Attribute.INNER_HTML,
				"Phone Number is a required field.");
		inputTextThenClickTab(phoneNumber, "9297276956");
		pause(6000);

	}

	public void emailAddressValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);
		clickElement(email);
		verifyLengthOfTheFieldContent(email, Attribute.MAX_LENGTH, "74");
		inputTextThenClickTab(email, "shown");
		verifyErrorMessageUnderTheField(must_be_a_valid_email_address, Attribute.INNER_HTML,
				"Must be a valid Email Address.");
		pause(3000);
		inputTextThenClickTab(email, "showndorjo@12234A44455$7777###@gmail.com");
		verifyErrorMessageUnderTheField(mustBeValidEmail, Attribute.INNER_HTML, "Must be a valid Email Address.");
		clearTextFromTheField(email);
		verifyErrorMessageUnderTheField(email_address_is_a_required_field, Attribute.INNER_HTML,
				"Email Address is a required field.");
		inputTextThenClickTab(email, "roopkotha05@gmail.com");
		pause(4000);
	}

	public void passwordValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(1000);
		clickElement(password);
		verifyLengthOfTheFieldContent(password, Attribute.MAX_LENGTH, "74");

		pause(1000);
		inputTextThenClickTab(password, "?<>()&\"'?|/\\");
		pause(1000);
		verifyErrorMessageUnderTheField(please_refer_to_password_requirements, Attribute.INNER_HTML,
				"Please refer to Password requirements.");

		pause(1000);
		inputTextThenClickTab(password, "Purnota@roop05");
		pause(1000);
		verifyErrorMessageUnderTheField(please_refer_to_password_requirements, Attribute.INNER_HTML,
				"Please refer to Password requirements.");

		pause(1000);
		inputTextThenClickTab(password, "@23Aa");
		pause(1000);
		verifyErrorMessageUnderTheField(please_refer_to_password_requirements, Attribute.INNER_HTML,
				"Please refer to Password requirements.");

		pause(1000);
		inputTextThenClickTab(password, "Kahakotha05@gmail.com");
		pause(1000);
		verifyErrorMessageUnderTheField(password_cannot_contain_first_name_Last_name_or_email, Attribute.INNER_HTML,
				"Please refer to Password requirements.");

		pause(1000);
		inputTextThenClickTab(password, "A");
		verifyErrorMessageUnderTheField(must_contain_a_minimum_of_8_characters, Attribute.INNER_HTML,
				"Please refer to Password requirements.");

		pause(1000);
		inputTextThenClickTab(password, "a");
		verifyErrorMessageUnderTheField(must_contain_a_minimum_of_8_characters, Attribute.INNER_HTML,
				"Please refer to Password requirements.");

		pause(1000);
		inputTextThenClickTab(password, "1");
		verifyErrorMessageUnderTheField(must_contain_a_minimum_of_8_characters, Attribute.INNER_HTML,
				"Please refer to Password requirements.");

		pause(1000);
		inputTextThenClickTab(password, "&");
		verifyErrorMessageUnderTheField(must_contain_a_minimum_of_8_characters, Attribute.INNER_HTML,
				"Please refer to Password requirements.");

		pause(1000);
		inputTextThenClickTab(password, "Ti3-top");
		verifyErrorMessageUnderTheField(must_contain_a_minimum_of_8_characters, Attribute.INNER_HTML,
				"Please refer to Password requirements.");

		clearTextFromTheField(password);
		verifyErrorMessageUnderTheField(passwordIsARequiredField, Attribute.INNER_HTML,
				"Password is a required field.");
		inputTextThenClickTab(password, "Ab!1tip2");
		pause(6000);
	}

	public void genderValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);
		clickElementThenTab(gender);
		selectDropdown(gender, "Female");
		pause(3000);

	}

	public void personalImageValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, Submitbutton);
		pause(3000);
		clickElement(Submitbutton);
		verifyErrorMessageUnderTheField(personal_image_is_a_required_field, Attribute.INNER_HTML,
				"Personal Image is a required field.");
		File file = new File(".\\image\\personalID.jpg");
		personal_id.sendKeys(file.getAbsolutePath());
		pause(3000);
	}

	public void photoIdImageValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, Submitbutton);
		pause(3000);
		clickElement(Submitbutton);
		verifyErrorMessageUnderTheField(photo_Id_is_a_required_field, Attribute.INNER_HTML,
				"Photo Id is a required field.");
		pause(3000);
		File file = new File(".\\image\\PhotoID.jpg");
		photoId.sendKeys(file.getAbsolutePath());
		pause(3000);

	}

	public void birthYearValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		clickElementThenTab(birthYear);
		pause(4000);
		verifyErrorMessageUnderTheField(birth_year_is_a_required_field, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		selectDropdown(birthYear, "1986");
		pause(5000);
	}

	public void birthMonthValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		clickElementThenTab(birthMonth);
		pause(4000);
		verifyErrorMessageUnderTheField(birth_month_is_a_require_field, Attribute.INNER_HTML,
				"Birth Month is a required field.");
		selectDropdown(birthMonth, "April");
		pause(5000);

	}

	public void birthDateValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		clickElementThenTab(birthDate);
		pause(4000);
		verifyErrorMessageUnderTheField(birth_date_is_a_required_field, Attribute.INNER_HTML,
				"Birth Date is a required field.");
		pause(3000);
		inputTextThenClickTab(birthDate, "22");
		pause(5000);

	}

	public void homeAdressLine1Validation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);
		clickElement(home_address_line_1);
		verifyLengthOfTheFieldContent(home_address_line_1, Attribute.MAX_LENGTH, "60");
		inputTextThenClickTab(home_address_line_1, "?<>()&\"'?|/\\");
		pause(6000);
		verifyErrorMessageUnderTheField(must_be_alphanumeric_characters, Attribute.INNER_HTML,
				"Must be alphanumeric characters.");
		clearTextFromTheField(home_address_line_1);
		verifyErrorMessageUnderTheField(home_address_line_1_is_a_required_field, Attribute.INNER_HTML,
				"Home Address Line 1 is a required field.");
		inputTextThenClickTab(home_address_line_1, "114-36,127thST.");
		pause(6000);
	}

	public void homeAdressLine2Validation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);
		inputText(home_address_line_1, "?<>()&\"'?|/\\");
		pause(6000);
		clickElement(home_address_line_2);
		verifyLengthOfTheFieldContent(home_address_line_2, Attribute.MAX_LENGTH, "65");
		pause(6000);
		clearTextFromTheField(home_address_line_2);
		inputTextThenClickTab(home_address_line_2, "108-40,156ST.");
		pause(6000);
	}

	public void cityValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);

		pause(3000);
		clickElementThenTab(city);
		verifyLengthOfTheFieldContent(city, Attribute.MAX_LENGTH, "30");
		pause(3000);
		inputTextThenClickTab(city, "%&()*#$[]");
		pause(3000);
		verifyErrorMessageUnderTheField(cityNameMustBeAlphabeticCharacters, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(2000);
		inputTextThenClickTab(city, "1233445");
		verifyErrorMessageUnderTheField(cityNameMustBeAlphabeticCharacters, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		clearTextFromTheField(city);
		pause(3000);
		verifyErrorMessageUnderTheField(cityIsARequiredField, Attribute.INNER_HTML, "City is a required field.");
		clickElementThenTab(city);
		inputTextThenClickTab(city, "South Ozone Park");
		pause(2000);
	}

	public void stateValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		clickElementThenTab(state);
		pause(2000);
		verifyErrorMessageUnderTheField(state_is_a_required_field, Attribute.INNER_HTML, "State is a required field.");
		selectDropdown(state, "New York");
		pause(3000);

	}

	public void zipCodeValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);
		clickElementThenTab(zipCode);
		verifyLengthOfTheFieldContent(zipCode, Attribute.MAX_LENGTH, "5");
		pause(3000);
		inputTextThenClickTab(zipCode, "123");
		pause(3000);
		verifyErrorMessageUnderTheField(must_be_a_valid_numeric_zip_code, Attribute.INNER_HTML,
				"Must be a valid numeric ZIP Code.");
		pause(2000);
		inputTextThenClickTab(zipCode, "<all>");
		verifyErrorMessageUnderTheField(must_be_a_valid_numeric_zip_code, Attribute.INNER_HTML,
				"Must be a valid numeric ZIP Code.");
		pause(1000);
		inputTextThenClickTab(zipCode, "A");
		verifyErrorMessageUnderTheField(must_be_a_valid_numeric_zip_code, Attribute.INNER_HTML,
				"Must be a valid numeric ZIP Code.");
		pause(2000);
		inputTextThenClickTab(zipCode, "a");
		verifyErrorMessageUnderTheField(must_be_a_valid_numeric_zip_code, Attribute.INNER_HTML,
				"Must be a valid numeric ZIP Code.");

		clearTextFromTheField(zipCode);
		pause(3000);
		verifyErrorMessageUnderTheField(zip_code_is_a_required_field, Attribute.INNER_HTML,
				"ZIP Code is a required field.");

		clickElementThenTab(zipCode);
		inputTextThenClickTab(zipCode, "11420");
		pause(2000);
	}

	public void immigrationStatusValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		clickElementThenTab(immigration_status);
		pause(2000);
		selectDropdown(immigration_status, "Citizen");
		pause(3000);
	}

	public void dateOfArrivalValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		inputTextThenClickTab(dateOfArrival, "@#$%");

		verifyErrorMessageUnderTheField(Must_be_alphanumeric_characters, Attribute.INNER_HTML,
				"Must be alphanumeric characters");
		clearTextFromTheField(dateOfArrival);
		clickElementThenTab(dateOfArrival);
		pause(4000);
		inputTextThenClickTab(dateOfArrival, "April 22");
		pause(5000);
	}

	public void emargencyContactValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);
		clickElementThenTab(emergency_contact);
		verifyLengthOfTheFieldContent(emergency_contact, Attribute.MAX_LENGTH, "150");
		inputTextThenClickTab(emergency_contact, "@#$%");
		verifyErrorMessageUnderTheField(e_contuct_must_be_alphanumeric_characters, Attribute.INNER_HTML,
				"Must be alphanumeric characters");
		clearTextFromTheField(emergency_contact);
		clickElementThenTab(emergency_contact);
		pause(4000);
		inputTextThenClickTab(emergency_contact, "Sapna-R,929/727/6956.");
		pause(5000);

	}

	public void howDidYouKnowAboutEnthrallItValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);
		clickElementThenTab(HowDidYouKnowAboutEnthrallIt);
		verifyLengthOfTheFieldContent(HowDidYouKnowAboutEnthrallIt, Attribute.MAX_LENGTH, "500");
		inputTextThenClickTab(HowDidYouKnowAboutEnthrallIt, "@##%&^*");
		verifyErrorMessageUnderTheField(e_it_must_be_alphabetic_characters, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		inputTextThenClickTab(HowDidYouKnowAboutEnthrallIt, "12345678888");
		verifyErrorMessageUnderTheField(e_it_must_be_alphabetic_characters, Attribute.INNER_HTML,
				"Must be alphabetic characters.");

		clearTextFromTheField(HowDidYouKnowAboutEnthrallIt);
		clickElementThenTab(HowDidYouKnowAboutEnthrallIt);
		pause(4000);
		inputTextThenClickTab(HowDidYouKnowAboutEnthrallIt, "Social Media");
		pause(5000);

	}

	public void hightestEducationValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		clickElementThenTab(highest_education);
		pause(2000);
		selectDropdown(highest_education, "Graduate");
		pause(3000);
	}

	public void countryOfOriginValidation() {
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		clickElementThenTab(country_of_origin);
		pause(2000);
		selectDropdown(country_of_origin, "Bangladesh");
		pause(3000);
	}

	public void primaryLanguageValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		Actions actions = new Actions(driver);
		actions.moveToElement(primaryLanguage).build().perform();
		pause(3000);
		clickElement(primaryLanguage);
		pause(2000);
		selectDropdown(primaryLanguage, "Bengali");
		pause(3000);
	}

	public void signatureValidation() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);
		clickElementThenTab(signature);
		verifyLengthOfTheFieldContent(signature, Attribute.MAX_LENGTH, "150");
		inputTextThenClickTab(signature, "@##%&^*");
		verifyErrorMessageUnderTheField(Please_provide_your_full_name_as_above, Attribute.INNER_HTML,
				"Please provide your full name as above");
		inputTextThenClickTab(signature, "12345678888");
		verifyErrorMessageUnderTheField(Please_provide_your_full_name_as_above, Attribute.INNER_HTML,
				"Please provide your full name as above");
		// something missing
		verifyErrorMessageUnderTheField(signature_is_a_required_field, Attribute.INNER_HTML,
				"Please provide your full name as above");
		clearTextFromTheField(signature);
		clickElementThenTab(signature);
		pause(4000);
		inputTextThenClickTab(signature, "Purnota Sarker Pihu Kaha");
		pause(5000);
	}

	public void doubleClickToTheTermsAndCondition() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);
		Actions actions = new Actions(driver);
		actions.doubleClick(double_click_to_the_terms_and_condition).build().perform();
		clickElementThenTab(double_click_to_the_terms_and_condition);
		pause(3000);

	}

	public void clickSubmitButton() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(8000);
		clickElementThenTab(Submitbutton);
		pause(8000);

	}

	public void rightClickActionButton() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(8000);
		Actions actions = new Actions(driver);
		actions.moveToElement(rightClickAction).contextClick().build().perform();
		pause(6000);
		clickElement(rightClickAction);
		pause(3000);

	}

	public void rightClickActionBackButton() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(8000);
		// RightClickActionBackButton();
		Actions actions = new Actions(driver);
		actions.moveToElement(rightClickAction).contextClick().build().perform();
		pause(6000);
		clickElement(backButton);
		pause(8000);
		Alert alert = driver.switchTo().alert();
		pause(8000);
		System.out.println(alert.getText());
		pause(8000);
		alert.accept();
		pause(8000);
	}

// follow the common actions

	public void rightClickActionCancelButton() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(8000);
		// RightClickActionBackButton();
		Actions actions = new Actions(driver);
		actions.moveToElement(rightClickAction).contextClick().build().perform();
		pause(6000);
		clickElement(cancelButton);
		pause(3000);
	}

	// follow the common actions
	public void rightClickActionBackButton01() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(8000);
		rightClickActionAccept(driver, rightClickAction, backButton);
	}

	public void rightClickActionCancelButton01() {
		// pause(1000);
		// enroll_now_home_page_step_validation();
		pause(3000);
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		pause(8000);
		rightClickActionAccept(driver, rightClickAction, cancelButton);
	}
}
