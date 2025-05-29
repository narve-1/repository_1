package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
	
     @BeforeSuite
     public void beforeSuite() 
     {
    	 System.out.println("Before suite");
     }
	    @BeforeClass
	    public void setup() {
	        System.out.println("Before Class");
	    }
	    
	    @BeforeTest
	    public void beforeTest()
       {
	    	System.out.println("Before Test");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("Before each Test Method");
	    }

	    @Test
	    public void test1() {
	        System.out.println("Executing Test 1");
	    }

	    @Test
	    public void test2() {
	        System.out.println("Executing Test 2");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("After each Test Method");
	    }
	    @AfterTest
	    public void afterTest() 
	    {
	    	System.out.println("After Test");
	    }
	    @AfterClass
	    public void teardown() {
	        System.out.println("After Class");
	    }
	    @AfterSuite
	    public void afterSuite()
{
	    	System.out.println("After suite");
	    }
}
