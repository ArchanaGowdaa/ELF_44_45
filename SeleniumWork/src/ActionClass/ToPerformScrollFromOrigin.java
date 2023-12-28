package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToPerformScrollFromOrigin
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.zomato.com/bangalore/restaurants?utm_source=google&utm_medium=cpc&utm_campaign=Gsearch_P-MWeb_O-NA_C-Brand_A-AllUser_SC-Generic_L-SouthIndia-20231122&utm_term=zomato%20com&gad_source=1&gclid=CjwKCAiA98WrBhAYEiwA2WvhOo6gEZ7sF1IvVE7SZjXSoMHlBQ0grTJH7EL4WXXM-cHFyeLEEzagRxoCUWsQAvD_BwE");
		WebElement blinkit = driver.findElement(By.linkText("Blinkit"));
		Actions action=new Actions(driver);
		
		ScrollOrigin ref=ScrollOrigin.fromElement(blinkit);
		action.scrollFromOrigin(ref, 0, 500).perform();
		
		
	}
}
