package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandCssSelectorAndClassName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.className("email")).sendKeys("archanagowda@gamil.com");
		Thread.sleep(1000);
		driver.findElement(By.className("password")).sendKeys("Archana22499@");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		Thread.sleep(1000);
		
		
	}

}
