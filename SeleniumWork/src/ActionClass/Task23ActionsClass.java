package ActionClass;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task23ActionsClass 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.foodpanda.com/");
		Actions action = new Actions(driver);
		List<WebElement> allNavElements = driver.findElements(By.xpath("//ul[@id=\"menu-primary\"]/li"));
		for(WebElement navElement : allNavElements)
		{
			action.keyDown(Keys.CONTROL).perform();
			navElement.click();
			action.keyUp(Keys.CONTROL).perform();
		}
		 Set<String> allWindowId = driver.getWindowHandles();
		 for(String EveryWindowId : allWindowId)
		 {
			 
			if(driver.switchTo().window(EveryWindowId).getTitle().contains("panda ads"))
			{
				driver.close();
				break;
			}
		 }	
	}	
	}
