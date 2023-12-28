package Basic;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver.Navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task17 
{
	public static void main(String[] args) throws InterruptedException
	{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.purplle.com/");
	Thread.sleep(1000);	
	driver.findElement(By.xpath("//a[text()=\"NEW \"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()=' Good Vibes Saffron Natural Glow Sheet Mask | For Glowing & Smooth Skin | Fights Signs Of Ageing, Treats Rough & Dull Skin (20 ml) ']")).click();
	for(;;) {
		try {
			driver.findElement(By.xpath("(//span[text()=\"Add To Cart\"])[1]")).click();
			break;//until i click this condition im infinately looping it
		}catch(Exception e)
		{
			
		}
		
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='View Cart']")).click();
	Navigation back = driver.navigate();
	back.back();
	back.back();
	driver.findElement(By.xpath("//div[text()=\" Good Vibes Aloe Vera & Shea Butter Hydrating Sunscreen Lotion SPF 50, Skin Moisturizing | Vegan, No Parabens, No Mineral Oil, No Silicones (110 ml) \"]")).click();
	for(;;) {
		try {
			driver.findElement(By.xpath("(//span[text()=\"Add To Cart\"])[1]")).click();
			break;//until i click this condition im infinately looping it
		}catch(Exception e)
		{
			
		}
		
	}
	Thread.sleep(2000);
	//driver.findElement(By.xpath())
	
	}
	
	
	
	
	}

