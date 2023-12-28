package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelperAttributes2
{
	@Test
	public void run()
	{
		Reporter.log("Hi i'm from run method",true);
	}
	@Test
	public void add()
	{
			Reporter.log("Hi i'm from add method",true);
	}
	@Test
	public void pause()
	{
		Reporter.log("Hi i'm from pause method",true);
	}

}
