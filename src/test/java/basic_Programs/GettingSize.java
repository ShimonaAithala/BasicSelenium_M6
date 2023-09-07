package basic_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GettingSize 
{
	public static void main(String[] args) 
	{
	WebDriverManager.edgedriver().setup();
	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.id("email"));
	Dimension size = ele.getSize();
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());
	}
}
