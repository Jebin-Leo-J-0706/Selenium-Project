package TestScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.CustomListener;
import GenericLib.Flib;
import PomPages.BaseClass;
import PomPages.LoginPage;
import io.opentelemetry.semconv.trace.attributes.SemanticAttributes.NetHostConnectionSubtypeValues;

@Listeners(CustomListener.class)//for taking screenshots--doubt
public class ValidLoginTest extends BaseTest {
	

	@Test
	public void login() throws IOException
	{
		//BaseTest bt=new BaseTest();
		//bt.setUp();
		Flib fib=new Flib();
		String username=fib.getDataFromExcelFile(Excel_Path,Sheet_name,6,3);
		String password=fib.getDataFromExcelFile(Excel_Path,Sheet_name,6,4);
		LoginPage lp=new LoginPage(driver);
		
		
		lp.validLogin(username, password);
//		lp.getUsernameTextField().sendKeys(username);
//		lp.getPasswordTextFiled().sendKeys(password);
//		lp.getLoginbutton().click();
	
		
	}
		
	
	
	
	

	
	

}
