package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMouseOver
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.reliancedigital.in/?gad_source=1&gclid=Cj0KCQiAsburBhCIARIsAExmsu4npcT1vvd2uRRKXDL0KaZlQwEc1SPzQtckLwJA8sDByIYJftijC-AaArFkEALw_wcB");
		driver.findElement(By.xpath("//button[text()='No, don’t.']")).click();
		Thread.sleep(1000);
		WebElement HomeAppliances = driver.findElement(By.xpath("//div[text()='Home Appliances']"));
		Thread.sleep(1000);
		Actions actions=new Actions(driver);
		//actions.contextClick().perform();
		//Thread.sleep(1000);
		actions.contextClick(HomeAppliances).perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Refrigerators")).click();
	}

}
