package DataProvider;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLib.AutoConstant;
import GenericLib.Flib;

public class WorkingWithDataProvider implements AutoConstant {
	
	@DataProvider(name="TestData")
	public Object[][] testData()
	{
		
		Object[][] o=new Object[5][2];
		
		o[0][0]="admin1234";
		o[0][1]="admin1234";
		
		o[1][0]="admin1234";
		o[1][1]="admin1234";
		
		o[2][0]="admin1234";
		o[2][1]="admin1234";
		
		o[3][0]="admin1234";
		o[3][1]="admin1234";
		
		o[4][0]="admin1234";
		o[4][1]="admin1234";
		return o;
		
	}
	
//	@DataProvider(name="TestData1")
//	public Object[][] testData1() throws EncryptedDocumentException, IOException
//	{
//		Flib flib=new Flib();
//		String un1=flib.getDataFromExcelFile("Excel_Path", "Data_Provider", 1, 0);
//		String un2=flib.getDataFromExcelFile("Excel_Path", "Data_Provider", 1, 1);
//		String un3=flib.getDataFromExcelFile("Excel_Path", "Data_Provider", 2, 0);
//		String un4=flib.getDataFromExcelFile("Excel_Path", "Data_Provider", 2, 1);
//		String un5=flib.getDataFromExcelFile("Excel_Path", "Data_Provider", 3, 0);
//		String un6=flib.getDataFromExcelFile("Excel_Path", "Data_Provider", 3, 1);
//		String un7=flib.getDataFromExcelFile("Excel_Path", "Data_Provider", 4, 0);
//		String un8=flib.getDataFromExcelFile("Excel_Path", "Data_Provider", 4, 1);
//		String un9=flib.getDataFromExcelFile("Excel_Path", "Data_Provider", 5, 0);
//		String un10=flib.getDataFromExcelFile("Excel_Path", "Data_Provider", 5, 1);
//		
//		Object[][] o=new Object[5][2];
//		
//		o[0][0]=un1;
//		o[0][1]=un2;
//		
//		o[1][0]=un3;
//		o[1][1]=un4;
//		
//		o[2][0]=un5;
//		o[2][1]=un6;
//		
//		o[3][0]=un7;
//		o[3][1]=un8;
//		
//		o[4][0]=un9;
//		o[4][1]=un10;
//		return o;
//		
//	}
//	
	@Test(dataProvider="TestData")
	
	public void loginwithDataProvider(String username,String password)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do;jsessionid=1p43b264ti7m8");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		driver.close();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
