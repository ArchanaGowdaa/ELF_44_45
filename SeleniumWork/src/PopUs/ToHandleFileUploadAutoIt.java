package PopUs;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUploadAutoIt
{
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.totaljobs.com/Account/Register");
		driver.findElement(By.xpath("//div[text()='Accept All']")).click();
		driver.findElement(By.id("btnCVUpload")).click();
		driver.findElement(By.xpath("//label[text()='from this device']")).click();
		
		Runtime.getRuntime().exec("./AutoIt/TotalJob.exe");
		
		
		
	}

}
