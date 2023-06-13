package groupexecution;

import org.testng.annotations.Test;

public class Test2 
{
	@Test(groups = {"Smoke","Sanity"})
	public void tc1()
	{
	System.out.println("Test2 - tc1");
	}
	@Test(groups = {"Smoke", "Regression"}) 
	
	public void tc2()
	{
	System.out.println("Test2 - tc2");
	}
	@Test(groups = {"Sanity","Regression"})
	public void tc3()
	{
	System.out.println("Test2 - tc3");
	}

}
