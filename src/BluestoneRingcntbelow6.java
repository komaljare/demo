import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BluestoneRingcntbelow6 {
	@Test
	public void ringbelowcnt() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting
		//System.out.println("launcing browser");
		Thread.sleep(2000);
		driver.manage().window().maximize(); //method chaining
		driver.get("https://www.bluestone.com/");
		//System.out.println("loading url");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.id("search_query_top_elastic_search"));
		//search.sendKeys("java");
		search.sendKeys("ring",Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//span[text()='Price']"));
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		a.moveToElement(menu).build().perform();
		Reporter.log(menu.getText(),true);
		
		
		Thread.sleep(3000);
		WebElement wcnt = driver.findElement(By.xpath("//span[text()=' Below ']"));
		Thread.sleep(1000);
		a.moveToElement(wcnt).build().perform();
		
		Reporter.log(wcnt.getText(),true);
		
		Thread.sleep(1000);
	}
		
}
