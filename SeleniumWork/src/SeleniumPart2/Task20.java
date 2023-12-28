package SeleniumPart2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task20 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame(0);
	    WebElement Number = driver.findElement(By.cssSelector("input[placeholder='Enter Mobile Number']"));
		Number.sendKeys("7676409861");
		
	}

}
