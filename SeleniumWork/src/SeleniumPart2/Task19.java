package SeleniumPart2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task19 
{
	public static void dropdown(WebElement dropdown)
	{
	
		Select daySelect=new Select(dropdown);
		List<WebElement> alloptions = daySelect.getOptions();
		int numberofoptions = alloptions.size();
		daySelect.selectByIndex(numberofoptions-1);
	}
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		WebElement dayListBox = driver.findElement(By.id("day"));
		dropdown(dayListBox);
		
	}

}
