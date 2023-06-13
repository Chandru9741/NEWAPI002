package testing;

import javax.annotation.processing.SupportedSourceVersion;

import org.testng.annotations.Test;

public class DisablingTestCase 
{
	@Test(enabled = false)
	public void demo1()
	{
		System.out.println("demo1");
	}
	@Test
	public void demo2()
	{
		System.out.println("demo2");
	}

}
