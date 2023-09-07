package basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail_navigation 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail/");
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("hey@gmail.com");
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='For work or my business']")).click();
		driver.close();
		
	}
	
	
	
	

}
