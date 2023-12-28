package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaScriptExecutor 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demoapp.skillrary.com/");
		WebElement disabledBox = driver.findElement(By.xpath("//input[@class='form-control']"));
		driver.executeScript("arguments[0].value='hi welcome';",disabledBox);//javascrpit code
	}

}
