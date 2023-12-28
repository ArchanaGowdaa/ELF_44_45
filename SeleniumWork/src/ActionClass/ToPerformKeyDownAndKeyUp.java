package ActionClass;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformKeyDownAndKeyUp
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://parivahan.gov.in/parivahan/");
		Actions action = new Actions(driver);
		List<WebElement> allNavElements = driver.findElements(By.xpath("//li[@data-level='1']"));
		for(WebElement navElement : allNavElements)
		{
			action.keyDown(Keys.CONTROL).perform();
			//keydown means hold 
			Thread.sleep(1000);
			navElement.click();
			Thread.sleep(1000);
			action.keyUp(Keys.CONTROL).perform();//keyup means release
		}
		 Set<String> allWindowId = driver.getWindowHandles();
		 for(String EveryWindowId : allWindowId)
		 {
			 
			if(driver.switchTo().window(EveryWindowId).getTitle().contains("Contact Us"))
			{
				driver.close();
				break;
			}
		 }	
	}

}
