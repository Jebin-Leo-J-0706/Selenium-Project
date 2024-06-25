package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import PomPages.CreateNewCustomerPage;
import PomPages.CreateNewProject_Page;
import PomPages.HomePage;
import PomPages.LoginPage;
import PomPages.OpenTaskPage;
import PomPages.ProjectsCustomers_Page;

public class CreateCustomerandProjectTest extends BaseTest {


	@Test
	
	public void createCustomerAndProject() throws EncryptedDocumentException, IOException
	{
		
		//Logging in
		
		Flib fib=new Flib();
		String username=fib.getDataFromExcelFile(Excel_Path,Sheet_name,6,3);
		String password=fib.getDataFromExcelFile(Excel_Path,Sheet_name,6,4);
		LoginPage lp=new LoginPage(driver);
		lp.validLogin(username, password);
		
		//click on task Link
		
		HomePage hp=new HomePage(driver);
		hp.clickOnTask();
		
		//click on Projects and Customers page
		OpenTaskPage otp=new OpenTaskPage(driver);
		otp.clickonProjectandcustomer();
		
		ProjectsCustomers_Page pcp=new ProjectsCustomers_Page(driver);
		pcp.clickonCreateNewCustomerButton();
		
		//Fetching the customer name from excel,So calling the formula to fetch from excel that is in flib class.
		
		String customerName = fib.getDataFromExcelFile(Excel_Path, CandP_Sheetname, 1, 0);
		
		CreateNewCustomerPage cncp=new CreateNewCustomerPage(driver);
		cncp.createNewCustomer(customerName);
		
		//Creating new Project page
		pcp.clickonCreateNewProjectButton();
		
		//Fetching the project name from excel sheet.
		String projectName=fib.getDataFromExcelFile(Excel_Path, CandP_Sheetname, 1, 1);
		CreateNewProject_Page cnpp=new CreateNewProject_Page(driver);
		cnpp.createaNewProject(customerName, projectName);
	
		
		
		
		
		
	}
	
	
	
	
	
}
