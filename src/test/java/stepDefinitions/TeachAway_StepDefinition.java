package stepDefinitions;

import java.awt.List;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Cucumber.CucumberAutomation.BaseTest;
import Cucumber.CucumberAutomation.TeachAway_Validations;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.netty.handler.codec.http.multipart.FileUpload;

@RunWith(Cucumber.class)
public class TeachAway_StepDefinition extends BaseTest {

	// WebDriver driver = getDriver();
	String strURL = getProperty("URL");
	TeachAway_Validations fb = new TeachAway_Validations(strURL);

	@Given("^User is on the Teachaway Home page$")
	public void user_is_on_the_teachaway_home_page() throws Throwable {

		fb.validateHOmePage();
	}

	@Given("^User is displayed with All MegaMenu option Jobs, TEFL, TeachersCertification, Courses, HireTeachers$")
	public void user_is_displayed_with_all_megamenu_option_jobs_tefl_teacherscertification_courses_hireteachers()
			throws Throwable {
		fb.validateMegaMenuOptions();
	}

	@Then("^User clicks on Jobs Tab and Jobs options are displayed$")
	public void user_clicks_on_jobs_tab_and_jobs_options_is_displayed() throws Throwable {
		Scenario scenario;
		fb.validateJobsTab();
		// BaseTest.getScreenShot(scenario);
	}

	@And("^User is able to click on one of the options under Jobs tab$")
	public void user_is_able_to_click_on_one_of_the_options_under_jobs_tab() throws Throwable {
		fb.validateOptionsOnJobTab();
	}

	@Then("^User clicks on Tefl Tab and Tefl options are displayed$")
	public void user_clicks_on_tefl_tab_and_tefl_options_are_displayed() throws Throwable {
		fb.validateTEFLTab();
	}

	@And("^User is able to click on one of the options under TEFL tab$")
	public void user_is_able_to_click_on_one_of_the_options_under_tefl_tab() throws Throwable {
		fb.validateTEFLOptions();
	}

	@Then("^User clicks on Teachers Certification Tab and Teachers Certification options are displayed$")
	public void user_clicks_on_teachers_certification_tab_and_teachers_certification_options_are_displayed()
			throws Throwable {
		fb.validateTeacherCertificationTab();
	}

	@And("^User is able to click on one of the options under Teachers Certification tab$")
	public void user_is_able_to_click_on_one_of_the_options_under_teachers_certification_tab() throws Throwable {
		fb.validateTeacherCertificationOptions();
	}

	@Then("^User clicks on Courses Tab and Courses page is displayed$")
	public void user_clicks_on_courses_tab_and_courses_page_is_displayed() throws Throwable {
		fb.validateCoursesTab();
	}

	@Then("^User clicks on HireTeachers Tab and HireTeachers page is displayed$")
	public void user_clicks_on_hireteachers_tab_and_hireteachers_page_is_displayed() throws Throwable {
		fb.validateHireTeachersTab();
	}

}
