package GenericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest implements AutoConstant {

	public WebDriver driver;
	public static WebDriver sdriver;//making the driver as static and convert to non static again after launching the browser because for Listner the driver should be static
	//Because the listner feature need the constant address of the driver.So we are making it static.
	//
	@BeforeSuite
	public void BeforeSuit()
	{
		Reporter.log("Connect to the server",true);
		
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		Reporter.log("Connect to the database",true);
	}
	
	@BeforeClass
	public void setUp() throws IOException
	{
		Flib fib=new Flib();
		String browser=fib.getDataFromPropertyFile(path, "browser");
		Reporter.log("===Lunching" + browser + "browser",true);
		String url=fib.getDataFromPropertyFile(path, "url");
		if(browser.equalsIgnoreCase("Chrome"))
			driver=new ChromeDriver();
		else if(browser.equalsIgnoreCase("Firefox"))
			driver=new FirefoxDriver();
		else
			Reporter.log("invalid browser",true);//true is used to print the output in the console else will print only in report.
		sdriver=driver;//If this is not converted then this will affect the parallel execution because for parallel execution we need non-static driver with different address.
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
		
		
		
		
	}
	
}
