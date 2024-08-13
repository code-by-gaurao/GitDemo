package com.e_learingproject.testcases;

import org.testng.annotations.Test;

import com.e_learingproject.pages.BaseTest;
import com.e_learingproject.pages.LoginPage;
import com.e_learingproject.pages.SearchPage;
import com.e_learingproject.utility.ReadExcelFile;

public class SerachTestCase extends BaseTest {


	String fileName=System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";
	
	@Test(priority =1)
	void searchCourseTesr()
	{
		/*LoginPage lp=new LoginPage(driver);
		String username=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password=ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginToPortal(username, password); */
		
		SearchPage sp= new SearchPage(driver);
		String serachCourse=ReadExcelFile.getCellValue(fileName, "SearchCourse", 0, 0);
		sp.serachCourse(serachCourse);
	}
}
