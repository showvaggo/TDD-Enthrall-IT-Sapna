package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	/*
	 * Test the methods from home page
	 */
	@Test
	public void logoTest() {
		homePage.logoValidation();
	}

	@Test
	public void titleTest() {
		homePage.titleValidation();
	}

	@Test
	public void allTheHeaderMenuTest() {
		homePage.validationForAllHeaderMenu();
	}
	@Test

	public void scroll_into_redirect_page_and_validate_title_current_url_and_header_test() {

		homePage.scroll_into_redirect_page_and_validate_title_current_url_and_header();
	}

	@Test
	public void allTheFooterMenuTest() {
		homePage.validationForAllFooterMenu();
	}

	@Test
	public void phoneAndEmailTest() {
		homePage.phoneAndEmailValidation();
	}

}
