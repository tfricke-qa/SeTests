package driver;

import org.openqa.selenium.WebDriver;

public class DriverUtil {
	public static Driver driver;

	public static void initDriver() throws Exception {
		driver = new Driver();
	}

	public static void openPage(String url) throws Exception {
		getWebDriver().get(url);
	}

	public static WebDriver getWebDriver() {
		return driver.getWebDriver();
	}
}
