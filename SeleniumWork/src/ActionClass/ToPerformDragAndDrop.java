package ActionClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToPerformDragAndDrop
{
	public static void main(String[] args) throws InterruptedException

	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://trello.com/login");
		
		driver.findElement(By.id("user")).sendKeys("archanagowda22499@gmail.com");
		driver.findElement(By.id("login")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("password")).sendKeys("Archana22499@",Keys.ENTER);
		driver.findElement(By.xpath("(//div[text()='Api'])[1]")).click();
		
		driver.findElement(By.xpath("//h2[text()=\"Selenium\"]")).click();
		WebElement sourceEle = driver.findElement(By.linkText("Persuing"));
		WebElement targetEle = driver.findElement(By.xpath("//h2[text()=\"Manual\"]/../../..//button[text()='Add a card']"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(sourceEle, targetEle).perform();	
		
	}

}
