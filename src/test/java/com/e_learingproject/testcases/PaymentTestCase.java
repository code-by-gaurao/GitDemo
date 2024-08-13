package com.e_learingproject.testcases;

import org.testng.annotations.Test;

import com.e_learingproject.pages.BaseTest;
import com.e_learingproject.pages.DashBoardPage;
import com.e_learingproject.pages.LoginPage;
import com.e_learingproject.pages.PaymentPage;
import com.e_learingproject.utility.ReadExcelFile;

public class PaymentTestCase extends BaseTest {

	
String fileName=System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";
	
	@Test(priority =1)
	void testcourses()
	{
		LoginPage lp=new LoginPage(driver);
		String username=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginToPortal(username, password);
		
		DashBoardPage dp = new DashBoardPage(driver);
		
		dp.dashboardclick();
		
		PaymentPage pg= new PaymentPage(driver);
		String crdnum=ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 0);
		String expdate=ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 1);
		String cvcnum=ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 2);
		
		pg.paymentOption(crdnum, expdate, cvcnum);
		
	}
	
	
}
