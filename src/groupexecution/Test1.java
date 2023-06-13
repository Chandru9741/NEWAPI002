package groupexecution;

import org.testng.annotations.Test;

public class Test1 {

	    @Test(groups = "Smoke")
		public void tc1()
		{
		System.out.println("Test1 - tc1");
		}
	 @Test(groups = "Sanity")
	public void tc2()
	{
	System.out.println("Test1 - tc2");
	}
	 @Test(groups = "Regression")
	 public void tc3()
		{
		System.out.println("Test1 - tc3");
		}
	 	

	}
