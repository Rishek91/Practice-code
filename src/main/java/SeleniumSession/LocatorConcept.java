package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// driver.findElement(By.id("input-email")).sendKeys("rishek91@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("123");

//	WebElement emailid=driver.findElement(By.id("input-email"));
//	WebElement password=driver.findElement(By.id("input-password"));
//	
//	emailid.sendKeys("rishek91@gmail.com");
//	password.sendKeys("123");

		By emailid = By.id("input-email");
		By password = By.id("input-password");
		doSendkeys(emailid ,"rishek91@gmail.com");
		doSendkeys(password ,"123");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
}