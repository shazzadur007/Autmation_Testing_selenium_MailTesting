package MailTesting.MailTestingYG;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class driverSetup {
	
	public static WebDriver driver;
	public static WebElement element;
	
	@BeforeSuite
	public static void Driver()throws InterruptedException{
		System.setProperty("webdriver.chorme.driver", "C:\\WebDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
	}
	@AfterSuite
	public static void close() {
		driver.close();
	}
	
	

}
