package SeleniumPart2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task21 
{
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");
//		driver.findElement(By.id("password")).sendKeys("Testing@123");
//		driver.findElement(By.name("proceed")).click();
//		driver.findElement(By.cssSelector("li[title=\"Compose a new mail\"]")).click();
//		driver.findElement(By.cssSelector("input[placeholder=\"Enter name or email\"]")).sendKeys("sumanthElfBatch@rediffmail.com");
		
				public static void main(String[] args) throws IOException{
					ChromeDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofSeconds(15));
					//login to rediffMail
					driver.get("https://www.rediff.com/");
					driver.findElement(By.linkText("Rediffmail")).click();
					driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");
					driver.findElement(By.id("password")).sendKeys("Testing@123");
					driver.findElement(By.name("proceed")).click();
					
					//composing a mail
					driver.findElement(By.linkText("Write mail")).click();
					driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthElfBatch@rediffmail.com");
					driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("Archana");
					WebElement body = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
					driver.switchTo().frame(body);
					WebElement msg = driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']"));
					msg.sendKeys("Life is jingalala");
					driver.switchTo().defaultContent();
					driver.findElement(By.linkText("Send")).click();
					
					//capturing screenshot of sent mail
					File capture1 = driver.getScreenshotAs(OutputType.FILE);
					File MsgSent = new File("./ScreenShots/Msgsnt.png");
					FileHandler.copy(capture1,MsgSent);
					
					//deleting sent mail
					driver.findElement(By.xpath("//li[@subject='Archana']/cite")).click();
					driver.findElement(By.xpath("//span[@class='rd_fil_del']")).click();
					driver.findElement(By.xpath("//button[text()='Ok']")).click();
					
					//capturing screenshot of deleted mail
					File capture2 = driver.getScreenshotAs(OutputType.FILE);
					File Msgdeleted = new File("./ScreenShots/Msgdlt.png");
					FileHandler.copy(capture2,Msgdeleted);

				}	
	}