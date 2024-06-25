package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
 
		

	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextFiled;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextFiled() {
		return passwordTextFiled;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void validLogin(String username,String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextFiled.sendKeys(password);
		loginbutton.click();
	}
	
	public void invalidLogin(String username,String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextFiled.sendKeys(password);
		loginbutton.click();
		usernameTextField.clear();
		passwordTextFiled.clear();
		
	}
	 
	
	
	 
}
