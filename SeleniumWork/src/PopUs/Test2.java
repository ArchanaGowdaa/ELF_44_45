package PopUs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Archana%20K%20M/Downloads/TestPage.html");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
		driver.quit();
		//Set<String> allWindowsId = driver.getWindowHandles();
//		for(String windowId : allWindowsId)//traversing each  and every browser
//		{
//			driver.switchTo().window(windowId);
//			System.out.println(driver.getTitle());						
//			if(driver.getCurrentUrl().contains("https://www.hotelempire.in/") && driver.getCurrentUrl().contains("https://www.hyderabadihouse.nz/") && driver.getCurrentUrl().contains("https://meghanafoods.co.in/") && driver.getCurrentUrl().contains("http://nandhanarestaurants.com/"))
//			{
//				driver.close();
//				break;
//			}
//	}
		
	}

}
