package SeleniumPart2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandStaticTable 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.espncricinfo.com/series/australia-in-india-2023-24-1389381/india-vs-australia-5th-t20i-1389395/full-scorecard");
		WebElement match = driver.findElement(By.xpath("(//span[text()='India'])[2]/../../../..//table"));
		 List<WebElement> NoOfRows = match.findElements(By.xpath("tbody/tr/div"));
		 System.out.println(NoOfRows.size());
	}

}
