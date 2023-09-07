package basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_1 
{
	public static void main(String[] args) throws Throwable 
	{
				//driver related statement
				WebDriverManager.chromedriver().setup();
				
				//opening chrome browser
				WebDriver driver = new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//enter the url and loads until application will get loaded
				driver.get("https://www.facebook.com/");
				
				//address of email text field using xpath attribute
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hi");
		
				//address of password textfield using a xpath attribute
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Hello");
				Thread.sleep(3000);
				//address of create page by xpath text
				driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
				
				
	}

}
