package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class DashboardTest extends BaseClass{
	

	/*
	 Test the methods from home page
	 */	
	@Test
public void dashboard_page_validetion_test() {
	dashboard.dashboard_page_validetion();
}
	@Test
	public void login_easy_step_test() {
		dashboard.login_easy_step();
	}
	@Test
	public void dashboard_aside_validation_step_test() {
		dashboard.dashboard_aside_validation_step();
	}
	@Test
	public void Automation_page_validation_step_test() {
		//dashboard.Automation_page_validation_step();
		dashboard.EnrollNowHomePageStepValidation();
	}
}
