package TestNg_Report;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook
{
	@Test
	public void facebook()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//here address is given wrong in order to fail this program
		driver.findElement(By.id("email")).sendKeys("hfhh");
		
	}

}
