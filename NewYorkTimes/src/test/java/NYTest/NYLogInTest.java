package NYTest;

import NYHome.NYLogInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class NYLogInTest extends NYLogInPage {

    NYLogInPage nylogin = PageFactory.initElements(driver, NYLogInPage.class);

    @BeforeMethod
    @Test
    public void logInPageTitleTest(){
        String title = nylogin.validateLoginPageTitle();
        Assert.assertEquals(title, "Log In - New York Times");
    }
    @Test
    public void loginLogo(){
        boolean logoim = nylogin.validateNYImage();
        Assert.assertTrue(logoim);
    }
    @Test
    public void loginTest(){
        nylogin.logIn("22abushamma22@gmail.com", "qwerty");
    }



}
