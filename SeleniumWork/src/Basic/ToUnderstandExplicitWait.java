package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandExplicitWait
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofSeconds(15));
		FluentWait fw=new FluentWait(driver).pollingEvery(Duration.ofMillis(100));
		driver.findElement(By.xpath("//span[text()='Skinny Men Blue Jeans']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("5600010");
		WebElement checkbutton = driver.findElement(By.id("Check"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(checkbutton));
		checkbutton.click();
		
		
	}
}
