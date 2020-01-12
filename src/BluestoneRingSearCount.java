import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneRingSearCount {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting
		System.out.println("launcing browser");
		Thread.sleep(2000);
		driver.manage().window().maximize(); //method chaining
		driver.get("https://www.bluestone.com/");
		System.out.println("loading url");
		
		WebElement search = driver.findElement(By.id("search_query_top_elastic_search"));
		search.sendKeys("ring",Keys.ENTER);
		
		List<WebElement> search1 = driver.findElements(By.xpath("//div[@class=\"grid-view browse-page-var2 g34 row grid-view-result-active\"]/descendant::ul[@class=\"product-grid search-box-result\"]/li"));
		int i=0;
		for (WebElement cnt : search1) {
			i=i+1;
		//	System.out.println(cnt.getText());
		}
		System.out.println("total no of count:" +i);
		

		
	}
}
