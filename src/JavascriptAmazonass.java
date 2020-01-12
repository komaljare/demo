import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAmazonass {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting
		System.out.println("launching browser");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize(); //method chaining
		driver.get("https://www.amazon.in/");
		System.out.println("loading url");
		Thread.sleep(2000);
		ScreenShotSave.screenShot(driver, "Amazon1");
		 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
		ScreenShotSave.screenShot(driver, "Amazon2");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
	}
		
}
