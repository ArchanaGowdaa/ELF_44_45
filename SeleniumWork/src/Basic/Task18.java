package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task18 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.linkText("Books")).click();
		WebElement click = driver.findElement(By.cssSelector("input[value=\"Add to cart\"]"));
		click.click();
		driver.findElement(By.linkText("Digital downloads")).click();
		WebElement click1 = driver.findElement(By.xpath("//a[contains(text(),'3rd Album')]/../..//input[@type='button']"));
		click1.click();
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		WebElement click2 = driver.findElement(By.xpath("//a[contains(text(),'Genuine Leather Handbag with Cell Phone Holder & Many Pockets')]/../..//input[@type=\"button\"]"));
		click2.click();
		
		
		
		
	}

}
