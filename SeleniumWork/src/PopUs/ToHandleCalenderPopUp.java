package PopUs;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleCalenderPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.agoda.com/");
		
		LocalDateTime ldt = LocalDateTime.now();
		int year = ldt.getYear();
		int day = ldt.getDayOfMonth();
		String monthName = ldt.getMonth().name();
		monthName=monthName.substring(0, 1).toUpperCase()+monthName.substring(1).toLowerCase();
				
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
		 for(;;)
		    {
		       try
		       {
			    driver.findElement(By.xpath("//div[text()='"+monthName+" "+(year+1)+"']/..//span[text()='"+(day-2)+"']")).click();//6 day
			    driver.findElement(By.xpath("//div[text()='"+monthName+" "+(year+1)+"']/..//span[text()='"+(day-1)+"']")).click();//7th day
			    break;
		       }
		       catch(Exception e)
		       {
			    driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
		       }
		    }
		
	}
}
//this agoda application considers only Dec 7th 2024 .......