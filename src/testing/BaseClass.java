package testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
	@BeforeSuite
	public void suiteSetup()
	{
		System.out.println("@BeforeTest");
	}
 
	@BeforeTest
	public void TestSetup()
	{
		System.out.println("@BeforeClass");
	}
   @BeforeClass
   public void classSetup()
	{
		System.out.println("@BeforeMethod");
	}
   @BeforeMethod
   public void mathodSetup()
	{
		System.out.println("@BeforeTest");
	}
    @AfterMethod
    public void methodTeardown()
	{
		System.out.println("@aftermethod");
	}
    @AfterClass
    public void classTeardown()
	{
		System.out.println("@afterClass");
	}
    @AfterTest
    public void TestTeardown()
	{
		System.out.println("@afterTest");
	}
    @AfterSuite
    public void suiteTeardown()
	{
		System.out.println("@AfterSuite");
	}
 
 
 
 
}
