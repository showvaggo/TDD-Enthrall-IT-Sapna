package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = true, priority = 1)
	public void logo_test() {

		homePage.logo_validation();
	}

	@Test(enabled = true, priority = 2)
	public void title_test() {

		homePage.title_validation();
	}

	@Test(enabled = true, priority = 3)
	public void all_the_header_menu_test() {

		homePage.validation_for_all_header_menu();
	}

	@Test(enabled = true, priority = 4)

	public void scroll_into_redirect_page_and_validate_title_current_url_and_header_test() {

		homePage.scroll_into_redirect_page_and_validate_title_current_url_and_header();
	}

	@Test(enabled = true, priority = 5)
	public void all_the_footer_menu_test() {

		homePage.validation_for_all_footer_menu();
	}

	@Test(enabled = true, priority = 6)
	public void phone_and_email_test() {

		homePage.phone_and_email_validation();
	}

}
