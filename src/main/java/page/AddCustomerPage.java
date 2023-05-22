package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

//	WebElements

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add Contact')]")
	WebElement ADD_CONTACT_PAGE;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULLNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[@class='select2-selection__rendered']")
	WebElement country_dropdown_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement SAVE_BUTTON;

//	Intractable Method

	public void validateAddContactPage() {
		Assert.assertTrue(ADD_CONTACT_PAGE.isDisplayed(), "ADD_CONTACT_PAGE is not found");
	}

	public void insertFullName(String fullName) {
		FULLNAME_ELEMENT.sendKeys(fullName + generateRandomNumber(999));
	}

	public void selectCompany(String company) {
		selectFromDropDown(COMPANY_DROPDOWN_ELEMENT, company);
	}

	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNumber(9999) + email);
	}
}
