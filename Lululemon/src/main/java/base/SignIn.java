package base;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends CommonAPI {

    @FindBy(xpath = ("profile-name"))
    public static WebElement ViewSignInUser;
    public void ClickViewSignInUser() {
        ViewSignInUser.click();
    }

    @FindBy(id = ("userid"))
    public static WebElement SignInEmailorID;
    public void inputSignInEmailorID() {
        SignInEmailorID.sendKeys("Doladaoud710@gmail.com");
    }

    @FindBy(id = ("#password"))
    public static WebElement SignInPassWord;
    public void inputSignInPassWord() {

        SignInPassWord.sendKeys("abcd1234");
    }
    @FindBy(xpath = ("button cta-button next-section-btn"))
    public static WebElement SignInButton;
    public void ClickSignInButton() {
        //ViewSignInUser.click();
        SignInButton.click();
    }
    @FindBy(xpath = ("#signup-submit"))
    public static WebElement CreateAnAccount;
    public void ClickSignInButton(){
            ClickSignInButton().click();
            }
}

