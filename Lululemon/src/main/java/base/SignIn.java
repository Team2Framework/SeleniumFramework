package base;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn extends CommonAPI {

    @FindBy(xpath = ("//p[@class='profile-name']"))
    public static WebElement ViewSignInUser;

    public void ClickViewSignInUser() {
        ViewSignInUser.click();
    }

    @FindBy(name = ("email"))
    public static WebElement SignInEmail;

    public void inputSignInEmail() {
        SignInEmail.sendKeys("Doladaoud710@gmail.com");
    }

    @FindBy(id = ("password"))
    public static WebElement SignInPassWord;

    public void inputSignInPassWord() {

        SignInPassWord.sendKeys("Ibrahim99");
    }

    @FindBy(name= ("/atg/userprofiling/ProfileFormHandler.login"))
    public static WebElement SignInButton;

    public void ClickSignInButton() {
        //ViewSignInUser.click();
        SignInButton.click();
    }
    @FindBy(linkText = "Sign Out ")
    WebElement SignOut;
     public void SigningOut(){
         SignOut.click();
     }
    }
