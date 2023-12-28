package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
