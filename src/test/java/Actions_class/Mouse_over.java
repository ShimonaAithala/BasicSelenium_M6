package Actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_over
{
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		//address of course webelement
		WebElement ele = driver.findElement(By.xpath("//a[text()='COURSE']"));
		//creating and obj for actions class
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();
		//adress of selenium training
		driver.findElement(By.xpath("//a[text()='Selenium Training'][1]")).click();
		WebElement plus = driver.findElement(By.id("add"));
		a.doubleClick(plus).build().perform();
	}

}
