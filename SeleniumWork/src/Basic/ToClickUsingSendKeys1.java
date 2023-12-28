package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickUsingSendKeys1 
{
	public static void main(String[] args) throws InterruptedException {
		
//	ChromeDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://demowebshop.tricentis.com/register");
//	Thread.sleep(1000);	
//	WebElement FirstName = driver.findElement(By.id("FirstName"));
//	FirstName.sendKeys("ELF45");
//	FirstName.sendKeys(Keys.CONTROL+"a");//(+"c")
//	FirstName.sendKeys(Keys.CONTROL+"c");
//	driver.findElement(By.id("LastName")).sendKeys(Keys.CONTROL+"v");
//	
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/register");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement FirstName = driver.findElement(By.id("FirstName"));
	FirstName.sendKeys("ELF45");
	FirstName.sendKeys(Keys.CONTROL+"a");
	FirstName.sendKeys(Keys.CONTROL+"c");
	driver.findElement(By.id("LastName")).sendKeys(Keys.CONTROL+"v");
	}

}
