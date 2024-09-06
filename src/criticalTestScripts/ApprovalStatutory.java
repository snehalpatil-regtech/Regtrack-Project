package criticalTestScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import approval.ApprovalcountPOM;
import auditor.AuditorcountPOM;
import cfo.CFOcountPOM;
import cfo.MgmtAMethod;
import login.BasePage;
import performer.OverduePOM;

public class ApprovalStatutory extends BasePage {
	
	//public static WebDriver  = null;		//Web instance created
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
	
	public static String link = "Approval";           //Check link in excel sheet first.
			
		
	/*
	public static XSSFSheet ReadExcel() throws IOException
	{
		//String workingDir = System.getProperty("web.chrome.","C:/March2022/PerformerPom//chrome.exe");
		fis = new FileInputStream("D:\\Avacom22Nov\\AvacomUpdated26JULY2023\\TestData\\ComplianceSheet.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(6);					//Retrieving third sheet of Workbook
		return sheet;
	}
	*/
	@BeforeTest
	void setBrowser() throws InterruptedException, IOException
	{
		extent = new com.relevantcodes.extentreports.ExtentReports("E:\\Regtrack Merge Project\\Regtrack-Project\\Reports\\Approver.html",true);

		test = extent.startTest("Loging In - Approval (Statutory)");
		test.log(LogStatus.PASS, "Logging into system");
		

		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
		
		initialization1(link,6,"Statutory");
	
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
		
		 = login.Login.UserLogin(uname,password,link);		//Method of Login class to login user.
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait( getDriver(), 40);
		wait.until(ExpectedConditions.visibilityOf(ApprovalcountPOM.clickManagement()));

		ApprovalcountPOM.clickManagement().click();
		Thread.sleep(5000);
		
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(OverduePOM.closeMessage()));
			if(OverduePOM.closeMessage().isDisplayed())	//If Compliance Updation message popped up,
			{
				Thread.sleep(1000);
				OverduePOM.closeMessage().click();		//then close the message.
			}
		}
		catch(Exception e)
		{
		}
		
		
		CFOcountPOM.RefreshNow().click();
		Thread.sleep(4000);
		*/
		extent.endTest(test);
		extent.flush();
	}
	
	public static void progress1( )
	{
		WebDriverWait wait = new WebDriverWait( getDriver(), (30));
		try
		{
			Thread.sleep(500);
			wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(By.xpath("//*[@id='imgcaldate']"))));
		}
		catch(Exception e)
		{
			
		}
	}
	
//	@Test(priority = 1)
	void NotCompleted_PieChart() throws InterruptedException
	{
		test = extent.startTest("Pie Chart -Completion Status- 'Not Completed' Count Verification");
		CFOcountPOM.YearTodate().click();
		Thread.sleep(1000);
		CFOcountPOM.ALL().click();
		Thread.sleep(1000);
		CFOcountPOM.clickApply().click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		Actions action = new Actions(getDriver());
		JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
		js.executeScript("window.scrollBy(0,500)");			
	
		Thread.sleep(3000);
		int NotCompletedValue = Integer.parseInt(CFOcountPOM.clickNotCompleted().getText());	//Reading value of 'Not Completed'
		CFOcountPOM.clickNotCompleted().click();									//CLicking on 'Not Completed' count
		
		Thread.sleep(3000);
		int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
		int high = Integer.parseInt(CFOcountPOM.readHigh().getText());			//Reading High risk count.
		int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());		//Reading Medium risk count.
		int low = Integer.parseInt(CFOcountPOM.readLow().getText());				//Reading Low risk count.
		
		if(NotCompletedValue > 0)
		{
				ApprovalcountPOM.GraphCount( test, "Critical", critical, "Statutory");
			
				Thread.sleep(2000);
			
				ApprovalcountPOM.GraphCount( test, "High", high, "Statutory");
				
				Thread.sleep(2000);
			
				ApprovalcountPOM.GraphCount( test, "Medium", medium, "Statutory");
			
				Thread.sleep(2000);
			
				ApprovalcountPOM.GraphCount( test, "Low", low, "Statutory");
				
				Thread.sleep(500);
			action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	 //Clicking on Back button
			Thread.sleep(2000);
		}
		else
		{
			test.log(LogStatus.PASS, " 'Completed' Compliance Count = "+NotCompletedValue);
			
			Thread.sleep(500);
			action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	//Clicking on Dashboard
			Thread.sleep(1000);
		}
		
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 2)
		void ClosedDelayed_PieChart() throws InterruptedException
		{
			test = extent.startTest("Pie Chart -Completion Status- 'Closed Delayed' Count Verification");
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			Thread.sleep(1000);
			Actions action = new Actions(getDriver());
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,500)");						//Scrolling down window by 1000 px.
			
			Thread.sleep(2000);
			int ClosedDelayedValue = Integer.parseInt(CFOcountPOM.clickClosedDelayed().getText());	//Reading value of 'After Due Date'
			
			CFOcountPOM.clickClosedDelayed().click();								//CLicking on 'Not Completed' count
			
			Thread.sleep(3000);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());		//reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());	//reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());			//reading Low risk count.
			
			if(ClosedDelayedValue > 0)
			{
				
					ApprovalcountPOM.GraphCount1Sta( test, "Critical", critical, "Statutory");
				
					Thread.sleep(2000);
				
					ApprovalcountPOM.GraphCount1Sta( test, "High", high, "Statutory");
				
					Thread.sleep(2000);
				
					ApprovalcountPOM.GraphCount1Sta( test, "Medium", medium, "Statutory");
				
					Thread.sleep(2000);
				
					ApprovalcountPOM.GraphCount1Sta( test, "Low", low, "Statutory");
				
					Thread.sleep(2000);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	 //Clicking on Back button
				Thread.sleep(2000);
			}
			else
			{
				test.log(LogStatus.PASS, "'Closed Delayed' Compliance Count = "+ClosedDelayedValue);
				
				Thread.sleep(500);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	//Clicking on Dashboard
			}
			extent.endTest(test);
			extent.flush();
		}
	
//	@Test(priority = 3)
		void ClosedTimely_PieChart() throws InterruptedException
		{
			test = extent.startTest("Pie Chart -Completion Status- 'Closed Timely' Count Verification");
			
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			Actions action = new Actions(getDriver());
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,500)");						//Scrolling down window by 1000 px.
			
			Thread.sleep(3000);
			int ClosedTimelyValue = Integer.parseInt(CFOcountPOM.clickClosedTimely().getText());	//Reading value of 'After Due Date'
			CFOcountPOM.clickClosedTimely().click();								//CLicking on 'Not Completed' count
			
			Thread.sleep(500);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());		//reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());	//reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());			//reading Low risk count.
			
			int total = critical + high + medium + low;
			
			if(ClosedTimelyValue > 0)
			{
				
					ApprovalcountPOM.GraphCount1Sta( test, "Critical", critical, "Statutory");
				
					Thread.sleep(2000);
					
					ApprovalcountPOM.GraphCount1Sta( test, "High", high, "Statutory");
				
					Thread.sleep(2000);
					
					ApprovalcountPOM.GraphCount1Sta( test, "Medium", medium, "Statutory");
				
					Thread.sleep(2000);
				
					ApprovalcountPOM.GraphCount1Sta( test, "Low", low, "Statutory");
				
					Thread.sleep(2000);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	 //Clicking on Back button
				Thread.sleep(2000);
			}
			else
			{
				test.log(LogStatus.PASS, "'Closed Timely' Compliance Count = "+ClosedTimelyValue);
				
				Thread.sleep(500);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	//Clicking on Dashboard
			}
			extent.endTest(test);
			extent.flush();
			
		}
		
//		@Test(priority = 4)
		void NotApplicable_PieChart() throws InterruptedException
		{
			test = extent.startTest("Pie Chart -Completion Status- 'Not Applicable' Count Verification");
			
			Thread.sleep(3000);
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			Actions action = new Actions(getDriver());
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,500)");						//Scrolling down window by 1000 px.
			
			Thread.sleep(3000);
			int NotApplicableValue = Integer.parseInt(CFOcountPOM.clickNotApplicable().getText());	//Reading value of 'After Due Date'
			CFOcountPOM.clickNotApplicable().click();								//CLicking on 'Not Completed' count
			
			Thread.sleep(2000);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());		//reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());	//reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());			//reading Low risk count.
			
			int total = critical + high + medium + low;
			
			if(NotApplicableValue > 0)
			{
				
					ApprovalcountPOM.GraphCount1Sta( test, "Critical", critical, "Statutory");
				
					Thread.sleep(2000);
					
					ApprovalcountPOM.GraphCount1Sta( test, "High", high, "Statutory");
				
					Thread.sleep(2000);
					
					ApprovalcountPOM.GraphCount1Sta( test, "Medium", medium, "Statutory");
				
					Thread.sleep(2000);
				
					ApprovalcountPOM.GraphCount1Sta( test, "Low", low, "Statutory");
				
					Thread.sleep(2000);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	 //Clicking on Back button
				Thread.sleep(2000);
			}
			else
			{
				test.log(LogStatus.PASS, "'Not Applicable' Compliance Count = "+NotApplicableValue);
				
				Thread.sleep(3000);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	//Clicking on Dashboard
				Thread.sleep(3000);
			}
			extent.endTest(test);
			extent.flush();
			
		}
		
//		@Test(priority = 5)
		void Overdue_PieChart() throws InterruptedException
		{
			test = extent.startTest("Pie Chart -Not Completed Status- 'Overdue' Count Verification");
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,500)");			//Scrolling down window by 1000 px.
			
			Thread.sleep(3000);
			int OverdueValue = Integer.parseInt(CFOcountPOM.clickOverdue().getText());	//Reading value of 'Not Completed'
			CFOcountPOM.clickOverdue().click();									//CLicking on 'Not Completed' count
			
			Thread.sleep(500);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());			//Reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());		//Reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());				//Reading Low risk count.
			
			int total = critical + high + medium + low;
		
			if(OverdueValue > 0)
			{
				
					ApprovalcountPOM.GraphCount( test, "Critical", critical, "Statutory");
				
					Thread.sleep(2000);
					
					ApprovalcountPOM.GraphCount( test, "High", high, "Statutory");
					
					Thread.sleep(2000);
				
					ApprovalcountPOM.GraphCount( test, "Medium", medium, "Statutory");
				
					Thread.sleep(2000);
				
					ApprovalcountPOM.GraphCount( test, "Low", low, "Statutory");
				
					Thread.sleep(2000);
				//Thread.sleep(5000);
			   // action.moveToElement(CFOcountPOM.clickBack3()).click().build().perform();	 //Clicking on Back button
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
				Thread.sleep(3000);
			}
			else
			{
				test.log(LogStatus.PASS, " 'Overdue' Compliance Count = "+OverdueValue);
				
				Thread.sleep(500);
			//	action.moveToElement(CFOcountPOM.clickBack3()).click().build().perform();	//Clicking on Dashboard
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
				Thread.sleep(2000);
			}
			
			extent.endTest(test);
			extent.flush();
		}
		
