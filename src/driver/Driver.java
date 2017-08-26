package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
	private static String CHROMEDRIVER_PATH = "C:\\Selenium\\chromedriver.exe";
	public WebDriver webDriver;

	public Driver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
		this.webDriver = new ChromeDriver(options);
	}

	public void close() {
		this.webDriver.close();
	}
	
	public WebDriver getWebDriver() {
		return this.webDriver;
	}
}
