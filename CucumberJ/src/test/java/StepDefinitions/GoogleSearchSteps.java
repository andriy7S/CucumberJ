package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {

	WebDriver driver = null;

//	@Given("browser is open")
//	public void browser_is_open() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@And("user is on Google Search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("NAVIGATING TO THE PAGE");
//		driver.navigate().to("https://google.ca");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() {
//		System.out.println("TYPING IN SOME TEXT");
//		driver.findElement(By.name("q")).sendKeys("Automation rules!");
//
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//		System.out.println("HITTING ENTER");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		System.out.println("NAVIGATED TO DESTINATION");
//		driver.getPageSource().contains("Automation rules");
//		
//		driver.close();
//		driver.quit();
//	}

}
