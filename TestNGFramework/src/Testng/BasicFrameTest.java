package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicFrameTest {
   
	//testcase one
	
	@Test(groups= {"Sanity"})
	public void testcase1()
	{
		Assert.assertTrue(true);
	}
	
	//Test Case two
	
	@Test
	public void testcase2()
	{
		Assert.assertTrue(true);
	}
	
	
	
	
}
