package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandStatic 
{
	public static void main(String[] args)
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
		WebElement goldrateTable = driver.findElement(By.xpath("//h2[contains(text(),'Historical Gold Rates in Bangalore for the Last 10 Days')]/../..//table"));
		List<WebElement> totalNoOfRows = goldrateTable.findElements(By.xpath("tbody/tr"));
		System.out.println(totalNoOfRows.size());
		for (int i = 1; i < 11; i++) 
		{
			String details = driver.findElement(By.xpath("//h2[contains(text(),'Historical Gold Rates in Bangalore for the Last 10 Days')]/../..//table/tbody/tr[" + i + "]/td[1]"))
					.getText();
			String cost = driver.findElement(By.xpath("//h2[contains(text(),'Historical Gold Rates in Bangalore for the Last 10 Days')]/../..//table/tbody/tr[" + i + "]/td[2]/div[1]"))
					.getText();
			String twentyfour = driver.findElement(By.xpath("//h2[contains(text(),'Historical Gold Rates in Bangalore for the Last 10 Days')]/../..//table/tbody/tr[" + i + "]/td[3]/div[1]"))
					 .getText();
			System.out.println(details + " - " + cost + " - "+ twentyfour);
	}

}
}