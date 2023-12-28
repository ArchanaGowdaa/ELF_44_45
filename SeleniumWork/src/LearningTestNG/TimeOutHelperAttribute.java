package LearningTestNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOutHelperAttribute //testngclass
{
	@Test(timeOut = 2000)
	public void krafton()//testcase
	{
		ChromeDriver driver=new ChromeDriver();//test steps
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://krafton.com/en/");
	}

}
