package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformScrollByAmount1 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://onepagelove.com/");
		Actions action=new Actions(driver);
		for(;;)
		try{
			driver.findElement(By.xpath("(//a[@title='Supershine'])[1]")).click();
			break;
		}
		catch(Exception e) 
		{
			action.scrollByAmount(0,500).perform();
		}	
	}	
	}

