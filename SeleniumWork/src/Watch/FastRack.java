package Watch;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FastRack
{

	@Test(groups="Smoke")
	public void FastRackWatch()
	{
		ChromeDriver driver=new ChromeDriver();//test steps
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.fastrack.in/");
		driver.quit();
}
}