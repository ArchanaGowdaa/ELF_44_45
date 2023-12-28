package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandgetAttribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//to capture data entered
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(1000);
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.clear();
		searchBox.sendKeys("Big Data Analytics");
		String valueEntered = searchBox.getAttribute("value");
		System.out.println(valueEntered);
		/*String searchbox = driver.findElement(By.name("q")).getAttribute("value");
		System.out.println(searchbox);*/
//		
		
		//to capture alternative text
//		ChromeDriver driver=new ChromeDriver();
//    	driver.manage().window().maximize();
//    	driver.get("https://www.skillrary.com/");
//    	Thread.sleep(1000);
//    	 String alternativeText = driver.findElement(By.cssSelector("img[data-original='https://www.skillrary.com/uploads/course/5864_small.jpg']")).getAttribute("alt");
//    	System.out.println(alternativeText);
//    	
    	//to capture tool tip
    	/*ChromeDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.woodenstreet.com/");
    	Thread.sleep(1000);
    	String toolTip = driver.findElement(By.cssSelector("img[title='Dining Table set']")).getAttribute("title");
    	System.out.println(toolTip);*/
    	
	
	}

}
