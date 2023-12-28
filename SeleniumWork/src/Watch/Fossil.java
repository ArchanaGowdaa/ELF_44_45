package Watch;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fossil
{
	@Test(groups="Smoke")
	public void FossilWatch()
	{
		ChromeDriver driver=new ChromeDriver();//test steps
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.fossil.com/");
		driver.quit();
		
	}

}
