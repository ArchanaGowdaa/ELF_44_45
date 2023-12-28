package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider1 
{
	@DataProvider
	public String[] testdata()
	{
		String [] data= {"abcd","abcd@123","chaEnwo1","@Jungkook","v123","RM123"};
		return data;			
	}
	@Test(dataProvider="testdata")
	//it will go nd fetch the data and it will pass data
	public void UserNameTextField(String data)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(data);
		
	}

}
