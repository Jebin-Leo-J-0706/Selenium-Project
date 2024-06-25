package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass 
{
	
	public BaseClass(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
}
