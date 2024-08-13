package com.e_learingproject.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.e_learingproject.pages.BaseTest;
import com.e_learingproject.pages.DashBoardPage;
import com.e_learingproject.pages.LoginPage;
import com.e_learingproject.utility.ReadExcelFile;

public class DashBoardTestCase extends BaseTest {

	
	String fileName=System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";

	@Test(priority =1)
	public void VerifyLogin() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		String username= ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password= ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		System.out.println(username+" "+password);
		lp.loginToPortal(username, password);
		
		DashBoardPage dp=new DashBoardPage(driver);
		dp.dashboardclick();
	}
	
}
