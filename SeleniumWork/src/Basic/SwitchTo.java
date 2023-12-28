package Basic;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo  
	{
	
		
			public static void main(String[] args) throws InterruptedException 
			{
				
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.hersheyland.com/home");
				Thread.sleep(2000);
				driver.switchTo().newWindow(WindowType.WINDOW);
				driver.get("https://www.facebook.com/");
				
			}
		}


