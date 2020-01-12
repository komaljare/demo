import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demodataprovider {
	@DataProvider
	public String[][] getData(){
		
		String[][] data = new String[3][2];
		data[0][0] = "user A";
		data[0][1] = "A1";
		
		data[1][0] = "user B";
		data[1][1] = "B1";
		
		data[2][0] = "user C";
		data[2][1] = "C1";
		
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
		driver.get("https://www.facebook.com/");
		//driver.navigate().to("https://facebook.dev/");//2ways- driver.get(); and driver.navigate().to();
		System.out.println("loading url");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(un);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(pw);
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();

	}
	
	
}


