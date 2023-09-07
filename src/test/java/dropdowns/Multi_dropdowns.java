package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multi_dropdowns 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s= new Select(dropdown);
		s.selectByIndex(2);
		s.selectByValue("299");
		Thread.sleep(2000);
		s.deselectByIndex(2);
		System.out.println(s.isMultiple());
		List<WebElement> options = s.getAllSelectedOptions();
		for(WebElement b: options)
		{
			System.out.println(b.getText());
		}
		
		
	}

}
