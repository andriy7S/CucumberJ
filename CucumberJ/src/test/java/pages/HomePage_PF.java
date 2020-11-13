package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage_PF {
	WebDriver driver;

	@FindBy(id = "logout")
	private WebElement btn_logout;

	public HomePage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	public void isLogoutBtnPresent() {
		driver.findElement(By.id("logout")).isDisplayed();
	}
}
