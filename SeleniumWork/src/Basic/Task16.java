package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task16 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		Thread.sleep(1000);
		driver.findElement(By.id("usertype_yes")).click();
		Thread.sleep(2000);
		boolean enabled = driver.findElement(By.id("groupcode")).isDisplayed();
		System.out.println(enabled);

		driver.findElement(By.id("usertype_no")).click();
		Thread.sleep(2000);
		boolean disabled = driver.findElement(By.id("groupcode")).isDisplayed();
		System.out.println(disabled);

	}

}
