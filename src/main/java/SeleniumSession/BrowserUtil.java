package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	private WebDriver driver;

	/**
	 * this method is used to initilize the driver on the basis of given browser
	 * name
	 * 
	 * @param browserName
	 * @return this return the specific browser driver
	 */
	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is :" + browserName);
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass the right browser...." + browserName);
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}

	public void launchurl(String url) {
		if (url == null) {
			System.out.println("url can not be a null");
			if (url.indexOf("https") == 0) {
				driver.get(url);
			}
		}
	}

	public String getPagetitle() {
		String title = driver.getTitle();
		System.out.println("page title:" + title);
		return title;
	}

	public String getPageurl() {
		String url = driver.getCurrentUrl();
		System.out.println("page CurrentUrl is :" + url);
		return url;
	}

	public void closebrowser() {
		if (driver != null) {
			driver.close();

		}
	}

	public void quitbrowser() {
		if (driver != null) {
			driver.quit();

		}

	}
}