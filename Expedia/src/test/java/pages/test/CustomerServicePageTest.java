package pages.test;

import base.CommonAPI;
import pages.CustomerServicePage;
import pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerServicePageTest extends CommonAPI {
    CustomerServicePage customerServicePage;
    @BeforeMethod
    public void createTestObj(){
        this.customerServicePage = new CustomerServicePage();
    }

    @Test
    public void validateLabelText(){
        customerServicePage.CSLabelText();
    }
    @Test
    public void validatePhoneFieldTest() throws InterruptedException {
        customerServicePage.verifyPhoneTextLabel();
    }
//    @Test
//    public void addPropertyTest() throws InterruptedException {
//        customerServicePage.verifyPropertyPageBannerText();
//    }
//    @Test
//    public void searchResultsCount() throws InterruptedException {
//        customerServicePage.getSearchResultCount();
//    }
    @Test
    public void pageUrlTest(){
        customerServicePage.properUrl();
    }
}
