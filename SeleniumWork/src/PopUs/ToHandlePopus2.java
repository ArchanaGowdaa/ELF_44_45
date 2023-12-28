package PopUs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePopus2
{
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Thread.sleep(1000);
	Alert alert=driver.switchTo().alert();
	String msg = alert.getText();
	System.out.println(msg);
	alert.sendKeys("Hi I'am Archana");
	Thread.sleep(1000);
	alert.dismiss();	
	
 }
}