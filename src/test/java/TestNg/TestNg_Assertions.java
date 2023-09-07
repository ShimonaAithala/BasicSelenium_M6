package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_Assertions 
{
	@Test
	public void assertions()
	{
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		
		//using hard assert--> if the condition is false, then the below statements will not get executed
		//Assert.assertEquals(title,"facebook");
		
		//soft assert--->even if the condition is false, it will still execute the statements below it accordingly
		SoftAssert s= new SoftAssert();
		s.assertEquals(title, "fb");
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
		
	}
	
	
	

}
