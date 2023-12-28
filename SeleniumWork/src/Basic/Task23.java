package Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task23 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		
		//Step1 : create a file
		File abspath = new File("./resources/ArchanaGowda.xlsx");
		FileInputStream fis=new FileInputStream(abspath);
		
		//step2 : Respective File object creation
		 Workbook workbook = WorkbookFactory.create(fis);
		 
		//step3: read methods
		
		//driver.get("https://demowebshop.tricentis.com/login");
		String data1 = workbook.getSheet("Sheet4").getRow(1).getCell(2).toString();
		String data2 = workbook.getSheet("Sheet4").getRow(2).getCell(2).toString();
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		
		driver.findElement(By.id("Email")).sendKeys(data1);
		driver.findElement(By.id("Password")).sendKeys(data2);
		
		
	
		
	}
}
