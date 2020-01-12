//12-12-19 Assignment search ring then click first ring
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Bluestonering {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting
		System.out.println("launcing browser");
		Thread.sleep(2000);
		driver.manage().window().maximize(); //method chaining
		driver.get("https://www.bluestone.com/");
		System.out.println("loading url");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.id("search_query_top_elastic_search"));
		//search.sendKeys("java");
		search.sendKeys("ring",Keys.ENTER);
		
	   // WebElement img = driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']/ancestor::section"));
	    WebElement img = driver.findElement(By.xpath("//img[@alt='The Nury Vanki Ring']"));
		img.click();
		
}
}
