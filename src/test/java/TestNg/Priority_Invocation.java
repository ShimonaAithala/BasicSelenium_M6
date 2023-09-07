package TestNg;

import org.testng.annotations.Test;

public class Priority_Invocation 
{
	//1. TestNg main method---> one main method is called one test script
	@Test(priority=-1, invocationCount=-1)
	public void demo1()
	{
		System.out.println("Hi!demo1");
	}
	
	//2nd main method--->2nd test script
	//if we give invocationCount is given but still if we don't want that script to execute then we can give enabled=false
	//if invocationCount is given negative then that test script will not execute
	@Test(invocationCount=2,enabled=false) //if no priority is given, it will take priority=0 by default
	public void demo2()
	{
		System.out.println("Hi!demo2");
	}
	
	//3rd main method--->3rd test script
	@Test(priority=-5, invocationCount=2) //this means this script will execute twice
	public void demo3()
	{
		System.out.println("Hi!demo3");
	}

}
