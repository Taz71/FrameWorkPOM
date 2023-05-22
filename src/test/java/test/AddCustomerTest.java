package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFectory;

public class AddCustomerTest {

	WebDriver driver;

	String userName = "demo@techfios.com";
	String password = "abc123";

	@Test
	public void userShouldBeAbleToAddCustomer() {

		driver = BrowserFectory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.inserUserName(userName);
		loginPage.insertPassword(password);
		loginPage.ClickOnSigninButton();

		DashBoardPage dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		dashBoardPage.validateDashboardPage();
		dashBoardPage.clickAddCustomerMenuElement();
		dashBoardPage.clickAddCustomerMenuElement();
		
		AddCustomerPage addCustomer= PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomer.validateAddContactPage();

	}

}
