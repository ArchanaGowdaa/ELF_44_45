package Basic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 
{
	public static void main(String[] args) throws IOException
	{
		File file=new File("sample.txt");
		if(!file.exists())
		{
			System.out.println("file is created");
			file.createNewFile();
		}
		else
		{
			System.out.println("file already created");
		}
		FileOutputStream fos=new FileOutputStream(file);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		//System.out.println("title of the application"+title);
		String url=driver.getCurrentUrl();
		//System.out.println("Url of the application"+url);
		fos.write(title.getBytes());//
		fos.write(url.getBytes());
		
	}

}
