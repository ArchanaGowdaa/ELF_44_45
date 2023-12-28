package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider 
{
	@DataProvider
	public String[] passTestData() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(new File("./Resources/data.xlsx"));
		Workbook workbook = WorkbookFactory.create(fis);//go to particular file
		int colCount=workbook.getSheet("Sheet8").getRow(0).getPhysicalNumberOfCells()-1;
		String[] data=new String[colCount];
		for(int i=0;i<colCount;i++)
		{
			data[i]=workbook.getSheet("Sheet8").getRow(0).getCell(i+1).toString();
		}
		return data;
	}
	
@Test(dataProvider = "passTestData")//from data provider your getting the data
public void testingUsernameTextField(String data)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Archana K M\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys(data);
	driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();	
	driver.close();
}
}
