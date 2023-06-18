package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HolidaysLoan {
   
	@Test
	public void Holidaysloanbyweb()
	{
		Assert.assertTrue(true);
	}
	
	@Test(groups= {"Sanity"})
	public void Holidaysloanbyapp()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void CarloanbyBranch()
	{
		Assert.assertTrue(true);
	}
	
}

