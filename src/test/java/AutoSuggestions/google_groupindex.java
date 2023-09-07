package AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google_groupindex
{
	public static void main(String[] args) throws Throwable 
	{
		//to print 3rd suggestion out of all suggestions when phone is searched in searchbox
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		//address of search textfield
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("phone");
		Thread.sleep(3000);
		//address of the list
	    WebElement position = driver.findElement(By.xpath("//li[@data-view-type='1'][3]"));
		System.out.println(position.getText());
		driver.quit();
		}
		
	

}
