package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomerPage extends BaseClass  {

	
	
	
	public CreateNewCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(name="name")
	private WebElement customerNameTextField;
	
	@FindBy(xpath="//input[@name='createCustomerSubmit']")
	private WebElement createCustomerSubmitButton;

	public WebElement getCustomerNameTextField() {
		return customerNameTextField;
	}

	public WebElement getCreateCustomerSubmitButton() {
		return createCustomerSubmitButton;
	}
	

	public void createNewCustomer(String customername)
	{
		customerNameTextField.sendKeys(customername);
		createCustomerSubmitButton.click();
	}

}
