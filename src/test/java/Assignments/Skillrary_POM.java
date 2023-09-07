package Assignments;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.Skillrary_DemoLoginPage;
import POM.Skillrary_DemoLoginPage;
import POM.skillrary_addToCart;
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
		//slp.coursetextField(driver);
		//slp.seleniumtrainingTextField();
		
		skillrary_addToCart satc= new skillrary_addToCart (driver);
		satc.plusButtonClick(driver);
		satc.addToCartButtonClick();
		Alert alter = driver.switchTo().alert();
		alter.accept();
		
				
		
	}

}
