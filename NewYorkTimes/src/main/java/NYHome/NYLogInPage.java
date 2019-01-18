package NYHome;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;

public class NYLogInPage extends CommonAPI {
    public void setUp(@Optional("https://www.nytimes.com/") String url){
    }
    @FindBy(css= "#app > div > div > header > section.hasLinks.css-1rl68kf.ea53akk3 > div.css-9e9ivx > a.css-1gz70xg")
    public static WebElement login;
    @FindBy(name = "username")
    public static WebElement username;
    @FindBy(name = "password")
    public static WebElement password;
    @FindBy(css = "#submitButton")
    public static WebElement loginbutton;
    @FindBy(css = "#app > div > div > header > section.hasLinks.css-1rl68kf.ea53akk3 > div.css-9e9ivx > a")
    public static WebElement subscribe;
    @FindBy(css = "#js-facebook-oauth-login")
    public static WebElement facebooklogin;
    @FindBy(css = "#js-google-oauth-login")
    public static WebElement googlelogin;
    @FindBy(css = "#app > div > div > header > section.css-1waixk9.e1nre7572 > div.css-pbg2l9.e1c1i1hy1 > div:nth-child(2) > button > svg > circle")
    public static WebElement logoutpage;
    @FindBy(css = "body > div:nth-child(49) > div > div > section > a > button")
    public static WebElement logoutbutton;
    @FindBy(css = "body > div:nth-child(49) > div > div > section > section.css-1x766dz > ul > li:nth-child(2) > a")
    public static WebElement help ;
    @FindBy(css = "#myAccountAuth > div > header > div > div > a > svg > image")
    public static WebElement logoimage;
    @FindBy(css = "#myAccountAuth > div > div > div > div > h2")
    public static WebElement logintitle;
    public void LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean validateNYImage(){
        return logoimage.isDisplayed();
    }
    public void logIn(String user, String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
        loginbutton.click();
    }

}
