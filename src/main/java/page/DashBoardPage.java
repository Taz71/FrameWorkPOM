package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage {

	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElement
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),' Dashboard ')]")
	WebElement DashBoard_Header_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/a/span[1]")WebElement CUSTOMER_MENU_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\\\"side-menu\\\"]/li[3]/a/span[1]")WebElement ADD_CUSTOMER_MENU_ELEMENT;

	// Intractable method

	public void validateDashboardPage() {
//      Assert.assertEquals(DashBoard_Header_ELEMENT.getText(),"Dashboard","Dashboard not found!!");
		Assert.assertTrue(DashBoard_Header_ELEMENT.isDisplayed(), "Dashboard");

	}
	
	public void clickCustomerMenuElement() {
		CUSTOMER_MENU_ELEMENT.click();
	}
	
	public void clickAddCustomerMenuElement() {
		ADD_CUSTOMER_MENU_ELEMENT.click();
	}
	

}