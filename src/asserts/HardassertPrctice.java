package asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardassertPrctice 
{
	
	@Test
	public void demo()
	{
		String s1 ="Hello";
		String s2 ="hello";
		
		Assert.assertEquals(s1, s2);
		System.out.println(s1);
		System.out.println(s2);
	}

}
