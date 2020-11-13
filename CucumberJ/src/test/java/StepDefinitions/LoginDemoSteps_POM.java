package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginDemoSteps_POM {

//	WebDriver driver;
//	LoginPage login;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//
//		System.out.println("=======STEPS POM ===========");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String userName, String password) {
//
//		login = new LoginPage(driver);
//		login.enterUsername(userName);
//		login.enterPassword(password);
//
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		login.clickLogin();
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		driver.findElement(By.id("logout")).isDisplayed();
//
//		driver.close();
//		driver.quit();
//	}

}
