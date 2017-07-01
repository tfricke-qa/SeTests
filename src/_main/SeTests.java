package _main;

import org.openqa.selenium.By;
import driver.DriverUtil;
import elements.TextBoxElement;

public class SeTests {

	public static void main(String[] args) {
		try {
			DriverUtil.initDriver();
			DriverUtil.openPage("https://www.google.com");

			TextBoxElement tbSearch = new TextBoxElement(By.className("gsfi"));
			tbSearch.sendKeys("test");
			System.out.println();
		}
		catch (Exception ex) {
			System.exit(1);
		}
	}

}
