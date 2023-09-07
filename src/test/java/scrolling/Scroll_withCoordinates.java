package scrolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_withCoordinates 
{
	public static void main(String[] args) throws Throwable 
	{
				//scrolling with coordinates
				WebDriverManager.edgedriver().setup();
				WebDriver driver= new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.amazon.in/");
				
				//address of careers
				WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
				
				Point coOrdinates = career.getLocation();
				int x=coOrdinates.getX();
			    int y=coOrdinates.getY();
			    
				//downcasting statement
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy("+x+","+y+")");
				Thread.sleep(2000);
				
				//career.click();
				
				//one more way of clicking by using js
				js.executeScript("arguments[0].click();",career);
		
	}

}
