package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Archana K M\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Archana%20K%20M/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']" )).click();
		Thread.sleep(2000);
		Set<String> allWindowsId = driver.getWindowHandles();
		for(String windowId : allWindowsId)
		{
//			driver.switchTo().window(windowId);
//			System.out.println(driver.getWindowHandle());
//			
//			
//			Dimension newSize1 = new Dimension(200, 200);
//			driver.manage().window().setSize(newSize1);//window size
//			Thread.sleep(2000);
//			
//			Point targetPosition1 = new Point(200, 200);
//			driver.manage().window().setPosition(targetPosition1);//window position
//			Thread.sleep(2000);
//			
			driver.switchTo().window(windowId);
			String title = driver.getTitle();					
			if(title.contains("Campco"))//Campco
			{
				driver.close();
				break;	//it will consume some memory
			}
			System.out.println(title);
		
	}
	}
}
