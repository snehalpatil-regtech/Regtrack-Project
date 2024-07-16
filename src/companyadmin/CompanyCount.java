package companyadmin;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import implementation.ImplementMethods;
import login.BasePage;

public class CompanyCount extends BasePage {

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
	
	
	public static String link = "compayAdmin";  
	
	/*public static XSSFSheet ReadExcel() throws IOException
	{
		fis = new FileInputStream("D:\\Avacom22Nov\\AvacomUpdated26JULY2023\\TestData\\ComplianceSheet.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(12);					//Retrieving third sheet of Workbook
		return sheet;
	}*/
	
	@BeforeTest
	void setBrowser() throws InterruptedException, IOException
	{
		extent = new com.relevantcodes.extentreports.ExtentReports("D:\\Avacom22Nov\\AvacomUpdated26JULY2023\\Reports\\CompanyAdminResults.html",true);
		test = extent.startTest("Loging In - Company Admin");
		test.log(LogStatus.PASS, "Logging into system");
		
		/*XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		
		login.Login.BrowserSetup(URL);					//Method of Login class to set browser.
		*/
		
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
		
		initialization(link,12,"Statutory");
	/*	XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		
		login.Login.BrowserSetup(URL);					//Method of Login class to set browser.
		
	
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		 c1 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c1.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c2 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c2.getStringCellValue();		//Got the URL stored at position 2,1
		
		driver = login.Login.UserLogin(uname,password,link);		//Method of Login class to login user.
		*/
	
	}
	
	public static void progress1(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), (30));
		try
		{
			Thread.sleep(500);
			wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(By.xpath("//*[@id='imgcaldate']"))));
		}
		catch(Exception e)
		{
			
		}
	}
