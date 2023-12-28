package PopUs;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ToHandleNotificationPopupByUsingFirefox 
{
	public static void main(String[] args)
	{
		
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("dom.webnotifications.enabled",true);
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/");
		
	}
}
