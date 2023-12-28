package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependesOnMethodAttribute
{
	@Test
	public void openAccount()//exception -it's failed
	{
		int i=1/0;
		Reporter.log("Account created",true);
	}
	@Test(priority=5)//3-passed
	public void deleteAccount()
	{
		Reporter.log("Account Deleted",true);
	}
	@Test(priority=2)
	public void updateMobileNumber()//1-passed
	{
		Reporter.log("Updated Mobile number",true);
	}
	@Test(dependsOnMethods = {"openAccount","addBenificiary"})
	public void amountTransfer()
	{
		Reporter.log("Transferring amount",true);//skipped
	}
	@Test(priority=3)
	public void addBenificiary()//2-passed
	{
		Reporter.log("Added Benificiary",true);
	}
}
