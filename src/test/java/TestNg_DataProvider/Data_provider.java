package TestNg_DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Data_provider
{
	@DataProvider
	public Object[][] getData()
	{
		Object[][]a = new Object[3][2];
		a[0][0]="dfbv";
		a[0][1]="begh";
		
		a[1][0]= "2666";
		a[1][1]="dhvb23";
		
		a[2][0]="dbf@^";
		a[2][1]="jdfhi)(dhhdb*";
		return a;
		
	}
	@Test(dataProvider="getData")
	public void demo(String username, String pwd)
	{

		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		driver.close();
	}

}
