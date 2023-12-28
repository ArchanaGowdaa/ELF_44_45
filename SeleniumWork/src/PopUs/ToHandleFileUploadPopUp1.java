package PopUs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopUp1 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=EAIaIQobChMI_pKmjuX_ggMVcKRmAh2huQW6EAAYASAAEgJNP_D_BwE&gclsrc=aw.ds");
	WebElement UploadButton = driver.findElement(By.id("resumeUpload"));
	Actions action=new Actions(driver);
	action.scrollToElement(UploadButton).scrollByAmount(0,100).perform();
	Thread.sleep(1000);
	UploadButton.sendKeys("C:\\Users\\Archana K M\\Desktop\\My Resumes\\ARCHANA KM RESUME.pdf");	

}
}