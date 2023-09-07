package basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_program 
{
	public static void main(String[] args) throws Throwable 
	{
		//driver related statement
		WebDriverManager.chromedriver().setup();
		
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter the url and loads until application will get loaded
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//navigating from one url to another url
		driver.navigate().to("https://www.youtube.com/");
		
		//navigating to back page
		driver.navigate().back();
		
		//navigating to front page again
		driver.navigate().forward();
		Thread.sleep(3000);
		
		//refreshing the page
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//closing the application
		driver.close();
		
		
	}

}
