import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgkada
{
	@Test
	public void prize() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting
		System.out.println("launcing browser");
		Thread.sleep(2000);
		driver.manage().window().maximize(); //method chaining
		driver.get("https://www.bluestone.com/");
		System.out.println("loading url");
		
		WebElement menu = driver.findElement(By.xpath("//a[@href=\"https://www.bluestone.com/jewellery/rings.html\"]/parent::li[@class=\"menuparent repb\"]"));
		
		
		
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[contains(.,'Kadas')]")).click();
		    
		Reporter.log(menu.getText(),true);
		a.moveToElement(menu).build().perform();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class=\"odd-even-bg\"]/descendant::a[contains(.,'Diamond')]")).click();   //1 out off 7
		
		//driver.findElement(By.xpath("//a[contains(.,'Diamond')]/ancestor::ul[@class=\"odd-even-bg\"]")).click();
		
		//driver.findElement(By.xpath("//a[contains(.,'Diamond')]/ancestor::div[@class=\"wh-submenu medium-width\"]")).click();
		//driver.findElement(By.xpath("//li[@class=\"active\"]/a[@title=\"Diamond Rings\"]")).click();
		//a[contains(.,'Diamond')]/ancestor::div[@class="wh-submenu medium-width"]
		//a[@title="Diamond Rings"]/ancestor::ul[@class="odd-even-bg"]/ancestor::div[@class="wh-submenu medium-width"]
		//a[@title="Diamond Rings"]/ancestor::div[@class="wh-submenu medium-width"]
		//Thread.sleep(5000);
		//WebElement opt = driver.findElement(By.xpath("//span[@class=\"title style-fill i-right\"]/descendant::span[contains(.,'Price')]"));
		//span[@class="title style-fill i-right"]/ancestor::div[@class="top-filter-blocks"]
		
		WebElement optt = driver.findElement(By.xpath("//span[@class='title style-fill i-right']/ancestor::section[@id='Price-form']"));
		a.moveToElement(optt).build().perform();
		Thread.sleep(5000);
		Reporter.log(optt.getText(),true);		
			
	}
}
