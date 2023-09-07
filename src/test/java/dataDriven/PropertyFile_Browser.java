package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile_Browser
{
	public static void main(String[] args) throws Throwable 
	{
				//create object for properties class
				Properties p= new Properties();
				
				//create an object for FileInputStream-> "." with \\ indicates it is inside project and path should be copied from src
				FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Data.properties");
				
				//loading where we have stored the property file--> that we are loading it into p
				p.load(fis);
				String appURL = p.getProperty("url");//this contains the data which is available as url from property file
				String appUsername = p.getProperty("username");
				String appPassword = p.getProperty("password");
				String browser = p.getProperty("browser");
				
				WebDriver driver;
				if(browser.equals("edge"))
				{
					WebDriverManager.edgedriver().setup();
				    driver= new EdgeDriver();
				}
				else
				{
					WebDriverManager.firefoxdriver().setup();
				    driver= new FirefoxDriver();
					
				}
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.get(appURL);
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys(appUsername);
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(appPassword);
				
		
	}

}
