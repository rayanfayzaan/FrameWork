package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeLoan {

	@Test(groups= {"Sanity"})
	public void Homeloanbyweb()
	{
		Assert.assertTrue(true);
	}
	@Test(groups= {"regression"})
	public void Homeloanbyapp()
	{
		Assert.assertTrue(true);
	
	}
	@Test
	public void HomeloanbyBranch()
	{
		Assert.assertTrue(true);
	}
	
	
	
	
}





