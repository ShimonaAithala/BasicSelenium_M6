package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_upload_popup 
{
	public static void main(String[] args) throws Throwable 
	{
		//to upload a file in application- 2 ways-sendKeys(), Robot class
		//1. --->using sendKeys()
		//this is used to check whether the selected option is getting downloaded
				WebDriverManager.edgedriver().setup();
				WebDriver driver= new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("http://www.foundit.in");
				
				//address of upload resume
				driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Documents\\Resume\\Shimona__Aithala- QA_Engineer.pdf");
		
		
	}

}
