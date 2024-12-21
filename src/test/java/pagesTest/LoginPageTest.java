package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class LoginPageTest extends BaseClass {
	/*
	 * Test the methods from home page
	 */
	@Test
	public void logoValidation() {
		loginPage.logoValidation();
	}

	@Test
	public void titleValidation() {
		loginPage.titleValidation();
	}

	@Test
	public void Login_headerTest() {
		loginPage.click_login_button();
	}

	@Test
	public void login_page_url_validationTest() {

		loginPage.login_page_url_validation();
	}

	@Test
	public void login_page_validation_test() {
		
		loginPage.login_steps_validation();
	}

	
}
