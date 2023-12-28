package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickUsingSendKeys
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa&gad_source=1&gclid=Cj0KCQiAgqGrBhDtARIsAM5s0_lT00HBG4PImcrb1TV0l1fBGeA-kpEy66u-7BoDn15N7JoHv9_nz6IaAuInEALw_wcB");
		driver.findElement(By.name("search-suggestions-nykaa")).sendKeys("Bike",Keys.ENTER);//keys are enum which implements charseq
				
		
	}
}
