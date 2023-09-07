package Assignments;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.Skillrary_AddToCartPage;
import POM.Skillrary_DemoLoginPage;

import genericLibraries.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Skillrary_POM 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		Skillrary_DemoLoginPage slp= new Skillrary_DemoLoginPage(driver);
		WebDriverUtilities wb = new WebDriverUtilities();
		wb.mouseOvering(driver, slp.getCoursetab());
		slp.seleniumtrainingtab();
	    Skillrary_AddToCartPage atc= new Skillrary_AddToCartPage (driver);
	    wb.doubleClick(driver, atc.getAddbtn());
	    atc.carttocartbtn();
		
		
				
		
	}

}
