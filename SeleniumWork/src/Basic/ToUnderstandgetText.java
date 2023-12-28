package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandgetText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("dfghikjjgsfahk");
		driver.findElement(By.id("Password")).sendKeys("Archana22499@");
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		Thread.sleep(1000);
		String errorMessage = driver.findElement(By.cssSelector("div[class=\"inputs\"]")).getText();
		System.out.println(errorMessage);
		
		
		
		
	}

}
