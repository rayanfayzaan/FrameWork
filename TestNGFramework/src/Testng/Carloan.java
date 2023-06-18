package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Carloan {

@Test
public void Carloanbyweb()
{
	Assert.assertTrue(true);
}
@Test(groups= {"Sanity"})
public void Carloanbyapp()
{
	Assert.assertTrue(true);
}
@Test(groups= {"regression"})
public void Carloanbybranch()
{
	Assert.assertTrue(true);
}



}

