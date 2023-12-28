package SeleniumPart2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropdown1 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demoapp.skillrary.com/");
	WebElement multi = driver.findElement(By.id("cars"));
	
	Select courseByPriceSelect=new Select(multi) ;
	courseByPriceSelect.selectByIndex(1);
	Thread.sleep(1000);
	courseByPriceSelect.selectByValue("299");
	Thread.sleep(1000);
	courseByPriceSelect.selectByVisibleText("Free ( 90 )");
	Thread.sleep(1000);
	System.out.println(courseByPriceSelect.getFirstSelectedOption().getText());
	
	courseByPriceSelect.deselectByIndex(1);
	Thread.sleep(2000);
	courseByPriceSelect.deselectByValue("299");
	Thread.sleep(2000);
	courseByPriceSelect.deselectByVisibleText("Free ( 90 )");
	Thread.sleep(100);

}
}