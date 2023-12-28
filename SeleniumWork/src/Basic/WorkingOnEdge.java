package Basic;

import org.openqa.selenium.edge.EdgeDriver;

public class WorkingOnEdge
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\Archana K M\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		//driver.get("C:\\Users\\Archana K M\\Downloads\\edgedriver_win64");
		driver.manage().window().minimize();
		
	}
	
}
