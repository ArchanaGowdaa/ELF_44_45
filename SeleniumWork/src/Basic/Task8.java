package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(2000);
//		driver.findElement(By.linkText("SPANISH")).click();
//		Thread.sleep(2000);
		driver.findElement(By.linkText("ENGLISH")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("SIGN IN")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("archanagowda22499@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Archanagowda22499@");
		Thread.sleep(2000);
		driver.findElement(By.id("usertype_yes")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("groupcode")).sendKeys("TYSS123");
		Thread.sleep(1000);
		driver.findElement(By.name("remember")).click();
		Thread.sleep(1000);
		
	}

}
