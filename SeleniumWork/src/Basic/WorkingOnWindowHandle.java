package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnWindowHandle 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
		String windowHandle=driver.getWindowHandle();
		System.out.println(windowHandle);
	}

}
