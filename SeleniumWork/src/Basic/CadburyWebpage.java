package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadburyWebpage 
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
		for(String windowId : allWindowsId)//traversing each  and every browser
		{
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());						
			if(driver.getTitle().contains("Cadbury"))
			{
				driver.close();
				break;
			}
	}

}
}