package tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FMTestCases 

{
	
	public static AppiumDriver driver =null ;		//WebDriver instance created
	public static ExtentReports extent;			//Instance created for report file
	public static ExtentTest test;				//Instance created for tests
	
	
	
	@BeforeTest
	
	
	public void simpleTest() throws MalformedURLException, InterruptedException 
	{
		String workingDir = System.getProperty("user.dir");
		extent = new com.relevantcodes.extentreports.ExtentReports(workingDir+"//Report//ComplianceFM.html",true);
		test = extent.startTest(" Logging In ");
		System.out.print("test");
		test.log(LogStatus.PASS, "Test Passed = Mobile App ");
		extent.endTest(test);
		extent.flush();
		
	   
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
		setup();
		BaseClass.Login(driver,"Login");
	
	}
	
	
	
	@Test(priority = 0)
	void Test() throws InterruptedException, IOException
	{
		test = extent.startTest("pass");
		
		extent.endTest(test);
		extent.flush();
	}
	
		       
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
		Thread.sleep(2000);
		driver.quit(); 
		Thread.sleep(2000);
  	}	       
  		       		
  	@AfterTest
  	void Closing() throws InterruptedException
  	{
  		
  	}	 
	
	
	
	public static void setup() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		//caps.setCapability("platformName", "ANDROID");
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");     //Interface
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");            //Interface
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");  
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme");  
		//caps.setCapability(MobileCapabilityType.UDID, "SWFGH89");
		caps.setCapability(MobileCapabilityType.UDID, "Serial No");
	//	caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,600);  
//		caps.setCapability("appPackage","com.miui.calculator");  
//		caps.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		//caps.setCapability("appPackage","com.facebook.katana");  
		//caps.setCapability("appActivity", "com.facebook.katana.LoginActivity");
		
		caps.setCapability("appPackage","..Put yours....");  
		caps.setCapability("appActivity","..Put yours...");
//		caps.setCapability(MobileCapabilityType.APP ,"...");
		 
		
//		caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome"); 
		caps.setCapability("ignoreHiddenApiPolicyError" , true) ;
		caps.setCapability("noReset",true);                        //If noReset is set to TRUE, the app data will NOT be cleared before this session starts.
		 
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		//URL url=new URL("http://127.0.0.1:4723/wd/hub");
	     driver=new AppiumDriver(url,caps);
	    //driver=new AndroidDriver(url,caps);
	    
	
	}
}
