package SeleniumPart2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ToHandleDropDown 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		
		WebElement dayListBox = driver.findElement(By.id("day"));
		WebElement monthListBox = driver.findElement(By.id("month"));
		WebElement yearListBox = driver.findElement(By.id("year"));
		
		Select daySelect=new Select(dayListBox);
		Select monthselect=new Select(monthListBox);
		Select yearselect=new Select(yearListBox);
		
		System.out.println(daySelect.isMultiple());
		System.out.println(monthselect.isMultiple());
		System.out.println(yearselect.isMultiple());
		
		daySelect.selectByVisibleText("22");
		monthselect.selectByIndex(3);
		yearselect.selectByValue("1999");
		
		
		
	}

}
