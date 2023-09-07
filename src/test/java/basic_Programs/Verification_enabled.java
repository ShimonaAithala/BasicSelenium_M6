package basic_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_enabled 
{
	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//id of email textfield
	    driver.findElement(By.id("email")).sendKeys("dshbf");
	    //id of password field
	    driver.findElement(By.id("pass")).sendKeys("dhbv");
	    //id of button field
	    WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
	    if(button.isEnabled())
	    {
	    	System.out.println("It is enabled");
	    	button.click();
	    }
	    else
	    {
	    	System.out.println("it is not enabled");
	    }		
	}
}
