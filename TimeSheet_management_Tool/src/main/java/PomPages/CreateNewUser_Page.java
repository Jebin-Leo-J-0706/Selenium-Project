package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewUser_Page extends BaseClass {
	
	
	public CreateNewUser_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub   //We are creating Constructor in pOM classes because each web element has a address.So to create an address in heap area we are using the constructor.
	}
	//Page Factory is a class provided by Selenium WebDriver to support Page Object Design patterns. In Page Factory, testers use @FindBy annotation. The initElements method is used to initialize web elements.
	//initElements(): initElements is a static method in Page Factory class. Using the initElements method, one can initialize all the web elements located by @FindBy annotation.
//As discussed earlier, each of these files will only contain UI elements or Objects present on these screens along with the operations to be performed on these elements.
	@FindBy(name="username")
	private WebElement usernameTextField;
	
	@FindBy(name="passwordText")
	private WebElement passwordTextField;
	
	@FindBy (name="passwordTextRetype")
	private WebElement confirmPasswordTextField;
	
	@FindBy(name="firstName")
	private WebElement firstNameTextfield;
	
	@FindBy(name="lastName")
	private WebElement lastnametextField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement createUserButton;
	
	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	
	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}
	
	public WebElement getFirstNameTextfield() {
		return passwordTextField;
	}

	public WebElement getLastnametextField() {
		return lastnametextField;
	}
	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public void newUserDetailsfilling(String username,String password,String firstname,String lastname) throws InterruptedException
	{
		usernameTextField.sendKeys(username);
		Thread.sleep(2000);
		passwordTextField.sendKeys(password);
		Thread.sleep(2000);
		confirmPasswordTextField.sendKeys(password);
		Thread.sleep(2000);
		firstNameTextfield.sendKeys(firstname);
		Thread.sleep(2000);
		lastnametextField.sendKeys(lastname);
		Thread.sleep(2000);
		createUserButton.click();
	}

}
