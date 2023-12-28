package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Archana");
		driver.findElement(By.id("LastName")).sendKeys("Gowda");
		driver.findElement(By.id("Email")).sendKeys("archanagowda289@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Archana22499@");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Archana22499@");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.className("ico-logout")).click();
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.className("email")).sendKeys("archanagowda289@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("password")).sendKeys("Archana22499@");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Books")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value=\"Add to cart\"]")).click();
		driver.findElement(By.className("cart-label")).click();
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.name("updatecart")).click();
		
	}
	
}
