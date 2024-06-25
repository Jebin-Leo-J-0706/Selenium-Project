package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserList_Page extends BaseClass {

	public UserList_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@value='Create New User']") 
	private WebElement CreateNewUserbutton;

	public WebElement getCreateNewUserbutton() {
		return CreateNewUserbutton;
	}
	
	public void clickonCreateNewUser()
	{
		CreateNewUserbutton.click();
	}
	

}
