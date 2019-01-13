package base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends CommonAPI {

    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[1]/div/div[2]/ul/li[1]"))
    public static WebElement ViewSignInUser;
    private Object Enter;

    public void ClickViewSignInUser() {
        ViewSignInUser.click();
    }
    @FindBy(id = ("userid"))
    public static WebElement SignInEmailorID;
    public void InputSignInEmailorID() {
        SignInEmailorID.sendKeys("Doladaoud710@gmail.com");
    }
    @FindBy(id = ("pass"))
    public static WebElement SignInPassWord;
    public void InputSignInPassWord() {
        SignInPassWord.sendKeys("abcd1234");
    }
    @FindBy(xpath = ("//*[@id="password]"))
    public static WebElement CreateAnAccount;
    public void ClickSignInButton() {
        //ViewSignInUser.click();
        ClickSignInButton().click();
    }
}
