package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_LoginPage 
{
	//declaration
	
	//adress of email textield
	@FindBy(id="email")// here id is name of locator and email is the value
	private WebElement emailTf;// here emailTf is email textfield- it is the name that we can give anything.
	
	//address of password textField
	@FindBy(id="pass")
	private WebElement passwordTf;
	
	//address of LogIn button
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
	
	
	//initialization---> for one complete program, there will be only one initialization part
	//this is used to re-initialize old address with new address
	public Fb_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Utilization--> methods
	public void emailTextField(String value)
	{
		emailTf.sendKeys(value);
	}
	
	public void passwordTextField(String pw)
	{
		passwordTf.sendKeys(pw);
	}
	
	public void loginButton()
	{
		loginBtn.click();
	}


	
	//getter and setter method for practice
	public WebElement getEmailTf() {
		return emailTf;
	}


	public void setEmailTf(WebElement emailTf) {
		this.emailTf = emailTf;
	}


	public WebElement getPasswordTf() {
		return passwordTf;
	}


	public void setPasswordTf(WebElement passwordTf) {
		this.passwordTf = passwordTf;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}


	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
	
	
	

}
