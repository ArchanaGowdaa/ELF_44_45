package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandDependantAndIndependantPath 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/womens-footwear/sports-shoes/pr?sid=osp,iko,d20&otracker=nmenu_sub_Women_0_Sports%20Shoes");
		WebElement store = driver.findElement(By.xpath("//a[contains(text(),'Premium Memory Foam Comfortable Stylish LightWeight Cas...')]/..//div[contains(text(),'₹246')]"));
		store.click();
	}

}
