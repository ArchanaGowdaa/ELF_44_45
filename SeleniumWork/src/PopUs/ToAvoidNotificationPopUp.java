package PopUs;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotificationPopUp
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(1000);
		
	}

}
