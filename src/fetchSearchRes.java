import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fetchSearchRes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		System.out.println("launcing browser");
		Thread.sleep(2000);
		driver.manage().window().maximize(); // method chaining
		driver.get("https://www.google.com/");
		System.out.println("loading url");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("thanose",Keys.ENTER);
		WebElement searchres = driver.findElement(By.xpath("//div[@id='resultStats']/parent::div[@id='sbfrm_l']"));
		System.out.println(searchres.getText());
		System.out.println("-----------------------------------------");
		
		//WebElement img = driver.findElement(By.xpath("//canvas[@class=c3yYr]/parent::div[@jscontroller=zfndQe]"));
		//Actions a=new Actions(driver);
		Thread.sleep(3000);
		
		WebElement img = driver.findElement(By.xpath("//div[@jscontroller=\"zfndQe\"]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", img);
		//executor.executeScript("arguments[0].scrollIntoView()",img);
		Thread.sleep(10000);
		WebElement aftclicksear = driver.findElement(By.xpath("//div[@id=\"resultStats\"]"));
		System.out.println(aftclicksear.getText());
		Thread.sleep(3000);
		
			//	("//img[@jsname='fhaEZe']/ancestor::div[@class='Ftghae iirjIb']"));
	    //img.click();
		//a.moveToElement(img).build().perform().click();
	}

}
