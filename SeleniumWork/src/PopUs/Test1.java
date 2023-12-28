package PopUs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot Username / Login Password")).click();
		Thread.sleep(1000);
		Set<String> window = driver.getWindowHandles();
		for (String string : window) {
			driver.switchTo().window(string);
		}
		Dimension size=new Dimension(driver.manage().window().getSize().getWidth() + 100,
				driver.manage().window().getSize().getHeight() + 100);
		driver.manage().window().setSize(size);
		Thread.sleep(1000);
		driver.findElement(By.id("nextStep")).click();
		Thread.sleep(1000);
		//invalid data
		driver.findElement(By.id("userName")).sendKeys("@");
		driver.findElement(By.name("Submit")).click();
		Alert alert=driver.switchTo().alert();
		String Simple = alert.getText();
		System.out.println(Simple);
		alert.accept();
		Navigation navigate = driver.navigate();
		navigate.refresh();
		driver.findElement(By.id("userName")).sendKeys("Archana");
		Thread.sleep(1000);
		driver.findElement(By.id("accountNo")).sendKeys("12345678");
		driver.findElement(By.name("Submit")).click();
		Alert alert1=driver.switchTo().alert();
		String Simple1 = alert.getText();
		System.out.println(Simple1);
		alert.accept();
		Navigation navigate1 = driver.navigate();
		navigate1.refresh();
		driver.findElement(By.id("userName")).sendKeys("Archana");
		Thread.sleep(1000);
		driver.findElement(By.id("accountNo")).sendKeys("12345678912");
		Thread.sleep(1000);
		driver.findElement(By.id("mobileNo")).sendKeys("9880776");
		driver.findElement(By.name("Submit")).click();
		Alert alert2=driver.switchTo().alert();
		String Simple2 = alert.getText();
		System.out.println(Simple2);
		alert.accept();
		Navigation navigate2 = driver.navigate();
		navigate2.refresh();
		Thread.sleep(1000);
		driver.findElement(By.id("datepicker5")).sendKeys("22=april=1");
		driver.findElement(By.name("Submit")).click();
		Alert alert3=driver.switchTo().alert();
		String Simple3 = alert.getText();
		System.out.println(Simple3);
		alert.accept();
		Thread.sleep(1000);
		driver.findElement(By.name("captchaValue")).sendKeys("FJIK");
		driver.findElement(By.name("Submit")).click();
		Alert alert4=driver.switchTo().alert();
		String Simple4 = alert.getText();
		System.out.println(Simple4);
		alert.accept();
		
		
//		driver.findElement(By.id("accountNo")).sendKeys("12345678");
//		driver.findElement(By.name("Submit")).click();
//		Alert alert1=driver.switchTo().alert();
//		String Simple1 = alert.getText();
//		System.out.println(Simple1);
//		alert.accept();
//		
//		driver.findElement(By.id("mobileNo")).sendKeys("9880776");driver.findElement(By.name("Submit")).click();
//		Alert alert2=driver.switchTo().alert();
//		String Simple2 = alert.getText();
//		System.out.println(Simple2);
//		alert.accept();
//	
//		driver.findElement(By.id("datepicker5")).sendKeys("22=april=1");
//		Alert alert3=driver.switchTo().alert();
//		String Simple3 = alert.getText();
//		System.out.println(Simple3);
//		alert.accept();
//
//		driver.findElement(By.name("captchaValue")).sendKeys("FJIK");
//		Alert alert4=driver.switchTo().alert();
//		String Simple4 = alert.getText();
//		System.out.println(Simple4);
//		alert.accept();
	
		;
		
	}

}
