package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrlOfThePage 
{
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Archana K M\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}

}
