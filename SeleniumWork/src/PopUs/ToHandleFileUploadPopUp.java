package PopUs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopUp 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		WebElement uploadFile = driver.findElement(By.xpath("//input[@type='file']"));
		
		Actions action=new Actions(driver);
		uploadFile.sendKeys("C:\\Users\\Archana K M\\Desktop\\My Resumes\\ARCHANA KM RESUME.pdf");
		
	}
}
