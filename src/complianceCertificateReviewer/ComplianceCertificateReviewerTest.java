package complianceCertificateReviewer;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import complianceCertificateOfficer.ComplianceCertificateOfficerMethod;
import complianceCertificateOwner.CertificateOwnerMethod;
import login.BasePage;

public class ComplianceCertificateReviewerTest extends BasePage {
	
//	public static WebDriver driver = null;		//WebDriver instance created
	public static WebElement upload = null;		//WebElement to get upload button
	public static ExtentReports extent;			//Instance created for report file
	public static ExtentTest test;				//Instance created for tests
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	public static List<WebElement> elementsList = null;
	public static List<WebElement> elementsList1 = null;
	public static List<WebElement> elementsList2 = null;
	public static List<WebElement> elementsList3 = null;
	public static List<WebElement> elementsList4 = null;
	public static List<WebElement> menus = null;
	public int count = 0;
	public int interest = 0;					//Variable created for reading Interest
	public int penalty = 0;						//Variable created for reading Penalty
	
	public static String link = "CertificateOwner";  
	
/*	public static XSSFSheet ReadExcel() throws IOException
	{
		//String workingDir = System.getProperty("webdriver.chrome.driver","C:/March2022/PerformerPom/Driver/chromedriver.exe");
		fis = new FileInputStream("C:\\Users\\Mayuri Gaikwad\\Desktop\\PerformerPom\\TestData\\ComplianceSheet.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(17);					//Retrieving third sheet of Workbook
		return sheet;
	}
	*/
	@BeforeTest
	void setBrowser() throws InterruptedException, IOException
	{
	//	String workingDir = System.getProperty("webdriver.chrome.driver","C:/March2022/PerformerPom/Driver/chromedriver.exe");
		extent = new com.relevantcodes.extentreports.ExtentReports("E:\\AVACOM Project\\AvacomModified\\Reports\\CertificateOwner.html",true);
		test = extent.startTest("Verify OpenBrowser");
		test.log(LogStatus.PASS, "Browser test is initiated");
		
	/*	XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		
		login.Login.BrowserSetup(URL);					//Method of Login class to set browser.
		*/
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 1)
	void Login() throws InterruptedException, IOException
	{
		
		initialization(link,17,"Statutory");
	//	test = extent.startTest("Loging In - Certificate Reviewer");
	//	test.log(LogStatus.PASS, "Logging into system");
		
	/*	XSSFSheet sheet = ReadExcel();
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		Cell c1 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c1.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c2 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c2.getStringCellValue();		//Got the URL stored at position 2,1
		
		driver = login.Login.UserLogin(uname,password,link);		//Method of Login class to login user.
		
			
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();*/
	}
	
	public static void progress1()
	{
		WebDriverWait wait = new WebDriverWait( getDriver(),Duration.ofSeconds(60));
		try
		{
			Thread.sleep(500);
			wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(By.xpath("//*[@id='imgcaldate']"))));
		}
		catch(Exception e)
		{
			
		}
	}
	
//	@Test(priority = 2)
	void CustomersCreate() throws InterruptedException, IOException
	{
		test = extent.startTest("Certificate Reviewer");
		
		ComplianceCertificateReviewerMethod.CertificateReviewer(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 3)
	void CertificateReviewerParticularPeriod() throws InterruptedException, IOException
	{
		test = extent.startTest("Certificate Reviewer -Particular Period");
		
		ComplianceCertificateReviewerMethod.CertificateReviewerParticularPeriod(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 4)
	void ComplianceCertificateReviewerMethod() throws InterruptedException, IOException
	{
		test = extent.startTest("Certificate Reviewer Particular Period - Compliance");
		
		ComplianceCertificateReviewerMethod.CertificateReviewerParticularPeriodCompliance(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 5)
	void CertificatePerformerUser() throws InterruptedException, IOException
	{
		test = extent.startTest("Reviewer - Reviewer User -Compliance Tech");
		
		ComplianceCertificateReviewerMethod.CertificatePerformerUser(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 0)
	void CertificateOfficerPR() throws InterruptedException, IOException
	{
		test = extent.startTest("A \"Notice has been received under the Regulatory Act during this Subjected / Compliance Period\" that note appears in the compliance certificate draft or not?");
		
		ComplianceCertificateReviewerMethod.CertificateOfficerPR(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority =0)
	void CertificateOfficerP1() throws InterruptedException, IOException
	{
		test = extent.startTest("A \"No Notice has been received under the Regulatory Act during this Subjected / Compliance Period\" that note appears in the compliance certificate draft or not?");
		
		ComplianceCertificateReviewerMethod.CertificateOfficerP1R(test);
		
		extent.endTest(test);
		extent.flush();
	}
	

}
