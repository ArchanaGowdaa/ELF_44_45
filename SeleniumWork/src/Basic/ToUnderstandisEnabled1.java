package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandisEnabled1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		
		//to check button is enabled
		boolean res = driver.findElement(By.xpath("//div[text()='Log in']/..")).isEnabled();
		System.out.println(res);
		
		//to check the tagname
		String tagname = driver.findElement(By.name("password")).getTagName();
		System.out.println(tagname);
		
	}

}
