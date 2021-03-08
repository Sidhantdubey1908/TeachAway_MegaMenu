package Cucumber.CucumberAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Scenario;
import junit.framework.Assert;

public class TeachAway_Validations extends BaseTest {

	@FindBy(xpath = "//*[@title='Jobs']")
	WebElement tabJobs;

	@FindBy(xpath = "//a[@title='Job Board']")
	WebElement optionJobBoard;

	@FindBy(xpath = "//input[@value='Search Jobs']")
	WebElement pageJobSearch;

	@FindBy(xpath = "//div[@class='ub-emb-overlay ub-emb-visible']//div[@class='ub-emb-iframe-wrapper ub-emb-visible']/button[@class='ub-emb-close']")
	WebElement btnClose;

	@FindBy(xpath = "//*[@title='Tefl']")
	WebElement tabTEFL;

	@FindBy(xpath = "//*[@title='TEFL Courses']")
	WebElement optionTeflCourses;

	@FindBy(xpath = "//h1[text()='Online TEFL certification']")
	WebElement pageTeflCourses;

	@FindBy(xpath = "//*[@title='Teacher Certification']")
	WebElement tabTeacherCertification;

	@FindBy(xpath = "//*[@title='Teacher Certification Guide']")
	WebElement optionTeacherCertiGuide;

	@FindBy(xpath = "//h1[text()='Alternative Teacher Certification")
	WebElement pageTeacherCertiGuide;

	@FindBy(xpath = "//*[@title='Courses']")
	WebElement tabCourses;

	@FindBy(xpath = "//h1[text()='Courses and Certifications")
	WebElement pageCourses;

	@FindBy(xpath = "//*[@title='Hire the world']")
	WebElement tabHireTeachers;

	@FindBy(xpath = "//h1[text()='Start recruiting great teachers")
	WebElement pageHireTeachers;

	public TeachAway_Validations(String strURL) {
		driver.get(strURL);
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
	}

	public void validateHOmePage() {
		try {

			Thread.sleep(3000);
			if (driver.findElements(By.xpath(
					"//div[@class='ub-emb-overlay ub-emb-visible']//div[@class='ub-emb-iframe-wrapper ub-emb-visible']/button[@class='ub-emb-close']"))
					.size() != 0) {
				btnClose.click();
				Thread.sleep(2000);
			}

			Assert.assertTrue(tabJobs.isDisplayed());
			System.out.println("Teachaway HomePage is displayed");

		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("Teachaway HomePage is not displayed");
		} catch (Error e) {
			System.out.println("Teachaway HomePage is not displayed");
		}
	}

	public void validateMegaMenuOptions() {
		try {

			// driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@class='ub-emb-iframe'])[1]")));
			List<WebElement> lstMegaMenu = driver.findElements(By.xpath("//ul[contains(@class,'tb-megamenu-nav')]/li"));
			if (lstMegaMenu.size() == 5) {
				System.out.println("All Mega Menu are displayed as expected");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("All Mega Menu are not displayed as expected");
		} catch (Error e) {
			System.out.println("All Mega Menu are not displayed as expected");
		}
	}

	public void validateJobsTab() {
		try {

			Assert.assertTrue(tabJobs.isDisplayed());
			tabJobs.click();

			Assert.assertTrue(optionJobBoard.isDisplayed());
			System.out.println("User is able to click on Jobs tab and Jobs option are displayed");

		} catch (Exception e) {
			System.out.println("User is not able to click on Jobs tab and Jobs option are not displayed");

		} catch (Error e) {
			System.out.println("User is not able to click on Jobs tab and Jobs option are not displayed");

		}
	}

	public void validateOptionsOnJobTab() {
		try {

			Assert.assertTrue(optionJobBoard.isDisplayed());
			optionJobBoard.click();
			Thread.sleep(3000);

			Assert.assertTrue(pageJobSearch.isDisplayed());

			System.out.println("User navigates to the Jobs Search page when Jobs Board is selected under Jobs tab");

		} catch (Exception e) {
			System.out.println("User not navigates to Job search page");

		} catch (Error e) {
			System.out.println("User not navigates to Job search page");

		}

	}

	public void validateTEFLTab() {
		try {
			Assert.assertTrue(tabTEFL.isDisplayed());
			tabTEFL.click();

			Assert.assertTrue(optionTeflCourses.isDisplayed());
			System.out.println("User is able to click on TEFL tab and TEFL options are displayed");

		} catch (Exception e) {
			System.out.println("User is not able to click on TEFL tab and TEFL option are not displayed");

		} catch (Error e) {
			System.out.println("User is not able to click on TEFL tab and TEFL option are not displayed");

		}

	}

	public void validateTEFLOptions() {
		try {
			Assert.assertTrue(optionTeflCourses.isDisplayed());
			optionTeflCourses.click();
			Thread.sleep(3000);

			Assert.assertTrue(pageTeflCourses.isDisplayed());

			System.out
					.println("User navigates to the TEFL courses when TEFL courses is selected under TEFL options tab");

		} catch (Exception e) {
			System.out.println("User not navigates to TEFL courses page");

		} catch (Error e) {
			System.out.println("User not navigates to TEFL courses page");
		}

	}

	public void validateTeacherCertificationTab() {
		try {
			Assert.assertTrue(tabTeacherCertification.isDisplayed());
			tabTeacherCertification.click();

			Assert.assertTrue(optionTeacherCertiGuide.isDisplayed());
			System.out.println("User is able to click on Teachers Certi tab and TTeachers Certi options are displayed");

		} catch (Exception e) {
			System.out.println(
					"User is not able to click on Teachers Certi tab and Teachers Certi option are not displayed");

		} catch (Error e) {
			System.out.println(
					"User is not able to click on Teachers Certi tab and Teachers Certi option are not displayed");

		}

	}

	public void validateTeacherCertificationOptions() {
		try {

			Assert.assertTrue(optionTeacherCertiGuide.isDisplayed());
			optionTeacherCertiGuide.click();
			Thread.sleep(5000);

			Assert.assertTrue(pageTeacherCertiGuide.isDisplayed());

			System.out.println(
					"User navigates to the Teachers Certi Guide when Teachers Certi Guide is selected under Teachers Certification tab");

		} catch (Exception e) {
			System.out.println("User not navigates to the Teachers Certi Guide");

		} catch (Error e) {
			System.out.println("User not navigates to the Teachers Certi Guide");

		}

	}

	public void validateCoursesTab() {
		try {

			Assert.assertTrue(tabCourses.isDisplayed());
			tabCourses.click();

			Thread.sleep(5000);
			Assert.assertTrue(pageCourses.isDisplayed());
			System.out.println("User is able to click on Courses tab and Courses page is displayed");

		} catch (Exception e) {
			System.out.println("User is not able to click on Courses tab and Courses page is not displayed");

		} catch (Error e) {
			System.out.println("User is not able to click on Courses tab and Courses page is not displayed");
		}

	}

	public void validateHireTeachersTab() {
		try {
			Assert.assertTrue(tabHireTeachers.isDisplayed());
			tabHireTeachers.click();

			Thread.sleep(5000);
			Assert.assertTrue(pageHireTeachers.isDisplayed());
			System.out.println("User is able to click on HireTeachers tab and HireTeachers page is displayed");

		} catch (Exception e) {
			System.out.println("User is not able to click on HireTeachers tab and HireTeachers page is not displayed");

		} catch (Error e) {
			System.out.println("User is not able to click on HireTeachers tab and HireTeachers page is not displayed");
		}

	}

}
