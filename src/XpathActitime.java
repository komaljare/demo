//9-12-2019 Assignment 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathActitime {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting
		System.out.println("launcing browser");
		Thread.sleep(2000);
		driver.manage().window().maximize(); //method chaining
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("loading url");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//td[@id=\"headerContainer\"]"));
		//System.out.println(username.getText());
		String name=username.getText();
		driver.findElement(By.xpath("//td[@valign=\"middle\"]/input[@type=\"text\"]")).sendKeys(name);
		
		WebElement pass = driver.findElement(By.xpath("//td[@id=\"headerContainer\"]"));
		System.out.println(pass.getText());
		driver.findElement(By.xpath("//td[@valign=\"middle\"]/input[@type=\"password\"]")).sendKeys(pass.getText(),Keys.ENTER);
		
		Thread.sleep(5000);
		WebElement errormsg = driver.findElement(By.xpath("//td[@valign=\"top\"]/span[@class=\"errormsg\"]"));
		System.out.println(errormsg.getText());
		
		
}
}
