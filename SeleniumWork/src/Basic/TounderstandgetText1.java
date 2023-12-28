package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TounderstandgetText1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("archana22@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abcdefghj");
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		Thread.sleep(1000);
		String errorMessage = driver.findElement(By.cssSelector("div[class=\"validation-summary-errors\"")).getText();
		System.out.println(errorMessage);
	}

}
