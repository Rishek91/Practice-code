package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "chrome";
		WebDriver driver = null;
		
		if (browser.equals("chrome")){
			driver= new ChromeDriver ();
		}else if (browser.equals("firefox")){
			driver= new FirefoxDriver ();
		}
		else if (browser.equals("safari")){
			driver= new SafariDriver();
		}
		else if (browser.equals("edge")){
			driver= new EdgeDriver();
		}
		else{
			System.out.println("please pass the right browser"+browser);
		}
		driver.get("https://www.google.com");
		String actualtitle = driver.getTitle();
		System.out.println("page title:" + actualtitle);

		if (actualtitle.equals("Google")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		driver.quit();

	}
}