package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksSteps {

	WebDriver driver;

	@Before(order = 1)
	public void browserSetup() {

		System.out.println(" ======== I am inside browser setup ============");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Before(order = 0)
	public void setup2() {
		System.out.println("     <<<<<<<<<<<   I am iside setup 2   >>>>>>>>>>>>");
	}

	@After(order = 1)
	public void teardown() {

		System.out.println(" ========= I am inside teardown ============");
		driver.close();
		driver.quit();
	}

	@After(order = 2)
	public void teardown2() {
		System.out.println("     <<<<<<<<<<<   I am iside teardown 2   >>>>>>>>>>>>");
	}

	@BeforeStep
	public void beforeSteps() {
		System.out.println("    +++++++++++++ I am inside before steps  +++++++++++++   ");
	}

	@AfterStep
	public void afterSteps() {
		System.out.println("    +++++++++++++ I am inside after steps  +++++++++++++   ");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {

	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {

	}

	@Then("user is navigating to the home page")
	public void user_is_navigating_to_the_home_page() {

	}

}
