package pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {

	WebDriver driver;

	// @CacheLookup
	@FindBy(id = "name")
	private WebElement txt_userName;

	@FindBy(id = "password")
	private WebElement txt_password;

	@FindBy(id = "login")
	private WebElement btn_login;
	
//	@FindBy(partialLinkText = "somelinks")
//	private List<WebElement> links;
	
//	@FindBy(how = How.ID, using = "something")
//	private WebElement something;

	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	public void enterUserName(String userName) {
		txt_userName.sendKeys(userName);
	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickOnLogin() {
		btn_login.click();
	}

}
