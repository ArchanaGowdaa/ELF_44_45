package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Archana K M\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login ");
		Thread.sleep(2000);
		WebElement emailTextBox=driver.findElement(By.id("Email"));
		emailTextBox.sendKeys("archanagowda22499@gamil.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("archana22499");
		Thread.sleep(2000);
		driver.findElement(By.id("RememberMe")).click();
		
	}
}
