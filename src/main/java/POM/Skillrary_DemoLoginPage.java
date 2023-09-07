package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary_DemoLoginPage
{
	//declaration
	//address of selenium training
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	//address of course webelement
	@FindBy(id="course")
	private WebElement coursetab;
	
	//address of drop_down
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	
	//initialization
	public Skillrary_DemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	//utilization
	//to perform mouse hovering getter methods needs to be used
	public WebElement getCoursetab() 
	{
		return coursetab;
	}
	
	public void seleniumtrainingtab()
	{
		seleniumtraining.click();
	}


	//for dropdown also we need to take getter method
	public WebElement getCoursedd() 
	{
		return coursedd;
	}

	
	
}
