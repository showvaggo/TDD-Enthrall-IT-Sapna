package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class LoginPageTest extends BaseClass {

	@Test(enabled = true, priority = 1)
	public void logoValidation() {

		loginPage.logoValidation();
	}

	@Test(enabled = true, priority = 2)
	public void titleValidation() {

		loginPage.titleValidation();
	}

	@Test(enabled = true, priority = 3)
	public void Login_headerTest() {

		loginPage.click_login_button();
	}

	@Test(enabled = true, priority = 4)
	public void login_page_url_validationTest() {

		loginPage.login_page_url_validation();
	}

	@Test(enabled = true, priority = 5)
	public void login_page_validation_test() {

		loginPage.login_steps_validation();
	}

}
