import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemodataProvider1 {
	@DataProvider
	public String[][] getData(){
		
		String[][] data = new String[3][2];
		data[0][0] = "komaljare7777@gmail.com";
		data[0][1] = "A146337387387287";
		
		data[1][0] = "komaljare@gmail.com";
		data[1][1] = "B1gjkd";
		
		data[2][0] = "komaljare11@gmail.com";
		data[2][1] = "rlkfC1ghjk";
		
		return data;
		}
	
	@Test(dataProvider = "getData")
		public void createUser(String un, String pw) throws InterruptedException
	{
		Reporter.log("create: " + un + " pwd: " + pw ,true);
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //upcasting
		System.out.println("launcing browser");
		Thread.sleep(2000);
		driver.manage().window().maximize(); //method chaining
		driver.get("https://www.gmail.com/");
		//driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		System.out.println("loading url");
		Thread.sleep(2000);
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement username = driver.findElement(By.id("identifierId"));
		 username.sendKeys(un); 
		 Thread.sleep(2000);
		 WebElement nextbtn = driver.findElement(By.id("identifierNext")); 
		 nextbtn.click(); 
		
		 
	     Thread.sleep(3000);
		 WebElement pass =driver.findElement(By.name("password"));
		 pass.sendKeys(pw,Keys.ENTER); //
		driver.close();
		 }
}
