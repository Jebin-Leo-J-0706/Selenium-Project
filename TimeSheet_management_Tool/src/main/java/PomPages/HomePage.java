package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass{
	
 public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
//Used to identify user link tab
@FindBy(xpath="//a[@class='content users']") 
 private WebElement userLink;

@FindBy(xpath = "//a[@class='content tasks']")
private WebElement taskLink;

public WebElement getTaskLink() {
	return taskLink;
}

public WebElement getUserLink() {
	return userLink;
}

public void clickOnUserTab()
{
	userLink.click();
}

public void clickOnTask()
{
	taskLink.click();
}

	

}
