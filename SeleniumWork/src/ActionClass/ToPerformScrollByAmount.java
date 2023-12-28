package ActionClass;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformScrollByAmount 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.naukri.com/");
		Actions action=new Actions(driver);
		for(;;)
		try{
			driver.findElement(By.xpath("//span[text()='Resume writing']")).click();
			break;
		}catch(Exception e) {
			action.scrollByAmount(0,500).perform();
		}	
	}

}
