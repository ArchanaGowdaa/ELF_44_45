package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandgetCssValue 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(1000);	
		driver.findElement(By.linkText("SIGN IN")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-color animated fadeInLeft']")).click();
		Thread.sleep(2000);
		WebElement errorMessage = driver.findElement(By.id("email-error"));
		System.out.println(errorMessage.getCssValue("color"));
		System.out.println(errorMessage.getCssValue("font-family"));
		//System.out.println(errorMessage.getCssValue(""));
	}

}
