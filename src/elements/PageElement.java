package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driver.DriverUtil;

public abstract class PageElement {
	protected By bySelector;
	protected WebElement element;
	
	public PageElement(By bySelector) {
		this.bySelector = bySelector;
	}
	
	public void findElement() throws Exception {
		try {
			this.element = DriverUtil.getWebDriver().findElement(this.bySelector);
		}
		catch (Exception ex) {
			throw ex;
		}
	}
	
	public By getBySelector() {
		return bySelector;
	}
	public void setBySelector(By bySelector) {
		this.bySelector = bySelector;
	}
}
