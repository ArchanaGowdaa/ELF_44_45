package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		Thread.sleep(1000);
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot Username / Login Password")).click();
		Thread.sleep(1000);
		Set<String> window = driver.getWindowHandles();
		System.out.println(window.size());
		for (String string : window) {
			driver.switchTo().window(string);
		}
		driver.findElement(By.id("nextStep")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("ArchanaGowda");
		Thread.sleep(2000);
		driver.findElement(By.id("accountNo")).sendKeys("12345678912");
		Thread.sleep(2000);
		driver.findElement(By.id("selCountry")).click();
		Thread.sleep(2000);
//		driver.findElement(By.id("India")).click();
//		Thread.sleep(2000);
		driver.findElement(By.id("mobileNo")).sendKeys("9880776903");
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker5")).sendKeys("22/04/1999");
		Thread.sleep(2000);
		driver.findElement(By.name("captchaValue")).sendKeys("FRHJIK");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
	}

}
