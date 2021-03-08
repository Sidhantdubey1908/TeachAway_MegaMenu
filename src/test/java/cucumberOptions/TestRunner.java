package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue ="stepDefinitions",
		//tags="@SmokeTest",
		//dryRun=true,
		monochrome=true,
		strict=true,
		plugin = {"pretty", "html:target/TeachAway_MegaMenu.html", "json:target/cucumber.json", "junit:target/cukes.xml"}
		)
public class TestRunner {

}
