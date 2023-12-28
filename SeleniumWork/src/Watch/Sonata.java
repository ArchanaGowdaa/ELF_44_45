package Watch;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sonata 
{
	@Test(groups={"Smoke","Regression"})
	public void SonataWatch()
	{
		ChromeDriver driver=new ChromeDriver();//test steps
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.sonatawatches.in/");
		driver.quit();
		
		
		
}
	@Test(groups="Smoke",dependsOnGroups = "Functional")
	public void FireBoalt()
	{
		ChromeDriver driver=new ChromeDriver();//test steps
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.fireboltt.com/");
		driver.quit();
}

}
