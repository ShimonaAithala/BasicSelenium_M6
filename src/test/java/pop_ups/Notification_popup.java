package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_popup 
{
	public static void main(String[] args) 
	{
		//these popups cant be moved,controlled etc.
		//these popups will not work in firefox
		
		
		EdgeOptions options= new EdgeOptions();
		//options.setCapability("preferences", prefs);
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.quikr.com/");
		
	}

}
