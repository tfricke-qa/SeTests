package _main;

import org.openqa.selenium.By;
import driver.DriverUtil;
import elements.TextBoxElement;

public class SeTests {

	public static void main(String[] args) {
		try {
			DriverUtil.initDriver();
			DriverUtil.openPage("http://the-internet.herokuapp.com/");

			TextBoxElement tbABTesting = new TextBoxElement(By.linkText("A/B Testing"));
			tbABTesting.click();
		}
		catch (Exception ex) {
			System.exit(1);
		}
		finally {
			DriverUtil.closeDriver();
		}
	}

}
