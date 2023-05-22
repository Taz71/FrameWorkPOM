package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class LoginPage {

	WebDriver driver;

//	we define elements and intractable methods in page.
//	Elements 
	// WebElement List-*WebElement (Does not work with page object Model)/*By(Does
	// not work with page object Model

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@ type='submit']")
	WebElement SigninButton_ELEMENT;

// Corresponding method
	@Test
	public void inserUserName(String userName) {
		USERNAME_ELEMENT.sendKeys(userName);
	}

	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}

	public void ClickOnSigninButton() {
		SigninButton_ELEMENT.click();
	}

	public void performLogin(String userName, String password) {
		USERNAME_ELEMENT.sendKeys(userName);
		PASSWORD_ELEMENT.sendKeys(password);
		SigninButton_ELEMENT.click();
	}

}
