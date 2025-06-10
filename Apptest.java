package dev_java;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.App;

public class Apptest {
	@Test

	public void testlogin1()
	{
	App myapp=new App();
	Assert.assertEquals(0, myapp.userLogin("sjciot", "sjc123"));
	}

	@Test
	public void testlogin2()
	{

	App myapp2=new App();
	Assert.assertEquals(1, myapp2.userLogin("sjcit", "sjc123"));
}
}