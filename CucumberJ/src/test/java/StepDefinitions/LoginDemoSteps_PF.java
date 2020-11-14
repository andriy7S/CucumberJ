package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.LoginPage_PF;
import pages.HomePage_PF;
import pages.LoginPage;

public class LoginDemoSteps_PF {

//	WebDriver driver;
//	LoginPage_PF login;
//	HomePage_PF home;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//
//		System.out.println("=======STEPS PAGE FACTORY ===========");
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
//		login = new LoginPage_PF(driver);
//		login.enterUserName(userName);
//		login.enterPassword(password);
//
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		login.clickOnLogin();
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		home = new HomePage_PF(driver);
//		home.isLogoutBtnPresent();
//
//		driver.close();
//		driver.quit();
//	}

}
