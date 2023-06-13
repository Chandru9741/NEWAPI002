package testing;

import org.testng.annotations.Test;

public class InvocationCountTest 
{
	@Test(invocationCount = 3)
	public void tc1()
	{
	System.out.println("tc1");
	
}
	
		@Test(invocationCount = 2)
		public void tc2()
		{
		System.out.println("tc2");
		

	}
		
			@Test(invocationCount = -3)
			public void tc3()
			{
			System.out.println("tc3");
			

		}
			
				@Test(invocationCount = 0)
				public void tc4()
				{
				System.out.println("tc4");
				

			}
				
				
					@Test
					public void tc5()
					{
					System.out.println("tc5");
					

					}
}



