import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneGoldmine4 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize(); //method chaining
		driver.get("https://www.bluestone.com/");
		System.out.println("loading url");
		
		 driver.findElement(By.xpath("//div[@class='hp-gms-top']")).click();
	   // driver.findElement(By.xpath("//a[@title=\"Gold Mine 10+1 Monthly Plan\"]")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    
	    
		 Thread.sleep(2000);
	    WebElement actualamt=driver.findElement(By.xpath("//input[@class='text-input form-control required numeric multiple-of_100 min-value_1000']"));
	    actualamt.sendKeys("1000");
	    Thread.sleep(1000);
	    WebElement actualmail=driver.findElement(By.xpath("//input[@class=\"text-input form-control required email elowrcase input-lowercase\"]"));
	    actualmail.sendKeys("kk1@gmail.com");
	    
	  
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class=\"form-submit text-center auto-filled\"]/input[@class=\"btn btn-new col-xs-3\"]")).click();
	   // startnow.click();
	    Thread.sleep(1000);
	    
		  
	    String first = driver.getTitle();
		System.out.println(first);
		
		 driver.findElement(By.xpath("//input[@class='submit-checkout-save-address btn btn-s btn-pdp']")).click();
		 
		String second = driver.getTitle();
		System.out.println(second);
		if(first.equals (second))
		{
			System.out.println("fill required details");
		}
		
		 
	}

}
