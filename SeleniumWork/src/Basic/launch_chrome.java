package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch_chrome {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in");
}
}
