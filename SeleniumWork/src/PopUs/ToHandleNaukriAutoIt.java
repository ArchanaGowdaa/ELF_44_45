package PopUs;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleNaukriAutoIt 
{
	public static void main(String[] args) throws IOException {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=CjwKCAiAg9urBhB_EiwAgw88mVZUK8eUI8oycrS-rQVX-tL8dJqaEQQ9-SHp6g8uirb6BVYo2WMCaxoCv4MQAvD_BwE&gclsrc=aw.ds");
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	Runtime.getRuntime().exec("./AutoIt/NaukriRegistration.exe");
}
}