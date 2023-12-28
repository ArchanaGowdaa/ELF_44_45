package PopUs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlert 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		Alert alert=driver.switchTo().alert();
		String Simple = alert.getText();
		System.out.println(Simple);
		alert.accept();
		
		
	}

}
