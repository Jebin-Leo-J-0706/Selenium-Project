package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsCustomers_Page extends BaseClass{
	
	public ProjectsCustomers_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement CreateNewCustomerButton;
	
	@FindBy(xpath="//input[@value='Create New Project']")
	private WebElement CreateNewProjectButton;
	
	@FindBy(linkText="All")
	private WebElement selectAllButton;
	
	@FindBy(xpath="//input[@value='Delete Selected']")
	private WebElement deleteSelectedButton;

	@FindBy(id = "deleteButton")
	private WebElement deleteButton;

	

	

	public WebElement getCreateNewCustomerButton() {
		return CreateNewCustomerButton;
	}

	public WebElement getCreateNewProjectButton() {
		return CreateNewProjectButton;
	}

	public WebElement getSelectAllButton() {
		return selectAllButton;
	}
	
	public WebElement getDeleteSelectedButton() {
		return deleteSelectedButton;
	}
	
	public WebElement getDeleteButton() {
		return deleteButton;
	}
	
	
	
	public void clickonCreateNewCustomerButton()
	{
		CreateNewCustomerButton.click();
	}
	public void clickonCreateNewProjectButton()
	{
		CreateNewProjectButton.click();
	}
	
	public void deleteAllCustomersandProject()
	{
		selectAllButton.click();
		deleteSelectedButton.click();
		deleteButton.click();
	}
	
	
	

}
