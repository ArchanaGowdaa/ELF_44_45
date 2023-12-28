
package SeleniumPart2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTML.Tag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandiframe
{
	public static void main(String[] args)
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.speedtest.net/");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='google_ads_iframe_/6692/speedtest.net/stnext_bottom_rectangle_0']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("cbb")).click();//cbb for close the Tag and icon [X]icon
		
		
		
	}

}
