package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Single_dropdown_amazon 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	    WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
	    Select s = new Select(dropdown);
	    s.selectByIndex(3);
	    //to print and check which index value is selected 
	    System.out.println(s.getFirstSelectedOption().getText());
	    Thread.sleep(3000);
	    s.selectByValue("search-alias=stripbooks");
	    s.selectByVisibleText("Appliances");
	    System.out.println(s.isMultiple());
	    List<WebElement> options = s.getOptions();
	    System.out.println(options.size());
	    for(WebElement b: options)
	    {
	    	System.out.println(b.getText());
	    }
	    
		
		
		
		
	}

}
