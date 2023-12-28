package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandCloseAndQuit 
{
	public static void main(String[] args) throws InterruptedException
	{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.shoppersstack.com/products_page/4");
			Thread.sleep(10000);
			driver.findElement(By.id("compare")).click();
			Thread.sleep(4000);
			//driver.quit();
			driver.close();//
			
		}
	}