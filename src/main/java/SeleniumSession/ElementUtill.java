package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtill {
	private WebDriver driver;
	
	public ElementUtill(WebDriver driver)
	{
		this.driver=driver;
	}
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public  void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
}
