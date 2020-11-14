package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Background/Background.feature", glue = { "StepsForBackground" }, 
         monochrome = true, 
         plugin = { "pretty", "html:target/HtmlReports/htmlreport.html", "json:target/JSONReports/report.json",
		"junit:target/JUnitReports/report.xml" })
public class TestRunnerForBackground {

}
