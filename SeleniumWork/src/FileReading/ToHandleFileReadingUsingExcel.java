package FileReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileReadingUsingExcel
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
//		ChromeDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//step 1:creating File
		File abspath = new File("./resources/data.xlsx");
		FileInputStream fis=new FileInputStream(abspath);
		
		//step2 : Respective File object creation
		 Workbook workbook = WorkbookFactory.create(fis);
		 
		//step3: read methods
		String data1 = workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		boolean data2 = workbook.getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
		LocalDateTime data3 = workbook.getSheet("Sheet1").getRow(5).getCell(2).getLocalDateTimeCellValue();
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		
		String data4 = workbook.getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue();
		double data5 = workbook.getSheet("Sheet2").getRow(3).getCell(2).getNumericCellValue();
		double data6 = workbook.getSheet("Sheet2").getRow(5).getCell(4).getNumericCellValue();
		
		System.out.println(data4);
		System.out.println(data5);
		System.out.println(data6);	
		
	}

}
