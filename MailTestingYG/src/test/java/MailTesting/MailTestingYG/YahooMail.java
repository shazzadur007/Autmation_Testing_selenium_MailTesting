package MailTesting.MailTestingYG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooMail extends driverSetup {
	public static String URL = "https://www.yahoo.com";
	public static String message = "Hi! this is Shazzadur Rahman";
	public static String Text;

	@BeforeTest
	public static void login() throws InterruptedException {
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@class='_yb_jvztu']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("shazzad_mohammad@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Shazzad5917");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@id='ybarMailLink']")).click();
		Thread.sleep(1000);

	}
	@Test(priority=1)
	
	public static void mail() throws InterruptedException{
		driver.findElement(By.xpath("//a[@data-test-id='compose-button']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("shazzadur.rahman007@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Automated mail");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Hi! this is Shazzadur Rahman");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Send this email']")).click();
		Thread.sleep(1000);
		
	}
	@Test(priority=2)
	public static void validateMessage() throws InterruptedException{
		driver.findElement(By.xpath("//a[@href='/d/folders/2']")).click();
		Text=driver.findElement(By.xpath("//div[@class='en_3ixhM o_h a_6D6F D_F ab_C']")).getText();
		
		if(Text.equalsIgnoreCase(message)) {
			System.out.println("Successfully send Message");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("There will be some issue. Try again.");
			Assert.assertTrue(false);
		}
	}
	@Test (priority = 3)
	public static void logout()throws InterruptedException{
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//label[@id='ybarAccountMenuOpener']"))).build().perform();
		driver.findElement(By.xpath("//a[@class='_yb_tdi30 _yb_po6e2 _yb_m78yl _yb_16g61 _yb_1delc']")).click();
		Thread.sleep(3000);
	}
	

}
