package StepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("LOGIN PAGE");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("ENETERS USERNAME AND PASSWORD");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("CLICKING LOGIN");
	}

	@Then("user is navigating to the home page")
	public void user_is_navigating_to_the_home_page() {
		System.out.println("NAVIGATING TO HOME PAGE");
	}

}
