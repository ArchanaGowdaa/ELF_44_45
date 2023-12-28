package Script;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



/***
 *@Archana 
 
 */
	public class FF_Signup_001 {
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
			// Steps to read data form Excel
			Workbook workbook = WorkbookFactory.create(new FileInputStream(new File("./Resources/FireFlink.xlsx")));
			String email = workbook.getSheet("Sheet7").getRow(0).getCell(0).toString();
			String password = workbook.getSheet("Sheet7").getRow(0).getCell(1).toString();

			// Expected Data//they are comparing expected data actual data...
			String LoginPageTitle = "FireFlink";//loginpage=expectedResult,actualLoginPage=after performing action selenium browser will give the result
			String HomePageTitle = "FireFlink";

			// Test step 1 :  Launch chrome browse enter Test URL
			
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://app.fireflink.com/");
			String actualLoginPageTitle = driver.getTitle();//browser captured title
			
			if (actualLoginPageTitle.equals(LoginPageTitle)) {
				System.out.println("Login page is displayed");
			} else 
			{
				System.out.println("Login page is not displayed");
			}

			// Test step 2 : Enter valid email address in "Email" text field
			WebElement emailTextField = driver.findElement(By.name("emailId"));
			emailTextField.clear();
			emailTextField.sendKeys(email);
			String emailnameEntered = emailTextField.getAttribute("value");
			if (emailnameEntered.equals(email)) {
				System.out.println("Email was entered sucessfully");
			} else
			{
				System.out.println("Email was not entered sucessfully");
			}

			// Test step 3 : .Enter valid "Password"in password textfield
			WebElement passowrdTextField = driver.findElement(By.name("password"));
			passowrdTextField.clear();
			passowrdTextField.sendKeys(password);
			String passwordEntered = passowrdTextField.getAttribute("value");
			if (passwordEntered.equals(password)) {
				System.out.println("Password was entered sucessfully");
			} else 
			{
				System.out.println("Password was not entered sucessfully");
			}
			
			//Test step 4 : Click on SignIn button
			driver.findElement(By.xpath("//button[text()='Sign in']")).click();
			String actual1LoginPageTitle = driver.getTitle();
			if (actualLoginPageTitle.equals(HomePageTitle)) {
				System.out.println("HomePage is displayed");
			} else {
				System.out.println("Home page is not displayed");
			}
		}
	}

