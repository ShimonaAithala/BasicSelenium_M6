package TestNg_Group;

import org.testng.annotations.Test;

public class Sample2 
{
	@Test
	public void sample2()
	{
		System.out.println("Hi sample2");
	}

	//whenever we want to execute only certain script from programs that we are going to execute, then we use group
	@Test(groups="smoke")
	public void sample3()
	{
		System.out.println("Hi sample3");
	}
}
