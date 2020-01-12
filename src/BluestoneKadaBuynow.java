import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneKadaBuynow {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting
		System.out.println("launcing browser");
		Thread.sleep(2000);
		driver.manage().window().maximize(); //method chaining
		driver.get("https://www.bluestone.com/");
		System.out.println("loading url");
		
		WebElement menu = driver.findElement(By.xpath("//a[@href=\"https://www.bluestone.com/jewellery.html\"]/parent::li[@class=\"menuparent\"]"));
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		a.moveToElement(menu).build().perform();
		System.out.println(menu.getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(.,'Kadas')]")).click();
		//List<WebElement> submenu = driver.findElements(By.xpath("//img[@class='hc img-responsive center-block']/ancestor::section"));
		WebElement submenu = driver.findElement(By.xpath("//img[@alt='The Ranveer Kada for Him']"));
		submenu.click();
		
		Thread.sleep(1000);
		Set<String> wins = driver.getWindowHandles();  
		for(String win:wins)
		{
			System.out.println(win);
			driver.switchTo().window(win);
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"buy-now\"]")).click();
		Thread.sleep(1000);
		
		WebElement errmsg = driver.findElement(By.xpath("//div[@class=\"formErrorContent\"]"));
		System.out.println(errmsg.getText());
		
	}
	}



