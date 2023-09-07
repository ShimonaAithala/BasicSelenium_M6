package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar_popup 
{
	public static void main(String[] args) throws Throwable
	{
		//calender_popup,hidden division_popup
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		
		//address of date web_element
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		
		Thread.sleep(2000);
		//selecting date with the help of xpath traversing(selecting 26th aug date)
		driver.findElement(By.xpath("//div[text()='Aug']/../../..//span[text()='26']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
