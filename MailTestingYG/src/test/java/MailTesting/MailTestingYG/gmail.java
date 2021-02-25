package MailTesting.MailTestingYG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class gmail extends driverSetup {
	public static String baseURL = "http://www.gmail.com";

	@Test
	public static void login() throws InterruptedException {

		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("shazzadur.rahman007@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'VfPpkd-RLmnJb')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Shazzad5917");
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']//div[@class='VfPpkd-RLmnJb']"))
				.click();
		Thread.sleep(10000);


	}
}