/*	
	@Test(priority = 2)
	void Reports() throws InterruptedException, IOException
	{
		test = extent.startTest("Reports");
		
		
		CompanyMethods.Reports(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 3)
	void EventAssignments() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Events - Event Assignments");
		
		
		CompanyMethods.EventAssignments(test);
		
		extent.endTest(test);
		extent.flush();
	}
		
	@Test(priority = 4)
	void Eventassignmentexportimport() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Events - Event assignment export import -Event - Export");
		
		
		CompanyMethods.Eventassignmentexportimport(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 6)
	void EventassignmentexportimportValidation() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Events - Event assignment export import -Event - Export");
		
		
		CompanyMethods.EventassignmentexportimportValidation(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 5)
	void ImportBlankScript() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Events - Event assignment export import -Event -Import");
		
		
		CompanyMethods.ImportBlankScript(test);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 7)
	void ImportInvalidSheet() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Events - Event assignment export import -Event -Import");
		
		
		CompanyMethods.ImportInvalidSheet(test);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 8)
	void ImportValidSheet() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Events - Event assignment export import -Event -Import");
		
		
		CompanyMethods.ImportValidSheet(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 9)
	void UploadedFileisplay() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Events - Event assignment export import -Event -Import");
		
		
		CompanyMethods.UploadedFileisplay(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 10)
	void UploadedFileisplayEC() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Events - Event assignment export import -Event Compliance - Export ");
		
		
		CompanyMethods.UploadedFileisplayEC(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 11)
	void DownloadEC() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Events - Event assignment export import -Event Compliance - Export ");
		
		
		CompanyMethods.DownloadEC(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 12)
	void InValidSheet() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Events - Event assignment export import -Event Compliance - Import");
		
		
		CompanyMethods.InValidSheet(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 13)
	void ValidSheetEC() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Events - Event assignment export import -Event Compliance - Import ");
		
		
		CompanyMethods.ValidSheetEC(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 14)
	void ValidationEC() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Events - Event assignment export import -Event Compliance - Import");
		
		
		CompanyMethods.ValidationEC(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 15)
	void Department() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users - Department ");
		
		
		CompanyMethods.Department(test);
		
		extent.endTest(test);
		extent.flush();
	}

 	@Test(priority = 16)
 
	void User() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users - User ");
		
		
		CompanyMethods.User(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 17)
	void BlockScheduleStatutory() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users - Block Schedule Statutory  ");
		
		
		CompanyMethods.BlockScheduleStatutory(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 18)
	void BlockScheduleInternal() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -Block Schedule Internal  ");
		
		
		CompanyMethods.BlockScheduleInternal(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 19)
	void UserDepartmentdis() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -Users-Modify Assignments - Check Department Dropdown display or not");
		
		
		CompanyMethods.UserDept(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 20)
	void ModifyAssignmentsDepartmentdis() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -Modify Assignments - Check Department Dropdown display or not");
		
		
		CompanyMethods.ModifyAssignmentsDept(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 21)
	void modifyAssignmentsTask() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -Modify Assignments - Reassign Statutory task ");
		
		
		CompanyMethods.modifyAssignmentsTask(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 22)
	void modifyAssignmentsTaskIN() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -Modify Assignments - Reassign Internal  task ");
		
		
		CompanyMethods.modifyAssignmentsTaskIN(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 23)
	void modifyAssignmentsCom() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -Modify Assignments - Statutory Compliance Reassign  ");
		
		
		CompanyMethods.modifyAssignmentsCom(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 24)
	void modifyAssignmentsComEB() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -Modify Assignments - Statutory Compliance Reassign - Event Based ");
		
		
		CompanyMethods.modifyAssignmentsComEB(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 25)
	void modifyAssignmentsComChecklist() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -Modify Assignments - Statutory Compliance Reassign - CheckList ");
		
		
		CompanyMethods.modifyAssignmentsComChecklist(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 26)
	void modifyAssignmentsComIN() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -Modify Assignments - Internal  Compliance Reassign ");
		
		
		CompanyMethods.modifyAssignmentsComIN(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 27)
	void modifyAssignmentsComINChecklist() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -Modify Assignments - Internal  Compliance Reassign - Checklist  ");
		
		
		CompanyMethods.modifyAssignmentsComINChecklist(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 28)
	void modifyAssignmentsComExclude() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -Modify Assignments - Exclude Statutory Compliance  ");
		
		
		CompanyMethods.modifyAssignmentsComExclude(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 29)
	void modifyAssignmentsComExcludeEB() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -Modify Assignments -Exclude Statutory Compliance -  Event Based ");
		
		
		CompanyMethods.modifyAssignmentsComExcludeEB(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 30)
	void modifyAssignmentsComExcludeCL() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -Modify Assignments - Exclude Statutory Compliance - Checklist ");
		
		
		CompanyMethods.modifyAssignmentsComExcludeCL(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
@Test(priority = 31)
	void modifyAssignmentsComExcludeIN() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -Modify Assignments -Exclude Internal Compliance ");
		
		
		CompanyMethods.modifyAssignmentsComExcludeIN(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 32)
	void modifyAssignmentsComExcludeINCL() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -Modify Assignments -Exclude Internal Compliance- Checklist ");
		
		
		CompanyMethods.modifyAssignmentsComExcludeINCL(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 33)
	void IPAddressAddNew() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -IP Address - To check whether IP Address \"Add New\" button is functionally working or not.");
		
		
		CompanyMethods.IPAddressAddNew(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 34)
	void IPAddressFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -IP Address - To check whether IP Address \"Filter\" funcationality working or not.");
		
		
		CompanyMethods.IPAddressFilter(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 35)
	void IPAddressUpload() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -IP Address - To check whether IP Address \"Upload \" funcationality working or not.");
		
		
		CompanyMethods.IPAddressUpload(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 36)
	void IPAddressSampleFormat() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -IP Address - To check whether IP Address \"Sample Format\" Dwonloaded or not ?");
		
		
		CompanyMethods.IPAddressSampleFormat(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 37)
	void IPAddressEdit() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users -IP Address - To check whether IP Address \"Edit Address Details\" functionally working or not.");
		
		
		CompanyMethods.IPAddressEdit(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 38)
	void IPAddressDelete() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users - IP Address - To check whether IP Address \"Delete\" functionally working or not.");
		
		
		CompanyMethods.IPAddressDelete(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 39)
	void IPAddressDeleteAll() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users - IP Address - To check whether IP Address \"Select All Checkbox \" functionally working or not.");
		
		
		CompanyMethods.IPAddressDeleteAll(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 40)
	void IPAddressExport() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users - IP Address - To Check Whether IP Address Page \"Export to Excel \" Button Working or not ?");
		
		
		CompanyMethods.IPAddressExport(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 41)
	void IPAddressAddNewWD() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users - IP Address - To Check Whether IP address Add New Popup without Entering Data Click on \"Save \" Button  validation message display or not ?");
		
		
		CompanyMethods.IPAddressAddNewWD(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 42)
	void SecurityGroup() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users - Security Group - To check whether Security Group \"Add New\" button functionally working or not?");
		
		
		CompanyMethods.SecurityGroup(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 43)
	void SecurityGroupFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users - Security Group - To check whether Security Group master \"Filter\" funcationality working or not.");
		
		
		CompanyMethods.SecurityGroupFilter(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 44)
	void SecurityGroupEdit() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users - Security Group - To check whether Security Group Master \"Edit Security Group Details\" functionally working or not.");
		
		
		CompanyMethods.SecurityGroupEdit(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 45)
	void SecurityGroupDelete() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users - Security Group - To check whether Security Group master \"Delete Security Group Details\" functionally working or not.");
		
		
		CompanyMethods.SecurityGroupDelete(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 46)
	void SecurityGroupAdd() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Users - Security Group - To Check Whether security Group Master add New Popup Validation Message display or not ?");
		
		
		CompanyMethods.SecurityGroupAdd(test);
		
		extent.endTest(test);
		extent.flush();
	}*/
	
