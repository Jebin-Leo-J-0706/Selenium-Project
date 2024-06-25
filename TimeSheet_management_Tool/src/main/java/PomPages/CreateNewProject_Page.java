package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLib.WorkLib;

public class CreateNewProject_Page extends BaseClass {

	public CreateNewProject_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name="customerId")
	private WebElement customerDropdown;
	
	@FindBy(xpath ="//input[@name='name']")
	private WebElement projectNameTextField;
	
	@FindBy(name="createProjectSubmit")
	private WebElement createProjectButton;

	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}

	public WebElement getProjectNameTextField() {
		return projectNameTextField;
	}

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}
	
	
	public void clickOnDropdownButton()
	{
		customerDropdown.click();
	}
	public void clickOnCreateProjectButton()
	{
		createProjectButton.click();
	}
	
	
	public void createaNewProject(String customername,String projectname)
	{
		WorkLib wlib=new WorkLib();
		
		wlib.handlingDropdown(customerDropdown, customername);
		projectNameTextField.sendKeys(projectname);
		createProjectButton.click();
		
	}
	
	
	
	
	
}
