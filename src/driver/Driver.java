package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	private static String CHROMEDRIVER_PATH = "C:\\Selenium\\chromedriver.exe";
	public WebDriver webDriver;

	public Driver() {
		System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
		this.webDriver = new ChromeDriver();
	}

	public WebDriver getWebDriver() {
		return this.webDriver;
	}
}
