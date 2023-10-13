package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url=driver.getCurrentUrl();
		if(url.contains("amazon")){
			System.out.println("PASS");
		}
	}

}
