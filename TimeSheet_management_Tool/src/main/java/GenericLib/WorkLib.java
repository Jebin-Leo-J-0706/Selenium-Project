package GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class WorkLib  {
	


	public void handlingDropdown(WebElement customerDropdown,String visibleText)
	{
		Select s=new Select(customerDropdown);
		s.selectByVisibleText(visibleText);
	}
	

}
