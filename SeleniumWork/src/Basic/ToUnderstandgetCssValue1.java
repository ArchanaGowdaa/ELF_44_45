package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandgetCssValue1
{
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);	
    //driver.findElement(By.name("login")).click();
    //WebElement errorMessage = driver.findElement(By.name("email"));
    //WebElement errorMessage = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
    //System.out.println(errorMessage.getCssValue("font-size"));
    //System.out.println(errorMessage.getCssValue("color"));
   // System.out.println(errorMessage.getCssValue(""));
	
	WebElement message = driver.findElement(By.name("login"));
	//System.out.println(message.getCssValue("background-color"));
	System.out.println(message.getCssValue("color"));
	System.out.println(message.getCssValue("font-family"));
	}

}
