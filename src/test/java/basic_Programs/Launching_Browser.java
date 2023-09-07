package basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching_Browser 
{
	public static void main(String[] args) throws Throwable
	{
		//driver related statement
		WebDriverManager.chromedriver().setup();
		
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//opens the browser
		driver.get("https://www.facebook.com/");
		
		//get the title of webpage
		System.out.println(driver.getTitle());
		
		//printing the current url
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		
		//closing the webpage
		driver.close();
		
	}

}