//		@Test(priority = 6)
		void dueToday_PieChart() throws InterruptedException
		{
			test = extent.startTest("Pie Chart -Not Completed Status- 'dueToday' Count Verification");
			
			Thread.sleep(1000);
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			Actions action = new Actions(getDriver());
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,500)");			//Scrolling down window by 1000 px.
			
			Thread.sleep(3000);
			int dueTodayValue = Integer.parseInt(CFOcountPOM.clickdueToday().getText());	//Reading value of 'Not Completed'
			CFOcountPOM.clickdueToday().click();									//CLicking on 'Not Completed' count
			
			Thread.sleep(500);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());			//Reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());		//Reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());				//Reading Low risk count.
			
			
			if(dueTodayValue > 0)
			{
				if(critical >= 0)
				{
					ApprovalcountPOM.GraphCount( test, "Critical", critical, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Critical' Risk Compliance Count = "+critical);
				}
				
				if(high >= 0)
				{
					ApprovalcountPOM.GraphCount( test, "High", high, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'High' Risk Compliance Count = "+high);
				}
				
				if(medium >= 0)
				{
					ApprovalcountPOM.GraphCount( test, "Medium", medium, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Medium' Risk Compliance Count = "+medium);
				}
				
				if(low >= 0)
				{
					ApprovalcountPOM.GraphCount( test, "Low", low, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Low' Risk Compliance Count = "+low);
				}
				
				Thread.sleep(5000);
			
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
				Thread.sleep(2000);
			}
			else
			{
				test.log(LogStatus.PASS, " 'Due Today' Compliance Count = "+dueTodayValue);
				
				Thread.sleep(500);
			//	action.moveToElement(CFOcountPOM.clickBack2()).click().build().perform();	//Clicking on Dashboard
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
				Thread.sleep(2000);
			}
			
			extent.endTest(test);
			extent.flush();
		}
			
//		@Test(priority = 7)
		void pendingForReview_PieChart() throws InterruptedException
		{
			test = extent.startTest("Pie Chart -Not Completed Status- 'Pending For Review' Count Verification");
		
			Thread.sleep(3000);
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait( getDriver(), (40));
	
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,500)");			//Scrolling down window by 1000 px.
			
			Thread.sleep(3000);
			int pendingForReviewValue = Integer.parseInt(CFOcountPOM.clickpendingForReview().getText());	//Reading value of 'Not Completed'
			CFOcountPOM.clickpendingForReview().click();									//CLicking on 'Not Completed' count
			
			Thread.sleep(500);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());			//Reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());		//Reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());				//Reading Low risk count.
			
			
			if(pendingForReviewValue > 0)
			{
				
					ApprovalcountPOM.GraphCount1Sta( test, "Critical", critical, "Statutory");
				
					Thread.sleep(2000);
					
					ApprovalcountPOM.GraphCount1Sta( test, "High", high, "Statutory");
				
					Thread.sleep(2000);
					
					ApprovalcountPOM.GraphCount1Sta( test, "Medium", medium, "Statutory");
				
					Thread.sleep(2000);
					
					ApprovalcountPOM.GraphCount1Sta( test, "Low", low, "Statutory");
			
					Thread.sleep(2000);
			
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
				Thread.sleep(2000);
			
			}	else
			{
				test.log(LogStatus.PASS, " 'Pending For Review' Compliance Count = "+pendingForReviewValue);
				
				Thread.sleep(500);
			//	action.moveToElement(CFOcountPOM.clickBack2()).click().build().perform();	//Clicking on Dashboard
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
		
			}
			
			extent.endTest(test);
			extent.flush();
		}
		
//		@Test(priority = 8)
		void inProgress_PieChart() throws InterruptedException
		{
			test = extent.startTest("Pie Chart -Not Completed Status- 'In Progress' Count Verification");
			Thread.sleep(3000);
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			
			WebDriverWait wait = new WebDriverWait( getDriver(), (40));
		
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,500)");			//Scrolling down window by 1000 px.
			
			Thread.sleep(3000);
			int inProgressValue = Integer.parseInt(CFOcountPOM.clickinProgress().getText());	//Reading value of 'Not Completed'
			CFOcountPOM.clickinProgress().click();									//CLicking on 'Not Completed' count
			
			Thread.sleep(3000);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());			//Reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());		//Reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());				//Reading Low risk count.
			
			
			if(inProgressValue > 0)
			{
				
					ApprovalcountPOM.GraphCount1Sta( test, "Critical", critical, "Statutory");
				
					Thread.sleep(2000);
					
					ApprovalcountPOM.GraphCount1Sta( test, "High", high, "Statutory");
				
					Thread.sleep(2000);
					
					ApprovalcountPOM.GraphCount1Sta( test, "Medium", medium, "Statutory");
				
					Thread.sleep(2000);
					
					ApprovalcountPOM.GraphCount1Sta( test, "Low", low, "Statutory");
			
					Thread.sleep(2000);
				//Thread.sleep(5000);
			//	action.moveToElement(CFOcountPOM.clickBack2()).click().build().perform();	 //Clicking on Back button
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
				Thread.sleep(2000);
			
			}	else
			{
				test.log(LogStatus.PASS, " 'In Progress' Compliance Count = "+inProgressValue);
				
				Thread.sleep(2000);
			//	action.moveToElement(CFOcountPOM.clickBack2()).click().build().perform();	//Clicking on Dashboard
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
		
			}
			
			extent.endTest(test);
			extent.flush();
		}
		
