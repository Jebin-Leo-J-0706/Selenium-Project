package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTaskPage extends BaseClass {

	public OpenTaskPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="Projects & Customers")
	private WebElement projectandCustomersTab;

	public WebElement getProjectandCustomersTab() {
		return projectandCustomersTab;
	}
		
	public void clickonProjectandcustomer()
	{
		projectandCustomersTab.click();
	}
		
		
		
		
	}