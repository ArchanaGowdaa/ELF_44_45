package Watch;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class JokerAndWitch 
{
	@Test(groups="Regression")
	public void Joker()
	{
	ChromeDriver driver=new ChromeDriver();//test steps
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://jokerandwitch.com/");
	driver.quit();

}
}