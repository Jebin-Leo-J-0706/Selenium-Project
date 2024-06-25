package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import PomPages.CreateNewUser_Page;
import PomPages.HomePage;
import PomPages.LoginPage;
import PomPages.UserList_Page;






public class CreateUserTest extends BaseTest{//we should extend the BaseTest first to launch the browser first before logging in..??

	
	
	@DataProvider(name="TestData")
	public Object[][] testData()
	{
		
		Object[][] o=new Object[1][4];
		o[0][0]="JJJJJ";
		o[0][1]="PPPPPP";
		o[0][2]="FFFFFF";
		o[0][3]="LLLLLLLL";
		return o;
		
	
	
	}
	
	
	@Test(dataProvider="TestData")
	public void createNewUser(String username1, String password1,String fn , String ln) throws EncryptedDocumentException, IOException, InterruptedException
	{
		//First logging in
		Flib fib=new Flib();
		String username=fib.getDataFromExcelFile(Excel_Path, Sheet_name, 6, 3);
		String password=fib.getDataFromExcelFile(Excel_Path, Sheet_name, 6, 4);
		LoginPage lp=new LoginPage(driver);
		lp.validLogin(username, password);
		Thread.sleep(5000);
		
		//Click on User tab
		HomePage hp=new HomePage(driver);
		hp.clickOnUserTab();
		Thread.sleep(5000);
		
		//Click on create New User button
		UserList_Page ulp=new UserList_Page(driver);
		ulp.clickonCreateNewUser();
		
		
		//CreateUserTest cut=new CreateUserTest();
		//cut.testData();
		
		//Fill the user details
		//Flib fib=new Flib();This object is already created above,no need to create again
		
//		String username1=fib.getDataFromExcelFile(Excel_Path, userdetailsSheet, 1, 0);
//		
//		String password1=fib.getDataFromExcelFile(Excel_Path, userdetailsSheet, 1, 1);
//		
//		String firstname=fib.getDataFromExcelFile(Excel_Path, userdetailsSheet, 1, 2);
//	
//		String lastname=fib.getDataFromExcelFile(Excel_Path, userdetailsSheet, 1, 3);

		CreateNewUser_Page cnup=new CreateNewUser_Page(driver);
		cnup.newUserDetailsfilling(username1,password1,fn, ln );
	}
}
