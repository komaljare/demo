import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneGoldmine1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize(); //method chaining
		driver.get("https://www.bluestone.com/");
		System.out.println("loading url");
		
	  //  driver.findElement(By.xpath("//a[@title=\"Gold Mine 10+1 Monthly Plan\"]")).click();
	    driver.findElement(By.xpath("//div[@class='hp-gms-top']")).click();
	    WebElement startnow =driver.findElement(By.xpath("//input[@class='btn btn-new col-xs-3']"));
	    startnow.click();
	    WebElement errmsg=driver.findElement(By.xpath("//li[contains(.,'Amount is required')]"));
	    	System.out.println(errmsg.getText());
	    WebElement erremail=driver.findElement(By.xpath("//ul[@id='Email_error']/li[contains(.,'Email is required')]"));
	 	System.out.println(erremail.getText());
	}
}