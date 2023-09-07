package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary_DemoLoginPage
{
	//declaration
	//address of Selenium training
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	//address of course WebElement
	@FindBy(id="course")
	private WebElement coursetab;
	
	//address of select category drop_down
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	
	//initialization
	public Skillrary_DemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	//utilization
	//to perform mouse hovering getter method need to be used
	public WebElement getCoursetab() 
	{
		return coursetab;
	}
	
	public void seleniumtrainingtab()
	{
		seleniumtraining.click();
	}


	//for drop_down also we need to take getter method
	public WebElement getCoursedd() 
	{
		return coursedd;
	}

	
	
}
