package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Smartloan {
	@Test(priority = 0)
	public void Smartloanbyweb()
	{
		Assert.assertTrue(true);
	}
	@Test(priority = 1)
	public void Smartloanbyapp()
	{
		Assert.assertTrue(true);
	}
	@Test(priority = 2)
	public void SmartloanbyBranch()
	{
		Assert.assertTrue(true);
	}
}

