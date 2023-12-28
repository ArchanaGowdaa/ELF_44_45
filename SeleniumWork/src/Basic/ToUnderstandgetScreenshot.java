package Basic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToUnderstandgetScreenshot
{
	public static void main(String[] args) throws IOException 
	{
		//to capture web page
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		File capture = driver.getScreenshotAs(OutputType.FILE);//based on the arguments...
		File Screenshots=new File("./Screenshots/facebook.jpeg");
		FileHandler.copy(capture, Screenshots);
		
		
		
	}

}
