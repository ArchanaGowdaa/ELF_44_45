package Basic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToUnderstandgetScreenshot1 
{
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.purplle.com/lp/elite-offer-zone");
		WebElement prp = driver.findElement(By.xpath("//span[text()='APPFIRST']"));
		File source=prp.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./Screenshots/purplle.png");
		FileHandler.copy(source, destFile);
		
	}
}
