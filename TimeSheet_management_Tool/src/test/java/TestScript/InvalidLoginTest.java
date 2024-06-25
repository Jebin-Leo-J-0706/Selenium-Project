package TestScript;

import java.io.IOException;
import java.sql.Time;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import PomPages.LoginPage;

public class InvalidLoginTest extends BaseTest {
	
	@Test
	public void invalidLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Flib fib=new Flib();
		LoginPage lp=new LoginPage(driver);
		int maxrows=fib.getLastRowNum(Excel_Path, invalid_Sheet_name);
		for(int i=1;i<=maxrows;i++)
		{
		String username=fib.getDataFromExcelFile(Excel_Path, invalid_Sheet_name, i, 0);
		String password=fib.getDataFromExcelFile(Excel_Path, invalid_Sheet_name, i, 1);
		lp.invalidLogin(username, password);
		}
		driver.close();
	}
	
	
	
	
	
	
	
	
	

}
