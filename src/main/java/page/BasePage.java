package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//Random NumberMethod

public class BasePage {

	public int generateRandomNumber(int boundNum) {
		Random rnd = new Random();
		int generatedNum = rnd.nextInt(boundNum);
		return generatedNum;

	}

//Select(DROPDOWN) Method	

	public void selectFromDropDown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}

}
