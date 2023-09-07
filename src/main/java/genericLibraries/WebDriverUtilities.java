package genericLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities 
{
	//generic methods for Actions class
	//for mouseOver
	public void mouseOvering(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//for drag_and_drop
	public void dragAndDrop(WebDriver driver, WebElement src, WebElement dest)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest);
	}
	
	//for double_click
	public void doubleClick(WebDriver driver, WebElement target)
	{
		Actions a = new Actions(driver);
		a.doubleClick(target).build().perform();
	}
	
	//for right_click
	public void rightClick(WebDriver driver, WebElement abc)
	{
		Actions a = new Actions(driver);
		a.contextClick(abc).build().perform();
	}
	
	//---------------------------------------------------------------------//
	
	
	
	//generic method to handle Frames
	public void frame(WebDriver driver,String ele)
	{
		driver.switchTo().frame(ele);
	}
	
	//generic method to shift control from frame to webPage
	public void frame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	//------------------------------------------------------------------
	
	//generic methods to handle dropDowns
	public void dropDown(WebElement ele,String value)
	{
		Select s= new Select(ele);
		s.selectByVisibleText(value);
	}
	
	//--------------------------------------------------------
	
	//generic method for implicit wait
	public void implicitWait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	//----------------------------------------------------------
	
	//generic method for alert commands
	public void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	//generic method for dismissing alert
	public void alertDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	//----------------------------------------------------------------
	
	//generic method for parent window
	public void parentWindow(WebDriver driver)
	{
		driver.getWindowHandle();
	}
	
	//generic method for child window
	public void childWindow(WebDriver driver)
	{
		driver.getWindowHandles();
	}
	
	//----------------------------------------------------------------
	
	
	
	
}
