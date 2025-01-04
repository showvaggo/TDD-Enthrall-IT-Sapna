package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class DashboardTest extends BaseClass {

	public void dashboard_page_validetion() {

		dashboard.login_page_validation();

		dashboard.dashboard_page_validation();
	}

	@Test
	public void landing_on_login_page() {

		dashboard.login_page_validation();
	}

	@Test
	public void enroll_now_home_page_stap_test() {

		dashboard.enroll_now_home_page_step_validation();
	}

	@Test
	public void landing_on_dashboard_aside_step_test() {

		dashboard.dashboard_aside_validation_step();
	}

	@Test
	public void landing_on_automation_page_test() {

		dashboard.enroll_now_home_page_step_validation();

		dashboard.firstNameValidation();

		dashboard.middleNameValidation();

		dashboard.lastNameValidation();

		dashboard.iAmDropdownBtnValidation();

		dashboard.courseWishToEnrollValidation();

		dashboard.phoneNumberValidation();

		dashboard.emailAddressValidation();

		dashboard.passwordValidation();

		dashboard.genderValidation();

		dashboard.personalImageValidation();

		dashboard.photoIdImageValidation();

		dashboard.birthYearValidation();

		dashboard.birthMonthValidation();

		dashboard.birthDateValidation();

		dashboard.homeAdressLine1Validation();

		dashboard.homeAdressLine2Validation();

		dashboard.cityValidation();

		dashboard.stateValidation();

		dashboard.zipCodeValidation();

		dashboard.immigrationStatusValidation();

		dashboard.dateOfArrivalValidation();

		dashboard.emargencyContactValidation();

		dashboard.howDidYouKnowAboutEnthrallItValidation();

		dashboard.hightestEducationValidation();

		dashboard.countryOfOriginValidation();

		// dashboard.PrimaryLanguageValidation();

		dashboard.signatureValidation();

		dashboard.doubleClickToTheTermsAndCondition();

		dashboard.clickSubmitButton();

		dashboard.rightClickActionButton();

		// dashboard.rightClickActionBackButton01();

		// dashboard.rightClickActionCancleButton01();
	}

	@Test(enabled = true, priority = 1)
	public void firstNameValidationTest() {

		dashboard.firstNameValidation();
	}

	@Test(enabled = true, priority = 2)
	public void middleNameValidation() {

		dashboard.middleNameValidation();
	}

	@Test(enabled = true, priority = 3)
	public void lastNameValidationTest() {

		dashboard.lastNameValidation();
	}

	@Test(enabled = true, priority = 4)
	public void iAmDropdownBtnValidationTest() {

		dashboard.iAmDropdownBtnValidation();
	}

	@Test(enabled = true, priority = 5)
	public void courseWishToEnrollValidationTest() {

		dashboard.courseWishToEnrollValidation();

	}

	@Test(enabled = true, priority = 6)
	public void phoneNumberValidationTest() {

		dashboard.phoneNumberValidation();

	}

	@Test(enabled = true, priority = 7)
	public void emailAddressTest() {

		dashboard.emailAddressValidation();
	}

	@Test(enabled = true, priority = 8)
	public void passwordTest() {

		dashboard.passwordValidation();
	}

	@Test(enabled = true, priority = 9)
	public void genderTest() {

		dashboard.genderValidation();
	}

	@Test(enabled = true, priority = 10)
	public void personalImageTest() {

		dashboard.personalImageValidation();
	}

	@Test(enabled = true, priority = 11)
	public void photoIdImageTest() {

		dashboard.photoIdImageValidation();
	}

	@Test(enabled = true, priority = 12)
	public void birthYearTest() {

		dashboard.birthYearValidation();
	}

	@Test(enabled = true, priority = 13)
	public void birthMonthTest() {

		dashboard.birthMonthValidation();
	}

	@Test(enabled = true, priority = 14)
	public void birthDateTest() {

		dashboard.birthDateValidation();
	}

	@Test(enabled = true, priority = 15)
	public void homeAdressLine1Test() {

		dashboard.homeAdressLine1Validation();
	}

	@Test(enabled = true, priority = 16)
	public void homeAdressLine2Test() {

		dashboard.homeAdressLine2Validation();
	}

	@Test(enabled = true, priority = 17)
	public void cityTest() {

		dashboard.cityValidation();
	}

	@Test(enabled = true, priority = 18)
	public void stateTest() {

		dashboard.stateValidation();
	}

	@Test(enabled = true, priority = 19)
	public void ZipcodeTest() {

		dashboard.zipCodeValidation();
	}

	@Test(enabled = true, priority = 20)
	public void immigrationStatusTest() {

		dashboard.immigrationStatusValidation();
	}

	@Test(enabled = true, priority = 21)
	public void dateOfArrivalTest() {

		dashboard.dateOfArrivalValidation();
	}

	@Test(enabled = true, priority = 22)
	public void emmergencyContactTest() {

		dashboard.emargencyContactValidation();
	}

	@Test(enabled = true, priority = 23)
	public void howDidYouKnowAboutEnthrallItTest() {

		dashboard.howDidYouKnowAboutEnthrallItValidation();

	}

	@Test(enabled = true, priority = 24)
	public void highestEducationTest() {

		dashboard.hightestEducationValidation();
	}

	@Test(enabled = true, priority = 25)
	public void countryOfOriginTest() {

		dashboard.countryOfOriginValidation();
	}

	@Test(enabled = false, priority = 26)
	public void primaryLanguageTest() {

		dashboard.primaryLanguageValidation();
	}

	@Test(enabled = true, priority = 27)
	public void signatureTest() {

		dashboard.signatureValidation();
	}

	@Test(enabled = true, priority = 28)
	public void doubleClickToTheTurmsAndCondition() {

		dashboard.doubleClickToTheTermsAndCondition();
	}

	@Test(enabled = true, priority = 29)
	public void clickSubmitButtonTest() {

		dashboard.clickSubmitButton();

	}

	@Test(enabled = true, priority = 30)
	public void rightClickActionButtonTest() {

		dashboard.rightClickActionButton();
	}

	@Test(enabled = false, priority = 31)
	public void RightClickActionBackButtonTest() {

		dashboard.rightClickActionBackButton();
	}

	@Test(enabled = false, priority = 32)
	public void RightClickActionCancleButtonTest() {

		dashboard.rightClickActionCancelButton();
	}

	@Test
	public void RightClickActionBackButton01Test() {

		dashboard.rightClickActionBackButton01();// common action
	}

	@Test
	public void rightClickActionCancleButton01() {

		dashboard.rightClickActionCancelButton01();// common action
	}

}
