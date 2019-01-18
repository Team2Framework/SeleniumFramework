package pages.test;

import base.CommonAPI;
import pages.FlightsPage;
import pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlightsPageTest extends CommonAPI {
    FlightsPage flightsPage;
    HomePage homePage;
    @BeforeMethod
    public void setup(){
        homePage = new HomePage();
        flightsPage = homePage.clickFlightsLink(); }
    @Test
    public void properUrlTest(){
        flightsPage.properUrl();
    }
    @Test
    public void flightslinkIsUnderlinedTest(){
        flightsPage.flightslinkIsUnderlined();
    }
    @Test
    public void headerLabelTextValidationTest(){
        flightsPage.headerLabelTextValidation();
    }
    @Test
    public void dropDownValidationTest(){
        flightsPage.dropDownValidation();
    }
    @Test
    public void airlinesDropDownTest(){
        flightsPage.airlinesDropDown();
    }
    @Test
    public void popularFlightsNDiscountAirfareLabelVisibilityTest(){
        flightsPage.popularFlightsNDiscountAirfareLabelVisibility(); }
    @Test
    public void popularFlightRoutesLabelVisibilityTest(){
        flightsPage.popularFlightRoutesLabelVisibility(); }

}
