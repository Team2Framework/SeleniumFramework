package pages.test;

import base.CommonAPI;
import pages.HomePage;
import TestData.ExcelReader;
import TestData.XSSFDataReader;
import com.relevantcodes.extentreports.ExtentReports;
import org.testng.Assert;
import org.testng.annotations.*;
import reporting.ExtentManager;

public class HomePageTest extends CommonAPI {
    HomePage homePage;
    ExtentReports report;
    XSSFDataReader xssfDataReader;
    String path = "C:\\Users\\Zack\\IdeaProjects\\SeleniumFramework\\Expedia\\src\\test\\java\\testFiles\\ExpediaTestData.xlsx";

    @BeforeMethod
    public void createTestObj() throws Exception {
        this.xssfDataReader = new XSSFDataReader();
        this.xssfDataReader.setExcelFile(path,"Sheet1");
        this.homePage = new HomePage();
        report = ExtentManager.getInstance();
    }
    @Test(priority = 1)
    public void homePageTitleTest(){
        homePage.getHomePageTitle();
    }
    @Test(priority = 2)
    public void isLogoVisibleTest(){
        homePage.validateExpediaLogo();
    }
    @Test()
    public void testRoundTripFlightWithOneAdult() throws InterruptedException {
        homePage.searchRoundTripFlightOneAdult("Vienna","Paris","03/12/19","03/18/2019"); }
    @Test
    public void pageUrlTest(){
        homePage.properUrl();
    }
    @DataProvider
    public Object[][] getExcelTestData(){
        Object data[][] = ExcelReader.getTestData(0);
        return data;
    }
    @Test(dataProvider = "getExcelTestData")
    public void testRoundTripFlightWithExcelData(String from, String to, String departing, String returning) throws InterruptedException {
        homePage.searchRoundTripFlightOneAdult(from,to,departing,returning);
    }
}
