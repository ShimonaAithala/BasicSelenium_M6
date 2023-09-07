package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillrary_addToCart 
{
	//declaration
	@FindBy(xpath="(//button[@class='btn btn-default btn-flat btn-lg'])[2]")
	private WebElement plusbtn;
	
	@FindBy(xpath=" //button[@ondblclick='addtocart()']")
	private WebElement addToCartbtn;
	
	//initialization
	public skillrary_addToCart(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void plusButtonClick(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.doubleClick(plusbtn).perform();
	}
	public void addToCartButtonClick()
	{
		addToCartbtn.click();
	}
	

}
