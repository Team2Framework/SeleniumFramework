package base;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends CommonAPI {

    @FindBy(xpath = ("//p[@class='profile-name']"))
    public static WebElement ViewSignInUser;

    public void ClickViewSignInUser() {
        ViewSignInUser.click();
    }

    @FindBy(id = ("//input[@id='email-signin-account']"))
    public static WebElement SignInEmail;

    public void inputSignInEmail() {
        SignInEmail.sendKeys("Doladaoud710@gmail.com");
    }

    @FindBy(id = ("//input[@id='password']"))
    public static WebElement SignInPassWord;

    public void inputSignInPassWord() {

        SignInPassWord.sendKeys("abcd1234");
    }

    @FindBy(xpath = ("//input[@id='signin-submit']"))
    public static WebElement SignInButton;

    public void ClickSignInButton() {
        //ViewSignInUser.click();
        SignInButton.click();
    }
}