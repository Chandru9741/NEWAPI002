package testing;

import org.testng.annotations.Test;

public class priortizingTestCases 
{
	@Test(priority = 1)
	public void tc1()
	{
		System.out.println("tc1");
		
	}
	@Test(priority= -1)
	public void tc2()
	{
		System.out.println("tc2");
	}
	@Test
	public void tc3()
	{
		System.out.println("tc3");
		
	}
	@Test
	public void tc4()
	{
		System.out.println("tc4");
	}
	@Test(priority = -1)
	public void tc5()
	{
		System.out.println("tc5");
	}
	

}
