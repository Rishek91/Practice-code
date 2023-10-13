package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String browsername="chrome";
		BrowserUtil brUtill= new BrowserUtil();
		WebDriver driver=brUtill.initDriver(browsername);
		brUtill.launchurl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(5000);
		String title=brUtill.getPagetitle();
		System.out.println(title);
		//by locator 
		By firstname=By.id("input-firstname");
		By lastname=By.id("input-lastname");
		By email=By.id("input-email");
		By telephone=By.id("input-telephone");
		By password=By.id("input-password");
		By confirmpassword=By.id("input-confirm");
		ElementUtill eleutill=new ElementUtill (driver);
		eleutill.doSendkeys(firstname,"ajay");
		eleutill.doSendkeys(lastname,"kumar");
		eleutill.doSendkeys(email,"rishek91@gmail.com");
		eleutill.doSendkeys(telephone,"1234567890");
		eleutill.doSendkeys(password,"12345");
		eleutill.doSendkeys(confirmpassword,"12345");
	}

}
