package pages.test;

import pages.LoginPage;
import base.CommonAPI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends CommonAPI {

    LoginPage loginPage;
    @BeforeMethod
    public void createTestObj(){
        loginPage = new LoginPage();
    }
    @Test
    public void validateUrlTest(){
        loginPage.validateUrl();
    }
    @Test
    public void isLabelVisibleTest(){ loginPage.isLabelVisible();}
    @Test
    public void validateLoginPage(){loginPage.loginValidation();}
    @Test
    public void validateLoginFormLabelTest(){
        loginPage.validateLoginFormLabel();
    }
    @Test
    public void testLoginForm(){
        loginPage.loginValidation();
    }

}