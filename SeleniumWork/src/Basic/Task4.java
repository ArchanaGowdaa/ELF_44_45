package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Archana K M\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(15000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Create Account")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("First Name")).sendKeys("Archana");
		Thread.sleep(5000);
		driver.findElement(By.id("Last Name")).sendKeys("Gowda");
		Thread.sleep(5000);
		driver.findElement(By.id("Female")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Phone Number")).sendKeys("7676409861");
		Thread.sleep(5000);
		driver.findElement(By.id("Email Address")).sendKeys("archanagowda22499@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("Password")).sendKeys("Archana22499@");
		Thread.sleep(5000);
		driver.findElement(By.id("Confirm Password")).sendKeys("Archana22499@");
		Thread.sleep(5000);
		driver.findElement(By.id("Terms and Conditions")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("btnDisabled")).click();
		Thread.sleep(5000);
		
		
	}
}
