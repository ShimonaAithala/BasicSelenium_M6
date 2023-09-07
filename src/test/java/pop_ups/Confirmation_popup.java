package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Confirmation_popup
{
	public static void main(String[] args) throws Throwable
	{
		//alter_popup,confirmation_popup,js_popup(the popup which cannot be altered or cant be moved)
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		
		//address of add to cart
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		
		//shifting control to pop up
		Alert al= driver.switchTo().alert();
		
		System.out.println(al.getText());
		al.dismiss();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
