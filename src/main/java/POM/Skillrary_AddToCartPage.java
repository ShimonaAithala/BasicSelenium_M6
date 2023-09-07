package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary_AddToCartPage
{
	//declaration
	//address of + icon
	@FindBy(id="add")
	private WebElement addbtn;
	
	
	//address of add_to_cart button
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement cartbtn;

	
	//initialization
	public Skillrary_AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	//utilization
	public WebElement getAddbtn()
	{
		return addbtn;
	}
	
	public void carttocartbtn()
	{
		cartbtn.click();
	}

	
	
}

