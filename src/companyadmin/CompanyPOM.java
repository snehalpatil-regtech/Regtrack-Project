package companyadmin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import login.BasePage;

public class CompanyPOM extends BasePage {
	

	private static WebElement admin = null;				//WebElement variable created for 'Categories' click
					
	private static List<WebElement> adminList = null;		
	
	public static WebElement clickAdmin()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='leftApprovermenu']"));
		return admin;
	}
	
	public static WebElement clickReport()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[2]/a"));
		return admin;
	}
	
	public static WebElement SelectLocationSA()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tbxFilterLocation']"));
		return admin;
	}
	
	public static WebElement Expand()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvFilterLocationn1']/img"));
		return admin;
	}
	
	public static WebElement  DPvtLtdAS()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvFilterLocationt2']"));
		return admin;
	}

	public static WebElement clickStatutoryAssi()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[1]/a"));
		return admin;
	}
	
	public static WebElement clickCheckListAssi()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[2]/a"));
		return admin;
	}
	
	public static WebElement clickEventBasedAssi()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[3]/a"));
		return admin;
	}
	
	public static WebElement clickInternalAssi()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[4]/a"));
		return admin;
	}
	
	public static WebElement clickInternalCheckListAssi()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[5]/a"));
		return admin;
	}
	
	public static WebElement clickStatutoryLabelReport()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[6]/a"));
		return admin;
	}
	
	public static WebElement clickInternalLabelReport()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[7]/a"));
		return admin;
	}
	
	public static WebElement clickAllReport()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:3']/li[8]/a"));
		return admin;
	}
	
	public static WebElement clickExport()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_lbtnExportExcel']/img"));
		return admin;
	}
	
	public static WebElement clickExport1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_lbtnExportExcel1']/img"));
		return admin;
	}
	
	public static WebElement ManageEvents()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[6]"));
		return admin;
	}
	
	public static WebElement EventAssignments()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:89']/li[3]"));
		return admin;
	}
	
	public static WebElement SelectLocation()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tbxFilterLocation']"));
		return admin;
	}
	
	public static WebElement  DPvtLtd()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvFilterLocationt2']"));
		return admin;
	}
	
	public static WebElement  ExporttoExcel()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnExport']/img"));
		return admin;
	}
	
	public static WebElement  SelectOwner()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_divFilterUsers']/span/a/span[1]"));
		return admin;
	}
	
	public static WebElement  abclawyer()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='ui-id-14']/li[3]"));
		return admin;
	}
	
	public static WebElement  Eventassignmentexportimport()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:89']/li[5]/a"));
		return admin;
	}//*[@id="CMPMenuBar:submenu:89"]/li[6]/a
	
	public static WebElement  Event()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tbEvent']"));
		return admin;
	}
	
	public static WebElement  SelectEntity()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_txtEntity']"));
		return admin;
	}
	
	public static WebElement FPvtLTd()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_rptEntity_chkEntity_2']"));
		return admin;
	}
	
	public static WebElement BITAConsultingPune()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_rptEntity_chkEntity_0']"));
		return admin;
	}
	
	public static WebElement  SelectEntityok()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_rptEntity_btnRepeater']"));
		return admin;
	}
	
	public static WebElement  Location()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tbxBranch']"));
		return admin;
	}
	
	public static WebElement  LocationExpand()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvBranchesn0']/img"));
		return admin;
	}
	
	
	public static WebElement  ExpandFPvtLTd()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvBranchesn1']/img"));
		return admin;
	}
	
	public static WebElement  MPvtLtd()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvBranchesn0CheckBox']"));
		return admin;
	}
	
	public static WebElement  BITAConsultingKarnataka()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvBranchesn1CheckBox']"));
		return admin;
	}
	
	public static WebElement  Select()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnselect']"));
		return admin;
	}
	
	public static WebElement  Download()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_BtnDownloadEvent']"));
		return admin;
	}
	
	public static WebElement  Import()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_Imp']"));
		return admin;
	}
	
	public static WebElement  ChooseFile()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_MasterFileUpload']"));
		return admin;
	}
	
	
	public static WebElement  Upload()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnEventUploadFile']"));
		return admin;
	}
	
	public static WebElement  BlankMsg()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_ValidationSummary1']/ul/li"));
		return admin;
	}
	
	public static WebElement  InvalidMsg()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_ValidationSummary1']/ul/li/ol"));
		return admin;
	}
	
	public static WebElement  UploadLink()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdEventUpData_lnkDownload_0']"));
		return admin;
	}
	
	public static WebElement  EventCompliance()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tbEventCompliance']"));
		return admin;
	}
	
	public static WebElement  ImportEC()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_EventCompImp']"));
		return admin;
	}
	
	public static WebElement  UploadLinkEC()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdCompExData_lnkDownload_0']"));
		return admin;
	}
	
	public static WebElement  UploadLinkEC1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdEventCompUpData_lnkECDownload_0']"));
		return admin;
	}

	public static WebElement  DownloadEC()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdCompExData_lnkCompDownload_0']"));
		return admin;
	}

	public static WebElement  UploadEC()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnEventComplianceUpload']"));
		return admin;                       
	}

	public static WebElement  ChooseFileEC()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_FUEventCompliance']"));
		return admin;
	}

	public static WebElement  ValidationMsg()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_ValidationSummaryECI']/ul/li"));
		return admin;
	}

	
	public static WebElement  InValidationMsg()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_ValidationSummaryECI']/ul/li/ol"));
		return admin;                        
	}

	
	public static WebElement  ManageUsers()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[3]"));
		return admin;
	}

	public static WebElement  Department()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:15']/li[1]/a"));
		return admin;
	}

	
	public static WebElement  AddNew()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnAddUser']"));
		return admin;
	}

	public static WebElement  DepartmentName()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_txtFName']"));
		return admin;
	}

	public static WebElement  SaveDept()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnSave']"));
		return admin;
	}
	
	public static WebElement  SaveDeptMsg()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_ctl03']/ul/li"));
		return admin;
	}
	
	public static WebElement  CloseDept()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_Button2']"));
		return admin;
	}
	
	public static WebElement  DepartFilter()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tbxFilter']"));
		return admin;
	}
	
	public static WebElement  DepartEdit()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdAuditor_LinkButton1_0']/img"));
		return admin;
	}
	
	public static WebElement  DepartDelete()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdAuditor_LinkButton2_0']/img"));
		return admin;
	}
	
	public static WebElement  User()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:15']/li[2]/a"));
		return admin;                       
	}
	
	public static WebElement  AddNewUser()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnAddUser']"));
		return admin;
	}
	
	public static WebElement  UsersEmail()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_udcInputForm_tbxEmail']"));
		return admin;
	}
	
	public static WebElement  UsersFirstName()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_udcInputForm_tbxFirstName']"));
		return admin;
	}
	
	public static WebElement  UsersLastName()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_udcInputForm_tbxLastName']"));
		return admin;
	}
	
	public static WebElement  UsersDesignation()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_udcInputForm_tbxDesignation']"));
		return admin;
	}
	
	public static WebElement  UsersMobileNo()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_udcInputForm_tbxContactNo']"));
		return admin;
	}
	
	public static WebElement  UsersDepartment()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_udcInputForm_txtDepartment']"));
		return admin;
	}
	
	public static WebElement  DepartmentTech()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_udcInputForm_rptDepartment_chkDepartment_0']"));
		return admin;
	}
	
	public static WebElement  DepartmentTechOk()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_udcInputForm_rptDepartment_btnRepeater']"));
		return admin;
	}
	
	public static WebElement  UserComplianceRole()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_udcInputForm_ddlRole']"));
		return admin;
	}
	
	
	public static WebElement  UserCompanyAdmin()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_udcInputForm_ddlRole']/option[3]"));
		return admin;
	}
	
	public static WebElement  SelectHrRole()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_udcInputForm_ddlHRRole']"));
		return admin;
	}
	
	public static WebElement  HR()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_udcInputForm_ddlHRRole']/option[3]"));
		return admin;
	}
	
	public static WebElement  SecurityGroup()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_udcInputForm_rptUserGroup']"));
		return admin;
	}
	
	public static WebElement  avantisGroup()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_udcInputForm_rptUserGroup']/option[2]"));
		return admin;
	}
	
	
	public static WebElement  UserSave()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_udcInputForm_btnSave']"));
		return admin;
	}
	
	public static WebElement  ExportUser()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnExport']/img"));
		return admin;
	}
	
	public static WebElement  ExportIC()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnDownload']/img"));
		return admin;
	}
	
	public static WebElement  UserEdit()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdUser_lbtnEdit_0']/img"));
		return admin;
	}
	
	public static WebElement  ResetPass()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdUser_lbtnReset_0']/img"));
		return admin;
	}
	
	public static WebElement  BlockScheduleStatutory()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:15']/li[8]/a"));
		return admin;
	}
	
	
	public static WebElement  ComplianceCategory()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_upComplianceTypeList']/center/table/tbody/tr[2]/td[2]/span[1]/a/span[1]"));
		return admin;
	}
	
	public static WebElement  ClientSpecific()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.linkText("Client Specific"));
		return admin;
	}
	
	public static WebElement   Category28May2021()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.linkText("Category 28 May 2021"));
		return admin;
	}
	
	
	public static WebElement  Description()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.id("BodyContent_tbxdescription"));
		return admin;
	}
	
	public static WebElement  BlockDate()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tbxStartDate']"));
		return admin;
	}
	
	public static WebElement  Date14()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.linkText("14"));
		return admin;
	}
	
	public static WebElement  BlockCheckBox()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdComplianceRoleMatrix_chkActivate_0']"));
		return admin;
	}
	
	public static WebElement  keep()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_Button1']"));
		return admin;
	}
	
	public static WebElement  BlockDelete()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_Button2']"));
		return admin;
	}
	
	public static WebElement  BlockScheduleInternal()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:15']/li[9]/a"));
		return admin;
	}
	
	
	public static WebElement ModifyAssignmentsLink()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdUser_lbtnModifyAssignment_0']"));
		return admin;
	}
	
	public static WebElement DepartmentDropdown()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_upModifyAssignment']/div[1]/table/tbody/tr[8]/td[4]/span/input"));
		return admin;
	}
	
	public static WebElement ModifyAssignmentsClose()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_Button2']"));
		return admin;
	}
	
	public static WebElement ModifyAssignments()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:15']/li[4]/a"));
		return admin;
	}
	
	public static WebElement DepartmentDropdownMA()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_upModifyAssignment']/div[1]/table/tbody/tr[6]/td[4]/span/input"));
		return admin;
	}
	
	public static WebElement performera()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.linkText("performer a"));
		return admin;
	}
	
	public static WebElement reviewerb()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.linkText("reviewer b"));
		return admin;
	}
	
	public static WebElement Sonalipatil()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.linkText("Sonali patil"));
		return admin;
	}
	
	public static WebElement ManageCompliances()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[4]/a"));
		return admin;
	}
	
	public static WebElement MastersMC()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[1]/a"));
		return admin;
	}
	
	public static WebElement MastersGC()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:26']/li[1]/a"));
		return admin;
	}
	
	public static WebElement Compliances()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:28']/li[1]/a"));
		return admin;
	}
	
	public static WebElement ComplianceCategories()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:28']/li[3]/a"));
		return admin;
	}
	
	public static WebElement ComplianceType()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:28']/li[4]/a"));
		return admin;
	}
	
	
	public static WebElement Acts()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:28']/li[2]/a"));
		return admin;
	}
	
	public static WebElement ActsFilter()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_txtactList']"));
		return admin;
	}
	
	public static WebElement ActsCkeck1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_rptActList_chkAct_0']"));
		return admin;
	}
	
	public static WebElement ActsCkeck2()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_rptActList_chkAct_1']"));
		return admin;
	}
	
	public static WebElement ok()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_rptActList_btnRepeater']"));
		return admin;
	}
	
	public static WebElement InternalCompliances()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[5]"));
		return admin;
	}
	
	public static WebElement EditCompliances()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:70']/li[15]/a"));
		return admin;
	}
	
	public static WebElement EditIcon()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdCompliances_lbtEdit_0']/img"));
		return admin;
	}
	
	public static WebElement DetailedDescription()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_txtdetaileddescription1']"));
		return admin;
	}
	
	public static WebElement EventBasedchk()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_chkEvent1']"));
		return admin;
	}
	
	public static WebElement ComplianceDocumentMandatorychk()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_chkComplianceDocumentMandatory1']"));
		return admin;
	}
	
	public static WebElement GroupingMaster()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:27']/li[6]/a"));
		return admin;
	}
	
	public static WebElement GroupMaster()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:33']/li[1]/a"));
		return admin;
	}
	
	public static WebElement ComplianceTagging()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:33']/li[2]/a"));
		return admin;
	}
	
	public static WebElement AddNewGM()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnAddUser']"));
		return admin;
	}
	
	public static WebElement AddNewGMClose()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_Button2']"));
		return admin;
	}
	
	public static WebElement AddNewSave()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnSave']"));
		return admin;
	}
	
	public static WebElement AddNewSaveMsg()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_ctl03']/ul/li"));
		return admin;
	}
	
	public static WebElement GroupName()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_txtFName']"));
		return admin;
	}
	
	public static WebElement Filter()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tbxFilter']"));
		return admin;
	}
	
	public static WebElement Edit()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdAuditor_LinkButton1_0']/img"));
		return admin;
	}
	
	public static WebElement Delete()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdAuditor_LinkButton2_0']/img"));
		return admin;
	}
	
	public static WebElement DeleteMsg()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_ctl01']/ul/li"));
		return admin;
	}
	
	public static WebElement AddNewCT()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnAddGrouping']"));
		return admin;
	}
	
	public static WebElement AddNewCTClose()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnCancel']"));
		return admin;
	}
	
	public static WebElement IPAddress()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:15']/li[6]/a"));
		return admin;
	}
	
	public static WebElement IPAddressAN()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnAddUser']"));
		return admin;
	}
	
	public static WebElement LocationIP()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_txtIPName']"));
		return admin;
	}
	
	public static WebElement IPAddressText()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_txtIPAddress']"));
		return admin;
	}
	
	public static WebElement Remark()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_txtremark']"));
		return admin;
	}
	
	public static WebElement Save()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnSave']"));
		return admin;
	}
	
	public static WebElement SaveMsg()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_vsLicenseListPage']/ul/li"));
		return admin;
	}
	
	public static WebElement SaveMsg1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_vsLicenseListPage']/ul"));
		return admin;
	}
	
	
	public static WebElement CloseBtn()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnClose']"));
		return admin;
	}
	
	public static WebElement FilterIP()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tbxFilter']"));
		return admin;
	}
	
	public static WebElement IPAddressTextF()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdIPAddress']/tbody/tr[2]/td[3]"));
		return admin;
	}
	
	public static WebElement ChooseFileIp()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_MasterFileUpload']"));
		return admin;
	}
	
	public static WebElement UploadIp()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnUploadFile']"));
		return admin;
	}
	
	public static WebElement UploadIpMSg()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_cvDuplicateEntry']"));
		return admin;
	}
	
	public static WebElement UploadMSgCR()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_ValidationSummary1']"));
		return admin;
	}
	
	public static WebElement UploadMSg()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_ctl00']"));
		return admin;
	}
	
	public static WebElement SampleFormat()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_UpIpAddress']/table/tbody/tr/td[4]/u/a"));
		return admin;
	}
	
	public static WebElement CheckBoxAll()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdIPAddress_chkIPDataHeader']"));
		return admin;
	}
	
	public static WebElement DeleteBtn()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnGridDelete']"));
		return admin;
	}
	
	public static WebElement EditBtn()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdIPAddress_LinkButton1_0']/img"));
		return admin;
	}
	
	public static WebElement DeleteIp()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdIPAddress_LinkButton2_0']/img"));
		return admin;
	}
	
	public static WebElement Export()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_lbtnExportExcel']/img"));
		return admin;
	}
	
	public static WebElement  SecurityGroupMU()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:15']/li[7]/a"));
		return admin;
	}
	
	public static WebElement  SecurityGroupAddNew()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnAddUser']"));
		return admin;
	}
	
	public static WebElement  SecurityGroupText()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_txtName']"));
		return admin;
	}
	
	public static WebElement  LocationSG()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_txtDepartment']"));
		return admin;
	}
	
	public static WebElement  LocationAll()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_rptDepartment_DepartmentSelectAll']"));
		return admin;
	}
	
	public static WebElement  LocationOk()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_rptDepartment_btnRepeater']"));
		return admin;
	}
	
	public static WebElement  SaveSG()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnSave']"));
		return admin;
	}
	
	public static WebElement  SaveMsgSG()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_vsLicenseListPage']/ul/li"));
		return admin;
	}
	
	public static WebElement  SaveMsgSG1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_vsLicenseListPage']/ul"));
		return admin;
	}
	
	public static WebElement  CloseSG()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_Button2']"));
		return admin;
	}
	
	public static WebElement  FilterSG()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tbxFilter']"));
		return admin;
	}
	
	public static WebElement  EditSG()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_gridview_LinkButton1_0']/img"));
		return admin;
	}
	
	public static WebElement  DeleteSG()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_gridview_LinkButton2_0']/img"));
		return admin;
	}
	
	public static WebElement  RemarkSg()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_txtremark']"));
		return admin;
	}
	
	public static WebElement  ExpandSR()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvFilterLocationn2']/img"));
		return admin;
	}
	
	public static WebElement  ExpandSR1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvFilterLocationn3']/img"));
		return admin;
	}
	
	public static WebElement  Check()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvFilterLocationn4CheckBox']"));
		return admin;
	}
	
	public static WebElement  Check1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvFilterLocationn2CheckBox']"));
		return admin;
	}
	
	public static WebElement WidgetMaster()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:28']/li[5]/a"));
		return admin;                              
	}
	
	public static WebElement WidgetMasterSF()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_upWidgetList']/table/tbody/tr/td[8]/u/a"));
		return admin;                              
	}
	
	public static WebElement ChooseFileSF()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_fnuploadwidget']"));
		return admin;
	}
	
	public static WebElement UploadWM()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnUpload']"));
		return admin;
	}
	
	public static WebElement ComplianceAssignment()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:20']/li[2]/a"));
		return admin;
	}
	
	public static WebElement ChecklistAssignment()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:20']/li[3]/a"));
		return admin;
	}
	
	public static WebElement AssignCheckList()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:34']/li[1]/a"));
		return admin;
	}
	
	public static WebElement IntermediateCheckList()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:34']/li[2]/a"));
		return admin;
	}
	
	public static WebElement ActivateCheckList()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:34']/li[3]/a"));
		return admin;
	}
	
	
	public static WebElement ComplianceAssignment1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[1]/a"));
		return admin;
	}
	
	public static WebElement IntermediateAssignment()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[2]/a"));
		return admin;
	}
	
	public static WebElement ActivateAssignment()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:35']/li[3]/a"));
		return admin;
	}
	
	public static WebElement SaveMsgCMC()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_ValidationSummary1']/ul"));
		return admin;
	}
	
	public static WebElement ComplianceMappingCopy()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:28']/li[4]/a"));
		return admin;
	}
	
	public static WebElement CMLocation()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tbxFilterMappedLocation']"));
		return admin;
	}
	
	public static WebElement CMLocationEx()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvMappedLocationn0']/img"));
		return admin;
	}
	
	public static WebElement CMLocation1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvMappedLocationt1']"));
		return admin;
	}
	
	public static WebElement SelectPerformer()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_upComplianceTypeList']/center/table/tbody/tr[2]/td[2]/span[1]/a/span[1]"));
		return admin;
	}
	
	public static WebElement SelectPerformer1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.linkText("abc External"));
		return admin;
	}
	
	public static WebElement SelectReviewer()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_upComplianceTypeList']/center/table/tbody/tr[2]/td[4]/span[1]/a"));
		return admin;
	}
	
	public static WebElement SelectReviewer1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.linkText("abc lawyer"));
		return admin;
	}
	
	public static WebElement SelectMappingLocation()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tbxFilterMappingLocation']"));
		return admin;
	}
	
	public static WebElement SelectMappingLocationEx()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvMappingLocationn0']/img"));
		return admin;
	}
	
	public static WebElement ChangeRiskofCompliance()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:39']/li[2]/a"));
		return admin;
	}
	
	public static WebElement ClientFrequencyMapping()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:39']/li[4]/a"));
		return admin;
	}
	
	public static WebElement Targetdate()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:39']/li[5]/a"));
		return admin;
	}
	
	
	public static WebElement ChangeRiskofComplianceCF()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_MasterFileUpload']"));
		return admin;
	}
	
	
	public static WebElement SelectMappingLocation1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvMappingLocationt1']"));
		return admin;
	}
	
	public static WebElement CheckBox()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdComplianceRoleMatrix_chkAssign_0']"));
		return admin;
	}
	
	public static WebElement Configuration()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:20']/li[4]/a"));
		return admin;
	}
	
	public static WebElement ReOpeningofCompliance()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:39']/li[1]/a"));
		return admin;
	}
	
	public static WebElement DocumentNotApplicable()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:39']/li[7]/a"));
		return admin;
	}
	
	public static WebElement EntitiesAssignmentsMC()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:20']/li[5]/a"));
		return admin;
	}
	
	public static WebElement EntitiesAssignmentsMC1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:49']/li[1]/a"));
		return admin;
	}
	
	public static WebElement LicenseEntitiesAssignments1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:49']/li[3]/a"));
		return admin;
	}
	
	public static WebElement DepartmentEntitiesAssignmentsMC()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:49']/li[2]/a"));
		return admin;
	}
	
	public static WebElement DepartmentMC()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_txtDepartment']"));
		return admin;
	}
	
	public static WebElement DepartmentcheckAll()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_rptDepartment_DepartmentSelectAll']"));
		return admin;
	}
	
	public static WebElement Departmentcheck1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_rptDepartment_chkDepartment_0']"));
		return admin;
	}
	
	public static WebElement DepartmentMC1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_txtDepartment1']"));
		return admin;
	}
	
	public static WebElement DepartmentcheckAll1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_rptDepartment1_DepartmentSelectAll1']"));
		return admin;
	}
	
	public static WebElement Departmentcheck11()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_rptDepartment1_chkDepartment1_0']"));
		return admin;
	}
	
	public static WebElement DeleteLocation()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tbxDelBranch']"));
		return admin;
	}
	
	public static WebElement DeleteExpand()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvdelBranchesn0']/img"));
		return admin;
	}
	
	public static WebElement DeleteExpand1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvdelBranchesn1CheckBox']"));
		return admin;
	}
	
	public static WebElement ClickEdit()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdCompliances_LinkButton1_0']/img"));
		return admin;
	}
	
	public static WebElement SelectLoct()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnlocation']"));
		return admin;
	}
	
	public static WebElement DocumentDate()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tbxdocumentDate']"));
		return admin;
	}
	
	public static WebElement DocumentDate1()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.linkText("2"));
		return admin;
	}
	
	public static WebElement SaveDNA()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_btnSave']"));
		return admin;
	}
	public static WebElement clickInternalCompliance()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar']/ul/li[5]/a"));
		return admin;
	}
	public static WebElement clickAssignCompliance()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='CMPMenuBar:submenu:63']/li[6]/a"));
		return admin;
	}
	public static WebElement clickLocation()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tbxFilterLocation']"));
		return admin;
	}
	public static WebElement clickLocationExpand()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvFilterLocationn0']/img"));
		return admin;
	}
	public static WebElement selectLocation()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_tvFilterLocationt2']"));
		return admin;
	}
	public static WebElement clickPerformer()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_upComplianceTypeList']/center/table/tbody/tr[2]/td[2]/span[1]/a/span[1]"));
		return admin;
	}
	public static WebElement selectPerformer()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.linkText("Amol Patil"));
		return admin;
	}
	public static WebElement clickReviewer()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_upComplianceTypeList']/center/table/tbody/tr[2]/td[4]/span[1]/a/span[1]"));
		return admin;
	}
	public static WebElement selectReviewer()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.linkText("Amit shaha"));
		return admin;
	}
	public static WebElement clickCategory()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_upComplianceTypeList']/center/table/tbody/tr[3]/td[2]/span[1]/a/span[1]"));
		return admin;
	}
	public static WebElement selectCategory()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.linkText("Category 28 May 2021"));
		return admin;
	}
	public static WebElement selectCheckbox()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_grdComplianceRoleMatrix_chkAssign_0']"));
		return admin;
	}
	public static WebElement clickSaveBtn()		//Method for closing Message Popup
	{
		admin = getDriver().findElement(By.xpath("//*[@id='BodyContent_Button1']"));
		return admin;
	}
	
	
	
}
