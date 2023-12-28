package LearningTestNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperAttributes1 
{
	
	@Test(priority=1,invocationCount = 5,threadPoolSize = 4,enabled = false)
	
		public void BMW()
		{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bmw.in/en/index.html");
		driver.quit();
		
		}
		@Test(invocationCount = -1)
		public void benz()
		{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.mercedes-benz.co.in/");
		driver.quit();
		
		}
		@Test(priority=-2)
		public void volvo()
		{
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.volvo.com/en/");
			driver.quit();
		
		}

}
