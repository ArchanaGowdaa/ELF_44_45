package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}

}