//		@Test(priority = 9)
		void rejected_PieChart() throws InterruptedException
		{
			test = extent.startTest("Pie Chart -Not Completed Status- ' Rejected' Count Verification");
		
			Thread.sleep(2000);
			Thread.sleep(3000);
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			
			WebDriverWait wait = new WebDriverWait( getDriver(),(40));
		//	wait.until(ExpectedConditions.visibilityOf(ApprovalcountPOM.clickManagement()));

		//	ApprovalcountPOM.clickManagement().click();
			Thread.sleep(5000);
			Actions action = new Actions(getDriver());
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,500)");			//Scrolling down window by 1000 px.
			
			Thread.sleep(3000);
			int rejectedValue = Integer.parseInt(CFOcountPOM.clickRejected().getText());	//Reading value of 'Not Completed'
			CFOcountPOM.clickRejected().click();									//CLicking on 'Not Completed' count
			
			Thread.sleep(500);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());			//Reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());		//Reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());				//Reading Low risk count.
			
		
			if(rejectedValue > 0)
			{
				
					ApprovalcountPOM.GraphCount1Sta( test, "Critical", critical, "Statutory");
				
					Thread.sleep(2000);
					
					ApprovalcountPOM.GraphCount1Sta( test, "High", high, "Statutory");
				
					Thread.sleep(2000);
					
					ApprovalcountPOM.GraphCount1Sta( test, "Medium", medium, "Statutory");
				
					Thread.sleep(2000);
					
					ApprovalcountPOM.GraphCount1Sta( test, "Low", low, "Statutory");
				
				
				//Thread.sleep(5000);
				//action.moveToElement(CFOcountPOM.clickBack2()).click().build().perform();	 //Clicking on Back button
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
		
			}
			else
			{
				test.log(LogStatus.PASS, " 'Rejected' Compliance Count = "+rejectedValue);
				
				Thread.sleep(500);
				//action.moveToElement(CFOcountPOM.clickBack2()).click().build().perform();	//Clicking on Dashboard
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
		
			}
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		
//		@Test(priority = 10)
		void BargraphIndustrySpeCriticalStatutory() throws InterruptedException
		{
			test = extent.startTest("Bar Graph - 'Commercial' Count Verification with 'Critical' Risk");
		
			
			Thread.sleep(2000);
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			CFOcountPOM.RefreshNow().click();
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(getDriver(), (30));
			wait.until(ExpectedConditions.visibilityOf(CFOcountPOM.clickCategories()));
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,925)");						//Scrolling down window by 1000 px.
			
			Thread.sleep(3000);
			int IndustrySpeCritical = Integer.parseInt(CFOcountPOM.clickIndustrySpeCriticalM().getText());	//Reading the High value of Labour compliance
			
			Thread.sleep(1000);
			CFOcountPOM.clickIndustrySpeCriticalM().click();					//Clicking on High bar of Labour  
			
			Thread.sleep(500);
			int ClosedTimely = Integer.parseInt(CFOcountPOM.clickBarClosedTimely().getText());			//reading Closed Timely count.
			int ClosedDelayed = Integer.parseInt(CFOcountPOM.clickBarClosedDelayed().getText());	//reading Closed Delayed count.
			int NotCompleted = Integer.parseInt(CFOcountPOM.clickBarNotCompleted().getText());	//reading Not Completed count.
			int NotApplicable = Integer.parseInt(CFOcountPOM.clickBarNotApplicable().getText());	//reading Not Applicable count.
			
			int total = ClosedTimely + ClosedDelayed + NotCompleted + NotApplicable;				//Calculating the values to match with High value of Labour.
		/*	
			if(IndustrySpeCritical == total)
			{
				test.log(LogStatus.PASS, "'Industry Specific' - Critical' Compliance Count matches to sum of all types of compliances.");
				test.log(LogStatus.PASS, "Total 'Industry Specific - Critical' Compliances : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'Industry Specific' - Critical' Compliance Count doesn't matches to sum of all types of compliances.");
				test.log(LogStatus.FAIL, "Total 'Industry Specific - Critical' Compliances : "+total+" | Total Sum : "+IndustrySpeCritical);
			}
			*/
			Thread.sleep(1000);
			if(IndustrySpeCritical > 0)
			{
				if(ClosedTimely > 0)
				{
					CFOcountPOM.BarGraphCount( test, "Closed Timely", ClosedTimely);
				}
				else
				{
					test.log(LogStatus.PASS, "'Critical - Closed Timely' Count = "+ClosedTimely);
				}
				
				if(ClosedDelayed > 0)
				{
					CFOcountPOM.BarGraphCount( test, "Closed Delayed", ClosedDelayed);
				}
				else
				{
					test.log(LogStatus.PASS, "'Critical - Closed Delayed' Count = "+ClosedDelayed);
				}
				if(NotCompleted > 0)
				{
					CFOcountPOM.BarGraphCount1( test, "Not Completed", NotCompleted);
				}
				else
				{
					test.log(LogStatus.PASS, "'Critical - Not Completed' Count = "+NotCompleted);
				}
				if(NotApplicable > 0)
				{
					CFOcountPOM.BarGraphCount( test, "Not Applicable", NotApplicable);
				}
				else
				{
					test.log(LogStatus.PASS, "'Critical - Not Applicable' Count = "+NotApplicable);
				}
				
				Thread.sleep(500);
				WebElement element = CFOcountPOM.clickBack();
				Actions actions = new Actions(getDriver());
				actions.moveToElement(element).click().perform();				//Clicking on Back button of Bar Graph.
				Thread.sleep(2000);
			}else
				{
					test.log(LogStatus.PASS, "'Commercial - Critical' Count = "+IndustrySpeCritical);
					
					Thread.sleep(500);
					WebElement element = CFOcountPOM.clickBack();
					Actions actions = new Actions(getDriver());
					actions.moveToElement(element).click().perform();				//Clicking on Back button of Bar Graph.
				}
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority =11)
		void BargraphIndustrySpeHighStatutory() throws InterruptedException
		{
			test = extent.startTest("Bar Graph - 'Commercial' Count Verification with 'High' risk");
			//test.log(LogStatus.INFO, "Test Initiated");
			Thread.sleep(4000);
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			CFOcountPOM.RefreshNow().click();
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,925)");						//Scrolling down window by 1000 px.
			
			String PendingReview = CFOcountPOM.clickIndustrySpeHighM().getText();	//Reading the Pending For Review value of Human Resource
			PendingReview = PendingReview.replaceAll(" ","");								//Removing all white spaces from string. 
			
			Thread.sleep(4000);
			int IndustrySpeHigh = Integer.parseInt(PendingReview);	//Reading the Medium value of Labour compliance
			CFOcountPOM.clickIndustrySpeHighM().click();					//Clicking on High bar of Labour  
			
			Thread.sleep(3000);
			int ClosedTimely = Integer.parseInt(CFOcountPOM.clickBarClosedTimely().getText());			//reading Closed Timely count.
			Thread.sleep(1000);
			int ClosedDelayed = Integer.parseInt(CFOcountPOM.clickBarClosedDelayed().getText());	//reading Closed Delayed count.
			Thread.sleep(1000);
			int NotCompleted = Integer.parseInt(CFOcountPOM.clickBarNotCompleted().getText());	//reading Not Completed count.
			Thread.sleep(1000);
			int NotApplicable = Integer.parseInt(CFOcountPOM.clickBarNotApplicable().getText());	//reading Not Applicable count.
			Thread.sleep(1000);
			int total = ClosedTimely + ClosedDelayed + NotCompleted + NotApplicable;				//Calculating the values to match with High value of Labour.
			/*
			if(IndustrySpeHigh == total)
			{
				test.log(LogStatus.PASS, "'Industry Specific - High' Compliance Count matches to sum of all types of compliances.");
				test.log(LogStatus.PASS, "Total 'Industry Specific - High' Compliances : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'Industry Specific - High' Compliance Count doesn't matches to sum of all types of compliances.");
				test.log(LogStatus.FAIL, "Total 'Industry Specific - High' Compliances : "+total+" | Total Sum : "+IndustrySpeHigh);
			}
			*/
			if(IndustrySpeHigh > 0)
			{
				if(ClosedTimely > 0)
				{
					Thread.sleep(2000);
					CFOcountPOM.BarGraphCount( test, "Closed Timely", ClosedTimely);
				}
				else
				{
					test.log(LogStatus.PASS, "'High - Closed Timely' Count = "+ClosedTimely);
				}
				
				if(ClosedDelayed > 0)
				{
					CFOcountPOM.BarGraphCount( test, "Closed Delayed", ClosedDelayed);
				}
				else
				{
					test.log(LogStatus.PASS, "'High - Closed Delayed' Count = "+ClosedDelayed);
				}
				if(NotCompleted > 0)
				{
					CFOcountPOM.BarGraphCount1( test, "Not Completed", NotCompleted);
				}
				else
				{
					test.log(LogStatus.PASS, "'High - Not Completed' Count = "+NotCompleted);
				}
				if(NotApplicable > 0)
				{
					CFOcountPOM.BarGraphCount( test, "Not Applicable", NotApplicable);
				}
				else
				{
					test.log(LogStatus.PASS, "'High - Not Applicable' Count = "+NotApplicable);
				}
				
				Thread.sleep(500);
				WebElement element = CFOcountPOM.clickBack();
				Actions actions = new Actions(getDriver());
			
				actions.moveToElement(element).click().perform();				//Clicking on Back button of Bar Graph.
				Thread.sleep(3000);
			}
			else
			{
				test.log(LogStatus.PASS, "'Commercial - High' Count = "+IndustrySpeHigh);
				
				Thread.sleep(500);
				WebElement element = CFOcountPOM.clickBack();
				Actions actions = new Actions(getDriver());
				actions.moveToElement(element).click().perform();				//Clicking on Back button of Bar Graph.
			}
				Thread.sleep(1000);
			extent.endTest(test);
			extent.flush();
		}
		
//	@Test(priority = 12)
		void BargraphIndustrySpeMediumStatutory() throws InterruptedException
		{
			test = extent.startTest("Bar Graph - 'Commercial' Count Verification with 'Medium' risk");
		//	test.log(LogStatus.INFO, "Test Initiated");
			Thread.sleep(4000);
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			CFOcountPOM.RefreshNow().click();
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("window.scrollBy(0,925)");						//Scrolling down window by 1000 px.
			
			Thread.sleep(4000);
			int IndustrySpeMedium = Integer.parseInt(CFOcountPOM.clickIndustrySpeMediumM().getText());	//Reading the Medium value of Labour compliance
			CFOcountPOM.clickIndustrySpeMediumM().click();					//Clicking on High bar of Labour  
			
			Thread.sleep(3000);
	    	int ClosedTimely = Integer.parseInt(CFOcountPOM.clickBarClosedTimely().getText());			//reading Closed Timely count.
		    Thread.sleep(1000);
			int ClosedDelayed = Integer.parseInt(CFOcountPOM.clickBarClosedDelayed().getText());	//reading Closed Delayed count.
			Thread.sleep(1000);
			int NotCompleted = Integer.parseInt(CFOcountPOM.clickBarNotCompleted().getText());	//reading Not Completed count.
			Thread.sleep(500);
			int NotApplicable = Integer.parseInt(CFOcountPOM.clickBarNotApplicable().getText());	//reading Not Applicable count.
			Thread.sleep(500);
			int total = ClosedTimely + ClosedDelayed + NotCompleted + NotApplicable;				//Calculating the values to match with High value of Labour.
			/*
			if(IndustrySpeMedium == total)
			{
				test.log(LogStatus.PASS, "'Industry Specific - High' Compliance Count matches to sum of all types of compliances.");
				test.log(LogStatus.PASS, "Total 'Industry Specific - High' Compliances : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'Industry Specific - High' Compliance Count doesn't matches to sum of all types of compliances.");
				test.log(LogStatus.FAIL, "Total 'Industry Specific - High' Compliances : "+total+" | Total Sum : "+IndustrySpeMedium);
			}
			*/
			if(IndustrySpeMedium > 0)
			{
				if(ClosedTimely > 0)
				{
					CFOcountPOM.BarGraphCount( test, "Closed Timely", ClosedTimely);
				}
				else
				{
					test.log(LogStatus.PASS, "'Medium - Closed Timely' Count = "+ClosedTimely);
				}
				
				if(ClosedDelayed > 0)
				{
					CFOcountPOM.BarGraphCount( test, "Closed Delayed", ClosedDelayed);
				}
				else
				{
					test.log(LogStatus.PASS, "'Medium - Closed Delayed' Count = "+ClosedDelayed);
				}
				if(NotCompleted > 0)
				{
					CFOcountPOM.BarGraphCount1( test, "Not Completed", NotCompleted);
				}
				else
				{
					test.log(LogStatus.PASS, "'Medium - Not Completed' Count = "+NotCompleted);
				}
				if(NotApplicable > 0)
				{
					CFOcountPOM.BarGraphCount( test, "Not Applicable", NotApplicable);
				}
				else
				{
					test.log(LogStatus.PASS, "'Medium - Not Applicable' Count = "+NotApplicable);
				}
				
				Thread.sleep(500);
				WebElement element = CFOcountPOM.clickBack();
				Actions actions = new Actions(getDriver());
				actions.moveToElement(element).click().perform();				//Clicking on Back button of Bar Graph.
				Thread.sleep(2000);
			}
			else
			{
				test.log(LogStatus.PASS, "'Commercial - Medium' Count = "+IndustrySpeMedium);
				
				Thread.sleep(3000);
				WebElement element = CFOcountPOM.clickBack();
				Actions actions = new Actions(getDriver());
				actions.moveToElement(element).click().perform();				//Clicking on Back button of Bar Graph.
				Thread.sleep(3000);
			}
			extent.endTest(test);
			extent.flush();
		}
		
 //       @Test(priority = 13)
		void BargraphIndustrySpeLowStatutory() throws InterruptedException
		{
			test = extent.startTest("Bar Graph - 'Commercial' Count Verification with 'Low' risk");
		
			Thread.sleep(4000);
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			CFOcountPOM.RefreshNow().click();
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor)getDriver() ;
			js.executeScript("window.scrollBy(0,925)");						//Scrolling down window by 1000 px.
			
			
			Thread.sleep(4000);
			int IndustrySpeLow = Integer.parseInt(CFOcountPOM.clickIndustrySpeLowM().getText());	//Reading the Medium value of Labour compliance
			CFOcountPOM.clickIndustrySpeLowM().click();					//Clicking on low bar of Indistry Specific  
			
			Thread.sleep(500);
			int ClosedTimely = Integer.parseInt(CFOcountPOM.clickBarClosedTimely().getText());			//reading Closed Timely count.
			int ClosedDelayed = Integer.parseInt(CFOcountPOM.clickBarClosedDelayed().getText());	//reading Closed Delayed count.
			int NotCompleted = Integer.parseInt(CFOcountPOM.clickBarNotCompleted().getText());	//reading Not Completed count.
			int NotApplicable = Integer.parseInt(CFOcountPOM.clickBarNotApplicable().getText());	//reading Not Applicable count.
			
			int total = ClosedTimely + ClosedDelayed + NotCompleted + NotApplicable;				//Calculating the values to match with High value of Labour.
		/*	
			if(IndustrySpeLow == total)
			{
				test.log(LogStatus.PASS, "'Indistry Specific - High' Compliance Count matches to sum of all types of compliances.");
				test.log(LogStatus.PASS, "Total 'Indistry Specific - High' Compliances : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'Indistry Specific - High' Compliance Count doesn't matches to sum of all types of compliances.");
				test.log(LogStatus.FAIL, "Total 'Indistry Specific - High' Compliances : "+total+" | Total Sum : "+IndustrySpeLow);
			}
			*/
			if(IndustrySpeLow > 0)
			{
				if(ClosedTimely > 0)
				{Thread.sleep(500);
					CFOcountPOM.BarGraphCount( test, "Closed Timely", ClosedTimely);
				}
				else
				{
					test.log(LogStatus.PASS, "'Low - Closed Timely' Count = "+ClosedTimely);
				}
				
				if(ClosedDelayed > 0)
				{
					Thread.sleep(500);
					CFOcountPOM.BarGraphCount( test, "Closed Delayed", ClosedDelayed);
				}
				else
				{
					test.log(LogStatus.PASS, "'Low - Closed Delayed' Count = "+ClosedDelayed);
				}
				if(NotCompleted > 0)
				{Thread.sleep(500);
					CFOcountPOM.BarGraphCount1( test, "Not Completed", NotCompleted);
				}
				else
				{
					test.log(LogStatus.PASS, "'Low - Not Completed' Count = "+NotCompleted);
				}
				if(NotApplicable > 0)
				{
					Thread.sleep(500);
					CFOcountPOM.BarGraphCount( test, "Not Applicable", NotApplicable);
				}
				else
				{
					test.log(LogStatus.PASS, "'Low - Not Applicable' Count = "+NotApplicable);
				}
				
				Thread.sleep(500);
				WebElement element = CFOcountPOM.clickBack();
				Actions actions = new Actions(getDriver());
				actions.moveToElement(element).click().perform();				//Clicking on Back button of Bar Graph.
				
				Thread.sleep(500);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
				Thread.sleep(2000);
			}
			else
			{
				test.log(LogStatus.PASS, "'Commercial - Low' Count = "+IndustrySpeLow);
				
				Thread.sleep(500);
				WebElement element = CFOcountPOM.clickBack();
				Actions actions = new Actions(getDriver());
				actions.moveToElement(element).click().perform();				//Clicking on Back button of Bar Graph.
				
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
				Thread.sleep(2000);
			}
			extent.endTest(test);
			extent.flush();
		}
		
		
		
		
