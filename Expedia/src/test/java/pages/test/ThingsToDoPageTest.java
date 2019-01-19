package pages.test;

import pages.HomePage;
import pages.ThingsToDoPage;
import base.CommonAPI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class ThingsToDoPageTest extends CommonAPI {
    HomePage homePage;
    ThingsToDoPage thingsToDoPage;

    @BeforeMethod
    public void createObject(){
        homePage = new HomePage();
        thingsToDoPage = homePage.clickThingsToDoPage();
    }

    @Test
    public void testThingsToDoForm(){
        thingsToDoPage.fillThingsToDoForm("Rome","03/05/2019","03/12/2019");
    }
    @Test
    public void pageUrl(){
        thingsToDoPage.properUrl();
    }
    @Test
    public void pageTitleTest(){
        thingsToDoPage.pageTitleValidation();
    }
    @Test
    public void invalidSearchTest() throws IOException, IOException { thingsToDoPage.fillSearchFormWithInvalidDate(); }
    @Test
    public void headerLabelTextValidationTest(){
        thingsToDoPage.headerLabelTextValidation();
    }
    @Test
    public void usActivitiesLabelVisibilityTest(){
        thingsToDoPage.usActivitiesLabelVisibility();
    }
    @Test
    public void thingsToDoInEuropeLabelVisibilityTest(){
        thingsToDoPage.thingsToDoInEuropeLabelVisibility();
    }
    @Test
    public void whatToDoInTheCaribbeanLabelVisibiityTest(){
        thingsToDoPage.whatToDoInTheCaribbeanLabelVisibiity();
    }
    @Test
    public void toursAndActivitiesInLatinAmericaLabelTest(){thingsToDoPage.toursAndActivitiesInLatinAmericaLabelVisibility(); }
    @Test
    public void thingsToDoLlinkIsUnderlinedTest(){
        thingsToDoPage.thingsToDoLlinkIsUnderlined();
    }
}