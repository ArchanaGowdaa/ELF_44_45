package ActionClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformClickHoldRelease 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.paiinternational.in/shop/categories/furniture-2/");
		
		WebElement fromEle = driver.findElement(By.xpath("//span[contains(@class,'slider from')]"));
		WebElement toEle = driver.findElement(By.xpath("//span[contains(@class,'slider to')]"));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(fromEle).moveByOffset(10, 0).release(fromEle).perform();
		Thread.sleep(2000);
		actions.moveToElement(toEle).clickAndHold().moveByOffset(-20, 0).release().perform();
		
		//actions.dragAndDropBy(fromEle, 30, 0).perform();
	}
}