//	@Test(priority = 14)
		void RiskSummaryCriticalStatutory() throws InterruptedException
		{
		
			Thread.sleep(3000);
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,1500)");					//Scrolling down window by 1000 px.cfo
		
			test = extent.startTest("Risk Summary - 'Critical' Count Verification");
			
			
			Thread.sleep(4000);
			String NotCompleted = CFOcountPOM.clickRiskCriticalNotCompleted().getText();		//Reading the Closed Timely value of Human Resource
			NotCompleted = NotCompleted.replaceAll(" ","");									//Removing all white spaces from string. 
			int RiskCritical_NotCompleted = Integer.parseInt(NotCompleted);
		//	int RiskCritical_NotCompleted = Integer.parseInt(CFOcountPOM.clickRiskCriticalNotCompleted().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskCritical_NotCompleted > 0)
			{
				CFOcountPOM.clickRiskCriticalNotCompleted().click();			//Clicking on Not Completed compliances bar of High risk.  
				Thread.sleep(2000);
				ApprovalcountPOM.RiskGraphCount1( test, "Critical - Not Completed", RiskCritical_NotCompleted, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'Critical - Not Completed' Count = "+RiskCritical_NotCompleted);
			}
			
			
			Thread.sleep(2000);
			List<WebElement>roc = getDriver().findElements(By.xpath("(//*[@class='highcharts-legend-item highcharts-column-series highcharts-color-undefined highcharts-series-0'])"));
			ApprovalcountPOM.selectOptionFromDropDown_bs(roc, "Not Completed");
				
			Thread.sleep(5000);
			int RiskCritical_ClosedDelayed = Integer.parseInt(CFOcountPOM.clickRiskCriticalClosedDelayed().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskCritical_ClosedDelayed > 0)
			{
				CFOcountPOM.clickRiskCriticalClosedDelayed().click();			//Clicking on Not Completed compliances bar of High risk.  
				Thread.sleep(2000);
				ApprovalcountPOM.RiskGraphCount( test, "Critical - Closed Delayed", RiskCritical_ClosedDelayed, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'Critical - Closed Delayed' Count = "+RiskCritical_ClosedDelayed);
			}
			
			Thread.sleep(3000);
			int RiskCritical_ClosedTimely = Integer.parseInt(CFOcountPOM.clickRiskCriticalClosedTimely().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskCritical_ClosedTimely > 0)
			{
				CFOcountPOM.clickRiskCriticalClosedTimely().click();			//Clicking on Not Completed compliances bar of High risk.  
				Thread.sleep(2000);
				ApprovalcountPOM.RiskGraphCount( test, "Critical - Closed Timely", RiskCritical_ClosedTimely, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'Critical - Closed Timely' Count = "+RiskCritical_ClosedTimely);
			}
			
			
			Thread.sleep(3000);
			int RiskCritical_DueToday = Integer.parseInt(CFOcountPOM.clickRiskCriticalDueToday().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskCritical_DueToday > 0)
			{
				CFOcountPOM.clickRiskCriticalDueToday().click();			//Clicking on Not Completed compliances bar of High risk.  
				Thread.sleep(2000);
				CFOcountPOM.RiskGraphCount1( test, "Critical - Due Today", RiskCritical_DueToday, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'Critical - Due Today' Count = "+RiskCritical_DueToday);
			}
			
			Thread.sleep(3000);
			int RiskCritical_NotApplicable = Integer.parseInt(CFOcountPOM.clickRiskCriticalNotApplicable().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskCritical_NotApplicable > 0)
			{
				CFOcountPOM.clickRiskCriticalNotApplicable().click();			//Clicking on Not Completed compliances bar of High risk.  
				Thread.sleep(2000);
				CFOcountPOM.RiskGraphCountNA( test, "Critical - Not Applicable", RiskCritical_NotApplicable, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'Critical - Not Applicable' Count = "+RiskCritical_NotApplicable);
			}
			
			Thread.sleep(2000);
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 15)
		void RiskSummaryHighStatutory() throws InterruptedException
		{		
			test = extent.startTest("Risk Summary - 'High' Count Verification");
			
			Thread.sleep(3000);
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,1500)");
			//js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(3000);
			String NotCompleted = CFOcountPOM.clickRiskHighNotCompleted().getText();		//Reading the Closed Timely value of Human Resource
			NotCompleted = NotCompleted.replaceAll(" ","");									//Removing all white spaces from string. 
			int RiskHigh_NotCompleted = Integer.parseInt(NotCompleted);
		
		//	int RiskHigh_NotCompleted = Integer.parseInt(CFOcountPOM.clickRiskHighNotCompleted().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskHigh_NotCompleted > 0)
			{
				Thread.sleep(500);
				CFOcountPOM.clickRiskHighNotCompleted().click();			//Clicking on Not Completed compliances bar of High risk.  
				
				ApprovalcountPOM.RiskGraphCount1S( test, "High - Not Completed", RiskHigh_NotCompleted, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'High - Not Completed' Count = "+RiskHigh_NotCompleted);
			}
			
			Thread.sleep(2000);
			List<WebElement>roc = getDriver().findElements(By.xpath("(//*[@class='highcharts-legend-item highcharts-column-series highcharts-color-undefined highcharts-series-0'])"));
			ApprovalcountPOM.selectOptionFromDropDown_bs(roc, "Not Completed");
				
			Thread.sleep(5000);
		
			Thread.sleep(2000);
			int RiskHigh_ClosedDelayed = Integer.parseInt(CFOcountPOM.clickRiskHighClosedDelayed().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskHigh_ClosedDelayed > 0)
			{
				Thread.sleep(500);
				CFOcountPOM.clickRiskHighClosedDelayed().click();			//Clicking on Not Completed compliances bar of High risk.  
				Thread.sleep(500);
				ApprovalcountPOM.RiskGraphCountS( test, "High - Closed Delayed", RiskHigh_ClosedDelayed, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'High - Closed Delayed' Count = "+RiskHigh_ClosedDelayed);
			}
			
			Thread.sleep(3000);
			int RiskHigh_ClosedTimely = Integer.parseInt(CFOcountPOM.clickRiskHighClosedTimely().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskHigh_ClosedTimely > 0)
			{
				Thread.sleep(500);
				CFOcountPOM.clickRiskHighClosedTimely().click();			//Clicking on Not Completed compliances bar of High risk.  
				Thread.sleep(500);
				ApprovalcountPOM.RiskGraphCountS( test, "High - Closed Timely", RiskHigh_ClosedTimely, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'High - Closed Timely' Count = "+RiskHigh_ClosedTimely);
			}
			
			Thread.sleep(3000);
			int RiskHigh_DueToday = Integer.parseInt(CFOcountPOM.clickRiskHighDueToday().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskHigh_DueToday > 0)
			{
				Thread.sleep(500);
				CFOcountPOM.clickRiskHighDueToday().click();			//Clicking on Not Completed compliances bar of High risk.  
				
				CFOcountPOM.RiskGraphCount1( test, "High - Due Today", RiskHigh_DueToday, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'High - Due Today' Count = "+RiskHigh_DueToday);
			}
			
			Thread.sleep(3000);
			int RiskHigh_NotApplicable = Integer.parseInt(CFOcountPOM.clickRiskHighNotApplicable().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskHigh_NotApplicable > 0)
			{
				CFOcountPOM.clickRiskHighNotApplicable().click();			//Clicking on Not Completed compliances bar of High risk.  
				Thread.sleep(2000);
				CFOcountPOM.RiskGraphCountNAC( test, "High - Not Applicable", RiskHigh_NotApplicable, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'High - Not Applicable' Count = "+RiskHigh_NotApplicable);
			}
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority =16)
		void RiskSummaryMediumStatutory() throws InterruptedException
		{
			test = extent.startTest("Risk Summary - 'Medium' Count Verification");
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,1500)");		
			Thread.sleep(1000);
			String NotCompleted = CFOcountPOM.clickRiskMediumNotCompleted().getText();		//Reading the Closed Timely value of Human Resource
			NotCompleted = NotCompleted.replaceAll(" ","");									//Removing all white spaces from string. 
			int RiskMedium_NotCompleted = Integer.parseInt(NotCompleted);
		
		//	int RiskMedium_NotCompleted = Integer.parseInt(CFOcountPOM.clickRiskMediumNotCompleted().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskMedium_NotCompleted > 0)
			{
				Thread.sleep(500);
				CFOcountPOM.clickRiskMediumNotCompleted().click();			//Clicking on Not Completed compliances bar of High risk.  
				
				ApprovalcountPOM.RiskGraphCount1S( test, "Medium - Not Completed", RiskMedium_NotCompleted, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'Medium - Not Completed' Count = "+RiskMedium_NotCompleted);
			}
			
			Thread.sleep(2000);
			List<WebElement>roc = getDriver().findElements(By.xpath("(//*[@class='highcharts-legend-item highcharts-column-series highcharts-color-undefined highcharts-series-0'])"));
			ApprovalcountPOM.selectOptionFromDropDown_bs(roc, "Not Completed");
				
			Thread.sleep(5000);
		
			
			int RiskMedium_ClosedDelayed = Integer.parseInt(CFOcountPOM.clickRiskMediumClosedDelayed().getText());	//Reading the High Risk value of Not Completed compliance
			Thread.sleep(500);
			if(RiskMedium_ClosedDelayed > 0)
			{
				Thread.sleep(500);
				CFOcountPOM.clickRiskMediumClosedDelayed().click();			//Clicking on Not Completed compliances bar of High risk.  
				Thread.sleep(2000);
				ApprovalcountPOM.RiskGraphCountS( test, "Medium - Closed Delayed", RiskMedium_ClosedDelayed, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'Medium - Closed Delayed' Count = "+RiskMedium_ClosedDelayed);
			}
			
			Thread.sleep(3000);
			int RiskMedium_ClosedTimely = Integer.parseInt(CFOcountPOM.clickRiskMediumClosedTimely().getText());	//Reading the High Risk value of Not Completed compliance
			Thread.sleep(500);
			if(RiskMedium_ClosedTimely > 0)
			{
				Thread.sleep(500);
				CFOcountPOM.clickRiskMediumClosedTimely().click();			//Clicking on Not Completed compliances bar of High risk.  
				Thread.sleep(2000);
				ApprovalcountPOM.RiskGraphCountS( test, "Medium - Closed Timely", RiskMedium_ClosedTimely, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'Medium - Closed Timely' Count = "+RiskMedium_ClosedTimely);
			}
			
			Thread.sleep(3000);
			List<WebElement>roc1 = getDriver().findElements(By.xpath("(//*[@class='highcharts-legend-item highcharts-column-series highcharts-color-undefined highcharts-series-1'])"));
			ApprovalcountPOM.selectOptionFromDropDown_bs(roc1, "Closed Delayed");
			Thread.sleep(3000);
			List<WebElement>roc2 = getDriver().findElements(By.xpath("(//*[@class='highcharts-legend-item highcharts-column-series highcharts-color-undefined highcharts-series-2'])"));
			ApprovalcountPOM.selectOptionFromDropDown_bs(roc2, "Closed Timely");
			Thread.sleep(3000);
			
			int RiskMedium_DueToday = Integer.parseInt(CFOcountPOM.clickRiskMediumDueToday().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskMedium_DueToday > 0)
			{
				Thread.sleep(500);
				CFOcountPOM.clickRiskMediumDueToday().click();			//Clicking on Not Completed compliances bar of High risk.  
				
				CFOcountPOM.RiskGraphCount1( test, "Medium - Due Today", RiskMedium_DueToday, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'Medium - Due Today' Count = "+RiskMedium_DueToday);
			}
			
			Thread.sleep(3000);
			int RiskMedium_NotApplicable = Integer.parseInt(CFOcountPOM.clickRiskMediumNotApplicable().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskMedium_NotApplicable > 0)
			{
				CFOcountPOM.clickRiskMediumNotApplicable().click();			//Clicking on Not Completed compliances bar of High risk.  
				Thread.sleep(2000);
				CFOcountPOM.RiskGraphCountNAC( test, "Medium - Not Applicable", RiskMedium_NotApplicable, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'Medium - Not Applicable' Count = "+RiskMedium_NotApplicable);
			}
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 17)
		void RiskSummaryLowStatutory() throws InterruptedException
		{		
			test = extent.startTest("Risk Summary - 'Low' Count Verification");
			
			Thread.sleep(500);
			Thread.sleep(3000);
			CFOcountPOM.YearTodate().click();
			Thread.sleep(1000);
			CFOcountPOM.ALL().click();
			Thread.sleep(1000);
			CFOcountPOM.clickApply().click();
			Thread.sleep(5000);
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,1500)");
			Thread.sleep(4000);
			String NotCompleted = CFOcountPOM.clickRiskLowNotCompleted().getText();		//Reading the Closed Timely value of Human Resource
			NotCompleted = NotCompleted.replaceAll(" ","");									//Removing all white spaces from string. 
			int RiskLow_NotCompleted = Integer.parseInt(NotCompleted);
		
		//	int RiskLow_NotCompleted = Integer.parseInt(CFOcountPOM.clickRiskLowNotCompleted().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskLow_NotCompleted > 0)
			{
				Thread.sleep(500);
				CFOcountPOM.clickRiskLowNotCompleted().click();			//Clicking on Not Completed compliances bar of High risk.  
				Thread.sleep(2000);
				ApprovalcountPOM.RiskGraphCount1S( test, "Low - Not Completed", RiskLow_NotCompleted, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'Low - Not Completed' Count = "+RiskLow_NotCompleted);
			}
			
			Thread.sleep(2000);
			List<WebElement>roc = getDriver().findElements(By.xpath("(//*[@class='highcharts-legend-item highcharts-column-series highcharts-color-undefined highcharts-series-0'])"));
			ApprovalcountPOM.selectOptionFromDropDown_bs(roc, "Not Completed");
				
			Thread.sleep(5000);
			
			int RiskLow_ClosedDelayed = Integer.parseInt(CFOcountPOM.clickRiskLowClosedDelayed().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskLow_ClosedDelayed > 0)
			{
				Thread.sleep(500);
				CFOcountPOM.clickRiskLowClosedDelayed().click();			//Clicking on Not Completed compliances bar of High risk.  
				Thread.sleep(2000);
				ApprovalcountPOM.RiskGraphCountS( test, "Low - Closed Delayed", RiskLow_ClosedDelayed, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'Low - Closed Delayed' Count = "+RiskLow_ClosedDelayed);
			}
			
			Thread.sleep(3000);
			int RiskLow_ClosedTimely = Integer.parseInt(CFOcountPOM.clickRiskLowClosedTimely().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskLow_ClosedTimely > 0)
			{
				Thread.sleep(500);
				CFOcountPOM.clickRiskLowClosedTimely().click();			//Clicking on Not Completed compliances bar of High risk.  
				Thread.sleep(2000);
				ApprovalcountPOM.RiskGraphCountS( test, "Low - Closed Timely", RiskLow_ClosedTimely, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'Low - Closed Timely' Count = "+RiskLow_ClosedTimely);
			}
			
			Thread.sleep(3000);
			int RiskLow_DueToday = Integer.parseInt(CFOcountPOM.clickRiskLowDueToday().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskLow_DueToday > 0)
			{
				Thread.sleep(500);
				CFOcountPOM.clickRiskLowDueToday().click();			//Clicking on Not Completed compliances bar of High risk.  
				
				CFOcountPOM.RiskGraphCount1( test, "Low - Due Today", RiskLow_DueToday, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'Low - Due Today' Count = "+RiskLow_DueToday);
			}
			
			
			Thread.sleep(3000);
			int RiskLow_NotApplicable = Integer.parseInt(CFOcountPOM.clickRiskLowNotApplicable().getText());	//Reading the High Risk value of Not Completed compliance
			if(RiskLow_NotApplicable > 0)
			{
				CFOcountPOM.clickRiskLowNotApplicable().click();			//Clicking on Not Completed compliances bar of High risk.  
				Thread.sleep(2000);
				CFOcountPOM.RiskGraphCountNAC( test, "Low - Not Applicable", RiskLow_NotApplicable, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "'Low - Not Applicable' Count = "+RiskLow_NotApplicable);
			}
			
			
			Thread.sleep(500);
			performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
			Thread.sleep(2000);
			extent.endTest(test);
			extent.flush();
		}
		
		

	
		
		@Test(priority = 18)
		void DepartmentSummaryAccountStatutory() throws InterruptedException
		{
			Thread.sleep(3000);		
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,2000)");					//Scrolling down window by 1500 px.
		//	js.executeScript("window.scrollBy(0,500)");
			test = extent.startTest("Department Summary - 'Account' Count Verification");
		
			Thread.sleep(5000);
			String NotCompleted = CFOcountPOM.clickAccountOverdue().getText();			//Reading the Overdue value of Human Resource
		//	NotCompleted = NotCompleted.replaceAll(" ","");									//Removing all white spaces from string. 
			int Overdue = Integer.parseInt(NotCompleted);						
			if(Overdue > 0)
			{Thread.sleep(2000);
				CFOcountPOM.clickAccountOverdue().click();
				ApprovalcountPOM.RiskGraphCount1( test, "Overdue", Overdue, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "Overdue Complaince Count = "+ Overdue + ".");
			}
			
			  WebElement roc = getDriver().findElement(By.cssSelector("#highcharts-12 > svg > g.highcharts-legend > g > g > g.highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-2 > rect"));
				
			  roc.click();
			Thread.sleep(5000);
			
			Thread.sleep(500);
			String ClosedDelayed = CFOcountPOM.clickAccountClosedDelayed().getText();	//Reading the Closed Delayed value of Human Resource
			ClosedDelayed = ClosedDelayed.replaceAll(" ","");								//Removing all white spaces from string. 
			int Closed_Delayed = Integer.parseInt(ClosedDelayed);	
		//	int Closed_Delayed = Integer.parseInt(CFOcountPOM.clickHumanClosedDelayed().getText());	//Reading the High Risk value of Not Completed compliance

			if(Closed_Delayed > 0)
			{
				CFOcountPOM.clickAccountClosedDelayed().click();
				Thread.sleep(2000);
				ApprovalcountPOM.RiskGraphCount( test, "Closed Delayed", Closed_Delayed, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "Closed Delayed Complaince Count = "+ Closed_Delayed + ".");
			}
		
			
			
			Thread.sleep(5000);
			String ClosedTimely = CFOcountPOM.clickAccountClosedTimely().getText();		//Reading the Closed Timely value of Human Resource
			ClosedTimely = ClosedTimely.replaceAll(" ","");									//Removing all white spaces from string. 
			int Closed_Timely = Integer.parseInt(ClosedTimely);						
			if(Closed_Timely > 0)
			{
				CFOcountPOM.clickAccountClosedTimely().click();
				ApprovalcountPOM.RiskGraphCount( test, "Closed Timely", Closed_Timely, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "Closed Timely Complaince Count = "+ Closed_Timely + ".");
			}
		
			
			Thread.sleep(3000);
			String PendingReview = CFOcountPOM.clickAccountPendingReview().getText();	//Reading the Pending For Review value of Human Resource
			PendingReview = PendingReview.replaceAll(" ","");								//Removing all white spaces from string. 
			int Pending_Review = Integer.parseInt(PendingReview);						
			if(Pending_Review > 0)
			{
				Thread.sleep(3000);
				CFOcountPOM.clickAccountPendingReview().click();
				ApprovalcountPOM.RiskGraphCount( test, "Pending For Review", Pending_Review, "Statutory");
			}
			else
			{
				test.log(LogStatus.PASS, "Pending For Review Complaince Count = "+ Pending_Review + ".");
			}
			
			
			Thread.sleep(3000);
				String NotApplicable = CFOcountPOM.clickAccountRejected().getText();	//Reading the Pending For Review value of Human Resource
				//NotApplicable = NotApplicable.replaceAll(" ","");	
				Thread.sleep(3000);//Removing all white spaces from string. 
				int Rejected = Integer.parseInt(NotApplicable);						
				if(Rejected > 0)
				{
					Thread.sleep(3000);
					CFOcountPOM.clickAccountRejected().click();
					ApprovalcountPOM.RiskGraphCount( test, "Rejected", Rejected, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "Rejected Complaince Count = "+ Rejected + ".");
				}
			
			Thread.sleep(500);
			
			Thread.sleep(3000);
			String FinaNotAppli = CFOcountPOM.clickFinanceNotAppliInternal().getText();			//Reading the Overdue value of Human Resource
			FinaNotAppli = FinaNotAppli.replaceAll(" ","");									//Removing all white spaces from string. 
			int Fina_NotAppli= Integer.parseInt(FinaNotAppli);						
			if(Fina_NotAppli > 0)
			{
				CFOcountPOM.clickFinanceNotAppliInternal().click();
				ApprovalcountPOM.RiskGraphCount( test, " Not Applicable", Fina_NotAppli, "Internal");
			}
			else
			{
				test.log(LogStatus.PASS, "' Not Applicable' Compliances Count = "+ Fina_NotAppli + ".");
			}
			
			Thread.sleep(500);

			performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard

			Thread.sleep(3000);
			extent.endTest(test);
			extent.flush();
		}
		
//		@Test(priority = 26)
		void NotCompleted_PieChartPeriod() throws InterruptedException
		{
			test = extent.startTest("Period-Pie Chart -Completion Status- 'Not Completed' Count Verification");
			
			
			Thread.sleep(3000);
			Actions action = new Actions(getDriver());
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			//js.executeScript("window.scrollBy(0,500)");			//Scrolling down window by 1000 px.cfo
			js.executeScript("window.scrollBy(0,2500)");
			Thread.sleep(3000);
			
			WebDriverWait wait = new WebDriverWait( getDriver(), (30));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
			Thread.sleep(3000);
			
			AuditorcountPOM.DateText().click();	
			Thread.sleep(1000);
			AuditorcountPOM.DateYear().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Year().click();	
			Thread.sleep(3000);
			AuditorcountPOM.DateMonth().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Month().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Date().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Apply().click();	
			Thread.sleep(5000);
			int NotCompletedValue = Integer.parseInt(CFOcountPOM.clickNotCompleted().getText());	//Reading value of 'Not Completed'
			CFOcountPOM.clickNotCompleted().click();									//CLicking on 'Not Completed' count
			
			Thread.sleep(500);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());			//Reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());		//Reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());				//Reading Low risk count.
			
			int total = critical + high + medium + low;
			/*
			if(NotCompletedValue == total)
			{
				test.log(LogStatus.PASS, "Not Completed' Compliance Count matches to sum of all risked compliances.");
				test.log(LogStatus.PASS, "Total Not Completed' Compliances : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'Not Completed' Compliance Count doesn't matches to sum of all risked compliances.");
				test.log(LogStatus.FAIL, "Total 'Not Completed' Compliances : "+total+" | Total Sum : "+NotCompletedValue);
			}
		*/
			if(NotCompletedValue > 0)
			{
				if(critical >= 0)
				{
					ApprovalcountPOM.GraphCountPe( test, "Critical", critical, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Critical' Risk Compliance Count = "+critical);
				}
				
				if(high >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe( test, "High", high, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'High' Risk Compliance Count = "+high);
				}
				
				if(medium >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe( test, "Medium", medium, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Medium' Risk Compliance Count = "+medium);
				}
				
				if(low >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe( test, "Low", low, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Low' Risk Compliance Count = "+low);
				}
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
				Thread.sleep(500);
				Thread.sleep(500);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	 //Clicking on Back button
				getDriver().switchTo().parentFrame();
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();
				Thread.sleep(2000);
			}
			else
			{
				test.log(LogStatus.PASS, " 'Completed' Compliance Count = "+NotCompletedValue);
				
				Thread.sleep(2000);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	//Clicking on Dashboard
				Thread.sleep(2000);
			}
			
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 27)
		void ClosedDelayed_PieChartPeriod() throws InterruptedException
		{
			test = extent.startTest("Period-Pie Chart -Completion Status- 'Closed Delayed' Count Verification");
			
			Actions action = new Actions(getDriver());
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,2500)");						//Scrolling down window by 1000 px.
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait( getDriver(), (30));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
			Thread.sleep(3000);
			
			AuditorcountPOM.DateText().click();	
			Thread.sleep(1000);
			AuditorcountPOM.DateYear().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Year().click();	
			Thread.sleep(3000);
			AuditorcountPOM.DateMonth().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Month().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Date().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Apply().click();	
			Thread.sleep(5000);
			
			Thread.sleep(1500);
			int ClosedTimelyValue = Integer.parseInt(CFOcountPOM.clickClosedDelayed().getText());	//Reading value of 'After Due Date'
			CFOcountPOM.clickClosedDelayed().click();								//CLicking on 'Not Completed' count
		
			Thread.sleep(3000);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());		//reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());	//reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());			//reading Low risk count.
			
			int total = critical + high + medium + low;
			/*
			if(ClosedTimelyValue == total)
			{
				test.log(LogStatus.PASS, "'Closed Timely' Compliance Count matches to sum of all risked compliances.");
				test.log(LogStatus.PASS, "Total 'Closed Timely' Compliances : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'Closed Timely' Compliance Count doesn't matches to sum of all risked compliances.");
				test.log(LogStatus.FAIL, "Total 'Closed Timely' Compliances : "+total+" | Total Sum : "+ClosedTimelyValue);
			}
			*/
			if(ClosedTimelyValue > 0)
			{
				if(critical >= 0)
				{
					ApprovalcountPOM.GraphCountPe1Sta( test, "Critical", critical, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Critical' Risk Compliance Count = "+critical);
				}
				
				if(high >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "High", high, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'High' Risk Compliance Count = "+high);
				}
				
				if(medium >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "Medium", medium, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Medium' Risk Compliance Count = "+medium);
				}
				
				if(low >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "Low", low, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Low' Risk Compliance Count = "+low);
				}
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
				Thread.sleep(500);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	 //Clicking on Back button
				getDriver().switchTo().parentFrame();
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();
				Thread.sleep(2000);
			}
			else
			{
				test.log(LogStatus.PASS, "'Closed Delayed' Compliance Count = "+ClosedTimelyValue);
			//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
				Thread.sleep(500);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	//Clicking on Dashboard
				Thread.sleep(500);
			}
			extent.endTest(test);
			extent.flush();
			
		}
		
		@Test(priority = 28)
		void ClosedTimely_PieChartPeriod() throws InterruptedException
		{
			test = extent.startTest("Period-Pie Chart -Completion Status- 'Closed Timely' Count Verification");
			
			Actions action = new Actions(getDriver());
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,2500)");						//Scrolling down window by 1000 px.
			Thread.sleep(800);
			WebDriverWait wait = new WebDriverWait( getDriver(), (30));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
			Thread.sleep(3000);
			AuditorcountPOM.DateText().click();	
			Thread.sleep(1000);
			AuditorcountPOM.DateYear().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Year().click();	
			Thread.sleep(3000);
			AuditorcountPOM.DateMonth().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Month().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Date().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Apply().click();	
			Thread.sleep(5000);
			
			
			Thread.sleep(1500);
			int ClosedTimelyValue = Integer.parseInt(CFOcountPOM.clickClosedTimely().getText());	//Reading value of 'After Due Date'
			CFOcountPOM.clickClosedTimely().click();								//CLicking on 'Not Completed' count
			
			Thread.sleep(4000);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());		//reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());	//reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());			//reading Low risk count.
			
			int total = critical + high + medium + low;
			/*
			if(ClosedTimelyValue == total)
			{
				test.log(LogStatus.PASS, "'Closed Timely' Compliance Count matches to sum of all risked compliances.");
				test.log(LogStatus.PASS, "Total 'Closed Timely' Compliances : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'Closed Timely' Compliance Count doesn't matches to sum of all risked compliances.");
				test.log(LogStatus.FAIL, "Total 'Closed Timely' Compliances : "+total+" | Total Sum : "+ClosedTimelyValue);
			}
			*/
			if(ClosedTimelyValue > 0)
			{
				if(critical >= 0)
				{
					ApprovalcountPOM.GraphCountPe1Sta( test, "Critical", critical, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Critical' Risk Compliance Count = "+critical);
				}
				
				if(high >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "High", high, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'High' Risk Compliance Count = "+high);
				}
				
				if(medium >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "Medium", medium, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Medium' Risk Compliance Count = "+medium);
				}
				
				if(low >=0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "Low", low, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Low' Risk Compliance Count = "+low);
				}
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
				Thread.sleep(500);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	 //Clicking on Back button
				getDriver().switchTo().parentFrame();
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();
				Thread.sleep(2000);
			}
			else
			{
				test.log(LogStatus.PASS, "'Closed Timely' Compliance Count = "+ClosedTimelyValue);
			//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
				Thread.sleep(2000);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	//Clicking on Dashboard
				getDriver().switchTo().parentFrame();
				Thread.sleep(2000);
			}
			extent.endTest(test);
			extent.flush();
			
		}
		
		@Test(priority = 29)
		void NotApplicable_PieChartPeriod() throws InterruptedException
		{
			test = extent.startTest("Period-Pie Chart -Completion Status- 'Not Applicable' Count Verification");
			
			Actions action = new Actions(getDriver());
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,2500)");						//Scrolling down window by 1000 px.
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait( getDriver(), (30));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
			Thread.sleep(3000);
			AuditorcountPOM.DateText().click();	
			Thread.sleep(1000);
			AuditorcountPOM.DateYear().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Year().click();	
			Thread.sleep(3000);
			AuditorcountPOM.DateMonth().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Month().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Date().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Apply().click();	
			Thread.sleep(5000);
			
			
			Thread.sleep(1500);
			int ClosedTimelyValue = Integer.parseInt(CFOcountPOM.clickNotApplicable().getText());	//Reading value of 'After Due Date'
			CFOcountPOM.clickNotApplicable().click();								//CLicking on 'Not Completed' count
			
			Thread.sleep(2000);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());		//reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());	//reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());			//reading Low risk count.
			
			int total = critical + high + medium + low;
			/*
			if(ClosedTimelyValue == total)
			{
				test.log(LogStatus.PASS, "'Not Applicable' Compliance Count matches to sum of all risked compliances.");
				test.log(LogStatus.PASS, "Total 'Not Applicable' Compliances : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'Not Applicable' Compliance Count doesn't matches to sum of all risked compliances.");
				test.log(LogStatus.FAIL, "Total 'Not Applicable' Compliances : "+total+" | Total Sum : "+ClosedTimelyValue);
			}
			*/
			if(ClosedTimelyValue > 0)
			{
				if(critical >= 0)
				{
					ApprovalcountPOM.GraphCountPe1Sta( test, "Critical", critical, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Critical' Risk Compliance Count = "+critical);
				}
				
				if(high >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "High", high, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'High' Risk Compliance Count = "+high);
				}
				
				if(medium >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "Medium", medium, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Medium' Risk Compliance Count = "+medium);
				}
				
				if(low >=0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "Low", low, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Low' Risk Compliance Count = "+low);
				}
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
				Thread.sleep(500);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	 //Clicking on Back button
				getDriver().switchTo().parentFrame();
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();
				Thread.sleep(2000);
			}
			else
			{
				test.log(LogStatus.PASS, "'Not Applicable' Compliance Count = "+ClosedTimelyValue);
			//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
				Thread.sleep(2000);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	//Clicking on Dashboard
				getDriver().switchTo().parentFrame();
				Thread.sleep(2000);
			}
			extent.endTest(test);
			extent.flush();
			
		}
		
		@Test(priority = 30)
		void Overdue_PieChartPeriod() throws InterruptedException
		{
			test = extent.startTest("Period-Pie Chart -Not Completed Status- 'Overdue' Count Verification");
		//	test.log(LogStatus.INFO, "Test Initiated");
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,2500)");						//Scrolling down window by 1000 px.
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait( getDriver(), (30));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
			Thread.sleep(3000);
			AuditorcountPOM.DateText().click();	
			Thread.sleep(1000);
			AuditorcountPOM.DateYear().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Year().click();	
			Thread.sleep(3000);
			AuditorcountPOM.DateMonth().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Month().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Date().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Apply().click();	
			Thread.sleep(5000);
			

			Thread.sleep(3000);
			int OverdueValue = Integer.parseInt(CFOcountPOM.clickOverdue().getText());	//Reading value of 'Not Completed'
			CFOcountPOM.clickOverdue().click();									//CLicking on 'Not Completed' count
			
			Thread.sleep(3000);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());			//Reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());		//Reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());				//Reading Low risk count.
			
			int total = critical + high + medium + low;
			/*
			if(OverdueValue == total)
			{
				test.log(LogStatus.PASS, "' Overdue' Compliance Count matches to sum of all risked compliances.");
				test.log(LogStatus.PASS, "Total Overdue' Compliances : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'Overdue' Compliance Count doesn't matches to sum of all risked compliances.");
				test.log(LogStatus.FAIL, "Total 'Overdue' Compliances : "+total+" | Total Sum : "+OverdueValue);
			}
		*/
			if(OverdueValue > 0)
			{
				if(critical >= 0)
				{
					ApprovalcountPOM.GraphCountPe( test, "Critical", critical, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Critical' Risk Compliance Count = "+critical);
				}
				
				if(high >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe( test, "High", high, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'High' Risk Compliance Count = "+high);
				}
				
				if(medium >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe( test, "Medium", medium, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Medium' Risk Compliance Count = "+medium);
				}
				
				if(low >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe( test, "Low", low, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Low' Risk Compliance Count = "+low);
				}
				
				//Thread.sleep(5000);
			   // action.moveToElement(CFOcountPOM.clickBack3()).click().build().perform();	 //Clicking on Back button
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
				Thread.sleep(3000);
			}
			else
			{
				test.log(LogStatus.PASS, " 'Overdue' Compliance Count = "+OverdueValue);
				
				Thread.sleep(500);
			//	action.moveToElement(CFOcountPOM.clickBack3()).click().build().perform();	//Clicking on Dashboard
				Thread.sleep(2000);
				getDriver().switchTo().parentFrame();
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
		
			}
			
			extent.endTest(test);
			extent.flush();
		}
			
		@Test(priority = 31)
		void pendingForReview_PieChartPeriod() throws InterruptedException
		{
			test = extent.startTest("Period-Pie Chart -Not Completed Status- 'Pending For Review' Count Verification");
		
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait( getDriver(), (40));
		/*	wait.until(ExpectedConditions.visibilityOf(ApprovalcountPOM.clickManagement()));

			ApprovalcountPOM.clickManagement().click();
			Thread.sleep(5000);
			Thread.sleep(500);
			Actions action = new Actions(getDriver());*/	
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,2500)");			//Scrolling down window by 1000 px.
			Thread.sleep(2000);
			
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
			Thread.sleep(3000);
			
			Thread.sleep(2000);
		                                                         	
			Thread.sleep(3000);
			AuditorcountPOM.DateText().click();	
			Thread.sleep(1000);
			AuditorcountPOM.DateYear().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Year().click();	
			Thread.sleep(3000);
			AuditorcountPOM.DateMonth().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Month().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Date().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Apply().click();	
			Thread.sleep(5000);
			int pendingForReviewValue = Integer.parseInt(CFOcountPOM.clickpendingForReview().getText());	//Reading value of 'Not Completed'
			CFOcountPOM.clickpendingForReview().click();									//CLicking on 'Not Completed' count
			
			Thread.sleep(3000);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());			//Reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());		//Reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());				//Reading Low risk count.
			
			int total = critical + high + medium + low;
			/*
			if(pendingForReviewValue == total)
			{
				test.log(LogStatus.PASS, "' Pending For Review' Compliance Count matches to sum of all risked compliances.");
				test.log(LogStatus.PASS, "Total Overdue' Compliances : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'Pending For Review' Compliance Count doesn't matches to sum of all risked compliances.");
				test.log(LogStatus.FAIL, "Total 'Overdue' Compliances : "+total+" | Total Sum : "+pendingForReviewValue);
			}
		*/
			if(pendingForReviewValue > 0)
			{
				if(critical >= 0)
				{
					ApprovalcountPOM.GraphCountPe1Sta( test, "Critical", critical, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Critical' Risk Compliance Count = "+critical);
				}
				
				if(high >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "High", high, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'High' Risk Compliance Count = "+high);
				}
				
				if(medium >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "Medium", medium, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Medium' Risk Compliance Count = "+medium);
				}
				
				if(low >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "Low", low, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Low' Risk Compliance Count = "+low);
				}
				
				//Thread.sleep(5000);
			//	action.moveToElement(CFOcountPOM.clickBack2()).click().build().perform();	 //Clicking on Back button
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
				Thread.sleep(2000);
			}
			else
			{
				test.log(LogStatus.PASS, " 'Pending For Review' Compliance Count = "+pendingForReviewValue);
				
				Thread.sleep(500);
			//	action.moveToElement(CFOcountPOM.clickBack2()).click().build().perform();	//Clicking on Dashboard
				Thread.sleep(2000);
				getDriver().switchTo().parentFrame();
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
				Thread.sleep(2000);
			}
			
			extent.endTest(test);
			extent.flush();
		}
		
	    @Test(priority = 32)
		void inProgress_PieChartPeriod() throws InterruptedException
		{
			test = extent.startTest("Period-Pie Chart -Not Completed Status- 'in Progress' Count Verification");
			
			Actions action = new Actions(getDriver());
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,2500)");						//Scrolling down window by 1000 px.
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait( getDriver(), (30));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
			Thread.sleep(3000);
			AuditorcountPOM.DateText().click();	
			Thread.sleep(1000);
			AuditorcountPOM.DateYear().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Year().click();	
			Thread.sleep(3000);
			AuditorcountPOM.DateMonth().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Month().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Date().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Apply().click();	
			Thread.sleep(5000);
			
			
			Thread.sleep(1500);
			int ClosedTimelyValue = Integer.parseInt(CFOcountPOM.clickinProgress().getText());	//Reading value of 'After Due Date'
			CFOcountPOM.clickinProgress().click();								//CLicking on 'Not Completed' count
			
			Thread.sleep(2000);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());		//reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());	//reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());			//reading Low risk count.
			
			int total = critical + high + medium + low;
			/*
			if(ClosedTimelyValue == total)
			{
				test.log(LogStatus.PASS, "'in Progress' Compliance Count matches to sum of all risked compliances.");
				test.log(LogStatus.PASS, "Total 'in Progress' Compliances : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'in Progress' Compliance Count doesn't matches to sum of all risked compliances.");
				test.log(LogStatus.FAIL, "Total 'in Progress' Compliances : "+total+" | Total Sum : "+ClosedTimelyValue);
			}
			*/
			if(ClosedTimelyValue > 0)
			{
				if(critical >= 0)
				{
					ApprovalcountPOM.GraphCountPe1Sta( test, "Critical", critical, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Critical' Risk Compliance Count = "+critical);
				}
				
				if(high >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "High", high, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'High' Risk Compliance Count = "+high);
				}
				
				if(medium >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "Medium", medium, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Medium' Risk Compliance Count = "+medium);
				}
				
				if(low >=0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "Low", low, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Low' Risk Compliance Count = "+low);
				}
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
				Thread.sleep(500);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	 //Clicking on Back button
				getDriver().switchTo().parentFrame();
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();
				Thread.sleep(2000);
			}
			else
			{
				test.log(LogStatus.PASS, "'in Progress' Compliance Count = "+ClosedTimelyValue);
			//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
				Thread.sleep(2000);
				action.moveToElement(CFOcountPOM.clickBack1()).click().build().perform();	//Clicking on Dashboard
				getDriver().switchTo().parentFrame();
				Thread.sleep(2000);
			}
			extent.endTest(test);
			extent.flush();
			
		}
		
		@Test(priority = 33)
		void Upcoming_PieChartPeriod() throws InterruptedException
		{
			test = extent.startTest("Period-Pie Chart -Not Completed Status- ' Upcoming' Count Verification");
		
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,2500)");			//Scrolling down window by 1000 px.
			Thread.sleep(800);
			WebDriverWait wait = new WebDriverWait( getDriver(), (30));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
			
			Thread.sleep(4000);
			AuditorcountPOM.DateText().click();	
			Thread.sleep(1000);
			AuditorcountPOM.DateYear().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Year().click();	
			Thread.sleep(3000);
			AuditorcountPOM.DateMonth().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Month().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Date().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Apply().click();	
			Thread.sleep(5000);
			
			Thread.sleep(4000);
			WebElement roc= getDriver().findElement(By.xpath("(//*[@class='highcharts-legend-item highcharts-pie-series highcharts-color-4 '])"));
		
		String text =	roc.getText();
		
		if(text.equalsIgnoreCase("Upcoming")) {
			test.log(LogStatus.PASS, "The status named \"upcoming\" should reflects separately in the graph of the performance summary (not completed compliance summary) due for a period.");

		}else {
			test.log(LogStatus.FAIL, "The status named \"upcoming\" not reflects separately in the graph of the performance summary (not completed compliance summary) due for a period.");

		}
			
			int rejectedValue = Integer.parseInt(CFOcountPOM.clickUpcomingPe().getText());	//Reading value of 'Not Completed'
			CFOcountPOM.clickUpcomingPe().click();									//CLicking on 'Not Completed' count
			
			Thread.sleep(3000);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());			//Reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());		//Reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());				//Reading Low risk count.
			
			int total = critical + high + medium + low;
			/*
			if(rejectedValue == total)
			{
				test.log(LogStatus.PASS, "' Rejected' Compliance Count matches to sum of all risked compliances.");
				test.log(LogStatus.PASS, "Total Overdue' Compliances : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'Rejected' Compliance Count doesn't matches to sum of all risked compliances.");
				test.log(LogStatus.FAIL, "Total 'Overdue' Compliances : "+total+" | Total Sum : "+rejectedValue);
			}
		*/
			if(rejectedValue > 0)
			{
				if(critical >= 0)
				{
					CFOcountPOM.GraphCountInPeUp( test, "Critical", critical, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Critical' Risk Compliance Count = "+critical);
				}
				
				if(high >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(500);
					CFOcountPOM.GraphCountInPeUp( test, "High", high, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'High' Risk Compliance Count = "+high);
				}
				
				if(medium >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(500);
					CFOcountPOM.GraphCountInPeUp( test, "Medium", medium, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Medium' Risk Compliance Count = "+medium);
				}
				
				if(low >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(500);
					CFOcountPOM.GraphCountInPeUp( test, "Low", low, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Low' Risk Compliance Count = "+low);
				}
				
				//Thread.sleep(5000);
			//	action.moveToElement(CFOcountPOM.clickBack2()).click().build().perform();	 //Clicking on Back button
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
				Thread.sleep(3000);
			}
			else
			{
				test.log(LogStatus.PASS, " 'Rejected' Compliance Count = "+rejectedValue);
				Thread.sleep(2000);
				getDriver().switchTo().parentFrame();
				Thread.sleep(2000);
				Thread.sleep(500);
			//	action.moveToElement(CFOcountPOM.clickBack2()).click().build().perform();	//Clicking on Dashboard
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
				Thread.sleep(2000);
			}
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 34)
		void rejected_PieChartPeriod() throws InterruptedException
		{
			test = extent.startTest("Period-Pie Chart -Not Completed Status- 'Rejected' Count Verification");
		
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait( getDriver(), (40));
		/*	wait.until(ExpectedConditions.visibilityOf(ApprovalcountPOM.clickManagement()));

			ApprovalcountPOM.clickManagement().click();
			Thread.sleep(5000);
			Thread.sleep(500);
			Actions action = new Actions(getDriver());*/	
			JavascriptExecutor js = (JavascriptExecutor) getDriver() ;
			js.executeScript("window.scrollBy(0,2500)");			//Scrolling down window by 1000 px.
			Thread.sleep(2000);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
			Thread.sleep(3000);
			
			AuditorcountPOM.DateText().click();	
			Thread.sleep(1000);
			AuditorcountPOM.DateYear().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Year().click();	
			Thread.sleep(3000);
			AuditorcountPOM.DateMonth().click();	
			Thread.sleep(1000);
			AuditorcountPOM.Month().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Date().click();	
			Thread.sleep(3000);
			AuditorcountPOM.Apply().click();	
			Thread.sleep(5000);
			int pendingForReviewValue = Integer.parseInt(CFOcountPOM.clickRejectedPe11().getText());	//Reading value of 'Not Completed'
			CFOcountPOM.clickRejectedPe11().click();									//CLicking on 'Not Completed' count
			
			Thread.sleep(4000);
			int critical = Integer.parseInt(CFOcountPOM.readCritical().getText());	//Reading Critical risk count.
			int high = Integer.parseInt(CFOcountPOM.readHigh().getText());			//Reading High risk count.
			int medium = Integer.parseInt(CFOcountPOM.readMedium().getText());		//Reading Medium risk count.
			int low = Integer.parseInt(CFOcountPOM.readLow().getText());				//Reading Low risk count.
			
			int total = critical + high + medium + low;
			/*
			if(pendingForReviewValue == total)
			{
				test.log(LogStatus.PASS, "' Rejected' Compliance Count matches to sum of all risked compliances.");
				test.log(LogStatus.PASS, "Total Overdue' Compliances : "+total);
			}
			else
			{
				test.log(LogStatus.FAIL, "'Rejected' Compliance Count doesn't matches to sum of all risked compliances.");
				test.log(LogStatus.FAIL, "Total 'Overdue' Compliances : "+total+" | Total Sum : "+pendingForReviewValue);
			}
		*/
			if(pendingForReviewValue > 0)
			{
				if(critical >= 0)
				{
					ApprovalcountPOM.GraphCountPe1Sta( test, "Critical", critical, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Critical' Risk Compliance Count = "+critical);
				}
				
				if(high >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "High", high, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'High' Risk Compliance Count = "+high);
				}
				
				if(medium >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "Medium", medium, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Medium' Risk Compliance Count = "+medium);
				}
				
				if(low >= 0)
				{
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IFNewPeriodGraphCompliance"));                                                            	
					Thread.sleep(3000);
					ApprovalcountPOM.GraphCountPe1Sta( test, "Low", low, "Statutory");
				}
				else
				{
					test.log(LogStatus.PASS, "'Low' Risk Compliance Count = "+low);
				}
				
				//Thread.sleep(5000);
			//	action.moveToElement(CFOcountPOM.clickBack2()).click().build().perform();	 //Clicking on Back button
				Thread.sleep(2000);
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
		
			}
			else
			{
				test.log(LogStatus.PASS, " 'Rejected' Compliance Count = "+pendingForReviewValue);
				
				Thread.sleep(500);
			//	action.moveToElement(CFOcountPOM.clickBack2()).click().build().perform();	//Clicking on Dashboard
				Thread.sleep(2000);
				getDriver().switchTo().parentFrame();
				performer.OverduePOM.clickDashboard().click();			//Clicking on Dashboard
				Thread.sleep(2000);
			}
			
			extent.endTest(test);
			extent.flush();
		}
		
	
		
		
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
		closeBrowser();
  		
  		//Thread.sleep(1000);
  	//	getDriver().close();
  	}	       
  		       		
  	@AfterTest
  	void Closing() throws InterruptedException
  	{
  		
  	}	 
	

}