/*	@Test(priority = 47)
	void ComplianceFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Compliances - Masters - Compliances - To Check whether filters of \"Compliance\"  working or not");
		
		
		CompanyMethods.ComplianceFilter(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 47)
	void Acts() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Compliances- Masters - Acts  ");
		
		
		CompanyMethods.Acts(test);
		
		extent.endTest(test);
		extent.flush();
	}
	 
	@Test(priority = 47)
	void ComplianceCategoriesFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Compliances- Masters - Compliances category - To Check whether  compliance category master page Filters working or not");
		
		
		CompanyMethods.ComplianceCategoriesFilter(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 47)
	void ComplianceTypeFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Compliances- Masters - Compliances Type - To Check whether  compliance Type master page Filters working or not");
		
		
		CompanyMethods.ComplianceTypeFilter(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 48)
		void WidgetMaster() throws InterruptedException, IOException
		{
			test = extent.startTest("Manage Compliances - Masters - Widget Master  ");
			
			
			CompanyMethods.WidgetMaster(test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	@Test(priority = 49)
	void WidgetMasterSF() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Compliances - Masters - Widget Master - To Check whether widget Details Uploaded or not? ");
		
		
		CompanyMethods.WidgetMasterSF(test);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 49)
	void AssignComplianceCA() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Compliances -Compliance Assignment -Compliance Assignment - To Check whether On Compliance Assigment funcationality is working or not? ");
		
		
		CompanyMethods.ComplianceAssignment(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 49)
	void IntermediateComplianceCA() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Compliances - Compliance Assignment - Intermediate Assignment - To Check whether On Intermediate Assignment funcationality is working or not? ");
		
		
		CompanyMethods.IntermediateComplianceCA(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 49)
	void ActivateComplianceCA() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Compliances - Compliance Assignment - Activate Assignment - To Check whether On Activate Assignment funcationality is working or not? ");
		
		
		CompanyMethods.ActivateComplianceCA(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 49)
	void ComplianceMappingCopy() throws InterruptedException, IOException
	{
		test = extent.startTest("Manage Compliances - Compliance Assignment - Compliance Mapping Copy - To Check whether Compliance Mapping Copy funcationality is working or not? ");
		
		
		CompanyMethods.ComplianceMappingCopy(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 48)
	void AssignCheckListCA() throws InterruptedException, IOException
	{
		test = extent.startTest(" Manage Compliances - Checklist Assignment - Assign CheckList");
		
		CompanyMethods.AssignCheckListCA(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 49)
	void IntermediateCheckListCA() throws InterruptedException, IOException
	{
		test = extent.startTest(" Manage Compliances - Checklist Assignment - Intermediate CheckList");
		
		CompanyMethods.IntermediateCheckListCA(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 50)
	void ActivateCheckListCA() throws InterruptedException, IOException
	{
		test = extent.startTest(" Manage Compliances - Checklist Assignment - Activate CheckList");
		
		CompanyMethods.ActivateCheckListCA(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 54)
	void ReOpeningofCompliance() throws InterruptedException, IOException
	{
		test = extent.startTest(" Manage Compliances -  Configuration - Re-Opening of Compliance");
		
		
		CompanyMethods.ReOpeningofCompliance(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 61)
	void ClientComplianceRiskMapping() throws InterruptedException, IOException
	{
		test = extent.startTest(" Manage Compliances - Configuration - Change Risk of Compliance ");
		
		
		CompanyMethods.ClientComplianceRiskMapping(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 63)
	void ClientFrequencyMapping() throws InterruptedException, IOException
	{
		test = extent.startTest(" Manage Compliances - Configuration - Client based checklist compliance frequency mapping");
		
		
		CompanyMethods.ClientFrequencyMapping(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 64)
	void Targetdate() throws InterruptedException, IOException
	{
		test = extent.startTest(" Manage Compliances-Client Specific Configuration -Target date");
		
		
		CompanyMethods.Targetdate(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 64)
	void DocumentNotApplicable() throws InterruptedException, IOException
	{
		test = extent.startTest(" Manage Compliances - Client Specific Configuration - Document Not Applicable");
		
		
		CompanyMethods.DocumentNotApplicable(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 51)
		void EntitiesAssignmentsMC() throws InterruptedException, IOException
		{
			test = extent.startTest(" Manage Compliances-Entities Assignment - Entities Assignments");
			
			CompanyMethods.EntitiesAssignmentsMC(test);
			
			extent.endTest(test);
			extent.flush();
		}

	@Test(priority = 52)
	void DepartmentEntitiesAssignmentsMC() throws InterruptedException, IOException
	{
		test = extent.startTest(" Manage Compliances - Department Entities Assignments- License Entities Assignments");
		
		
		CompanyMethods.DepartmentEntitiesAssignmentsMC(test);
		
		extent.endTest(test);
		extent.flush();
	}
	
		@Test(priority = 52)
		void LicenseEntitiesAssignmentsMC() throws InterruptedException, IOException
		{
			test = extent.startTest(" Manage Compliances-Entities Assignment - License Entities Assignments");
			
			
			CompanyMethods.LicenseEntitiesAssignmentsMC(test);
			
			extent.endTest(test);
			extent.flush();
		}*/
	
	/*@Test(priority = 48) 
    void WhatsNew() throws InterruptedException, IOException
			{
				test = extent.startTest("' what's New ' Verification");
				
				MethodsPOM.WhatsNew(test);
				
				extent.endTest(test);
				extent.flush();
			}
    
	@Test(priority = 49) 
    void EditCompliances() throws InterruptedException, IOException
			{
				test = extent.startTest("Internal Compliances - Edit Compliances");
				
				CompanyMethods.EditCompliances(test);
				
				extent.endTest(test);
				extent.flush();
			}
	*/
	
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
		closeBrowser();
  		Thread.sleep(1000);
  		
  	}	
	
	
	
	
	
}
