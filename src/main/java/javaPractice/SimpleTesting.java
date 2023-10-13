package javaPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTesting{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://seb.se/?cmpid=google_brand_ad_x_varumarke&s_kwcid=AL!5917!3!575202107899!e!!g!!seb");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		}
		}
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)", "");
		
		driver.findElement(By.xpath("//a[contains(text(),'//button[contains(text(),'Accept only necessary cookies')]')]")).click();
		
		String title=driver.getTitle();
		System.out.println("seb home page title is"+title);
		

	}

}
