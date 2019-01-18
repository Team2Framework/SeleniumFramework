package pages.test;

import base.CommonAPI;
import pages.DealsPage;
import pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DealsPageTest extends CommonAPI {
    HomePage homePage;
    DealsPage dealsPage;

    @BeforeMethod
    public void setup() {
        homePage = new HomePage();
        this.dealsPage = homePage.clickDealsPage(); }
    @Test
    public void properUrlTest() {
        dealsPage.properUrl();
    }
    @Test
    public void pageTitleValidationTest(){
        dealsPage.pageTitleValidation();
    }
    @Test
    public void chooseClassVerificationTest(){
        dealsPage.chooseClassVerification();
    }
    @Test
    public void carRentalDealsLabelVisibilityTest(){
        dealsPage.carRentalDealsLabelVisibility();
    }

}
