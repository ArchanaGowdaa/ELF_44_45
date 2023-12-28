package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDoubleClick 
{
	public static void main(String[] args) throws InterruptedException  
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/product.php?product=testing");
		
		WebElement plusButton = driver.findElement(By.id("add"));
		Actions action=new Actions(driver);
		action.doubleClick(plusButton).perform();
		Thread.sleep(1000);
		
//		WebElement minusButton = driver.findElement(By.id("minus"));
//		action.doubleClick(minusButton).perform();
		//Another way of creating double click without argument.
		action.moveToElement(driver.findElement(By.id("minus"))).doubleClick().perform();
	}

}
