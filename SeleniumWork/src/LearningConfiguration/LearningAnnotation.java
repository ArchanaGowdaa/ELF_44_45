package LearningConfiguration;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearningAnnotation 
{
	@BeforeSuite()
	public void beforeSuite()
	{
		Reporter.log("from before suite",true);
	}
	@BeforeTest()
	public void beforeTest()
	{
		Reporter.log("from before Test",true);
	}
	@BeforeClass()
	public void beforeClass()
	{
		Reporter.log("from before Class",true);
	}
	@BeforeMethod()
	public void beforeMethod()
	{
		Reporter.log("from before Method",true);
	}
	@Test
	public void run()
	{
		Reporter.log("from test method run",true);
	}
	@AfterSuite()
	public void afterSuite()
	{
		Reporter.log("from after suite",true);
	}
	@AfterTest()
	public void afterTest()
	{
		Reporter.log("from after Test",true);
	}
	@AfterClass()
	public void afterClass()
	{
		Reporter.log("from after Class",true);
	}
	@AfterMethod()
	public void afterMethod()
	{
		Reporter.log("from after Method",true);
	}
	@Test
	public void start()
	{
		Reporter.log("from test method start",true);
	}

}
