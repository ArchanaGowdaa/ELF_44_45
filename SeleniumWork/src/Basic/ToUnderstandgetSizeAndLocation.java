package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandgetSizeAndLocation
{
	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);	
		WebElement email = driver.findElement(By.id("email"));
		WebElement passWord = driver.findElement(By.id("passContainer"));
		
		Point emailBoxLoc = email.getLocation();
		Point passWordLoc = passWord.getLocation();
		System.out.println("x value of email "+emailBoxLoc.getX());
		System.out.println("x value of password  "+passWordLoc.getX());
		
		if( emailBoxLoc.getX()==passWordLoc.getX() )
		{
			System.out.println("Email box and Password is alligned properly towards left");
		}
		else
		{
			System.out.println("Email box and Password is not alligned properly towards left");
		}
		int emailw = email.getSize().getWidth();
		int passw = passWord.getSize().getWidth();
		
		int emailright=emailw+passw;
		int passright=emailw+passw;
		
		if(emailright==passright)
		{
			System.out.println("Email box and Password is alligned properly towards right");
		}
		else
		{
			System.out.println("Email box and Password is not alligned properly towards right");
		}
	}

}
