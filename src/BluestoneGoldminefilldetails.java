import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneGoldminefilldetails {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize(); //method chaining
		driver.get("https://www.bluestone.com/");
		System.out.println("loading url");
		
	 //   driver.findElement(By.xpath("//a[@title=\"Gold Mine 10+1 Monthly Plan\"]")).click();
		  driver.findElement(By.xpath("//div[@class='hp-gms-top']")).click();
	    Thread.sleep(2000);
	  
	    WebElement actualamt=driver.findElement(By.xpath("//input[@class='text-input form-control required numeric multiple-of_100 min-value_1000']"));
	    actualamt.sendKeys("1000");
	    WebElement actualmail=driver.findElement(By.xpath("//input[@class=\"text-input form-control required email elowrcase input-lowercase\"]"));
	    actualmail.sendKeys("kj112@gmail.com");
	    Thread.sleep(2000);
	      
	    
	    WebElement startnow =driver.findElement(By.xpath("//input[@class='btn btn-new col-xs-3']"));
	    startnow.click();
	  
	    
     //   System.out.println(startnow.getText());
        Thread.sleep(2000);
        WebElement mobno =driver.findElement(By.xpath("//input[@class='required min-length_10 numeric text-input form-control mobile-char mobile-number ']"));
        mobno.sendKeys("8788184526");
        WebElement fullnm =driver.findElement(By.xpath("//input[@class='required min-length_3 max-length_32 word text-input form-control ']"));
        fullnm.sendKeys("komalj");
        WebElement addr =driver.findElement(By.xpath("//textarea[@class='required min-length_6 max-length_200 text-input form-control ']"));
        addr.sendKeys("pune-solapur highway");
        WebElement pin =driver.findElement(By.xpath("//input[@class=\"required pincode text-input form-control \"]"));
        pin.sendKeys("412307");
        
        String first = driver.getTitle();
	    System.out.println(first);
	  	  
        
        driver.findElement(By.xpath("//input[@class='submit-checkout-save-address btn btn-s btn-pdp']")).click();
        
        WebElement nomnm = driver.findElement(By.xpath("//input[@class='required min-length_3 max-length_32 word text-input form-control']"));
        nomnm.sendKeys("abcde");
        WebElement relship = driver.findElement(By.xpath("//select[@id='nomineeRelationship']/option[4]"));
        relship.click();
        WebElement nationality = driver.findElement(By.xpath("//select[@id=\"nomineeNationality\"]/option[1]"));
        nationality.click();
        driver.findElement(By.name("_eventId_checkoutSaveAddressDetails")).click();
        
        String second = driver.getTitle();
		System.out.println(second);
		
		if(first!=second)
		{
			System.out.println("Navigating to payment page");
		}
		else
		{
			System.out.println("not navigating");
		}
		
        
        
        
	    
	
	  
	}
}
