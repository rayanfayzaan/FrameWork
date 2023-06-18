package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonalLoan {

	@Test
	public void Personalloanbyweb()
	{
		Assert.assertTrue(true);
	}
	@Test(groups= {"Sanity"})
	public void Personalloanbyapp()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void PersonalloanbyBranch()
	{
		Assert.assertTrue(true);
	}
	
	
	
	
}
