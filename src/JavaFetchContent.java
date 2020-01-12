//Assignment 13-12-19
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaFetchContent {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting
		System.out.println("launcing browser");
		Thread.sleep(2000);
		driver.manage().window().maximize(); //method chaining
		driver.get("https://www.google.com/");
		System.out.println("loading url");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("java");
		Thread.sleep(2000);
		
		System.out.println("-----------suggestions--------------");
		Actions a=new Actions(driver);
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		//WebElement menu = driver.findElement(By.xpath("//b[contains(.,'script')]/ancestor::ul[@class='erkvQe']"));
		for(WebElement sugg:suggestion)
		{
		System.out.println(sugg.getText());
		a.moveToElement(sugg).build().perform();
		Thread.sleep(1000);
		}
		
		System.out.println("-------------click and print-------------");
		WebElement option= driver.findElement(By.xpath("//ul[@class='erkvQe']/descendant::b[contains(.,'script')]"));
		System.out.println(option.getText());
		option.click();
		Thread.sleep(1000);
		
	}
}
