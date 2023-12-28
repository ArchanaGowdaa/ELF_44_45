package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandgetText2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(1000);
		WebElement UserNameTextBox = driver.findElement(By.name("username"));
		UserNameTextBox.clear();
		WebElement PasswordTextBox = driver.findElement(By.name("password"));
		PasswordTextBox.clear();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(1000);
		String errorMessage = driver.findElement(By.xpath("//span[text()='Please enter valid username']")).getText();
		System.out.println(errorMessage);
		driver.findElement(By.id("username")).sendKeys("#");
		driver.findElement(By.id("password")).sendKeys("Archana22499");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(1000);
		String wrongMessage = driver.findElement(By.id("validationMessage")).getText();
		System.out.println(wrongMessage);	
	}

}
