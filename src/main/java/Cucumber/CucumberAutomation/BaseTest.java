package Cucumber.CucumberAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Scenario;

public class BaseTest {

	public static WebDriver driver;

	public static WebDriver getDriver() {

		String browser = getProperty("browser");
		try {
			if (browser.equals("chrome")) {

				/*
				 * System.setProperty("webdriver.chrome.driver",
				 * "C:\\Users\\91893\\Downloads\\chromedriver_win32\\chromedriver.exe");
				 */

				System.setProperty("webdriver.chrome.driver", "D:\\TeachAway_Automation\\drivers\\chromedriver.exe");

				driver = new ChromeDriver();

			} else if (browser.equals("firefox")) {

				System.setProperty("webdriver.gecko.driver", "D:\\TeachAway_Automation\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();

			}
		} catch (Exception e) {
			System.out.println("Driver not launch");
		}
		return driver;

	}

	public static void getScreenShot(Scenario scenario) {

		// File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		// FileUtils.copyFile(screenshot, new File("target\\screenshots\\src.png"));

		scenario.attach(screenshot, "image/png", "ss");
	}

	public static String getProperty(String strProp) {
		String strValue = "";
		try {
			Properties prop = new Properties();
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/java/Global.properties");
			prop.load(file);

			strValue = prop.getProperty(strProp);
		} catch (Exception e) {

		}

		return strValue;
	}
}
