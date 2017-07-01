package elements;

import org.openqa.selenium.By;

import elements.PageElement;

public class TextBoxElement extends PageElement {

	public TextBoxElement(By bySelector) {
		super(bySelector);
	}
	
	public void sendKeys(String keys) throws Exception {
		try {
			this.findElement();
			this.element.sendKeys(keys);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
