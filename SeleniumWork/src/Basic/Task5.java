package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Archana K M\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("archanagowda22499@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("Archana22499@");
		Thread.sleep(5000);
		driver.findElement(By.name("captcha")).sendKeys("FY8TF");
		Thread.sleep(5000);
//		driver.findElement(By.name("captcha_type")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.id("usertype_no")).click();
//		Thread.sleep(5000);
		
		
		
		
	}
}
