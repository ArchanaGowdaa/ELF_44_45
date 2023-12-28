package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandgetRect 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Archana K M\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);	
		WebElement email = driver.findElement(By.id("email"));
		WebElement passWord = driver.findElement(By.id("passContainer"));
		Rectangle emailRect = email.getRect();
		
		System.out.println(emailRect.getWidth());
		
//		emailRect.setWidth(500);
		
		System.out.println(emailRect.getWidth());
		
		System.out.println(email.getRect().getWidth());
	}

}
