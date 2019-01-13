import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInTest extends base.SignIn {
    @Test
    //User should be able to click on sign in button
    public void testSignIn() {
        ViewSignInUser signIn = PageFactory.initElements(driver, ViewSignInUser.class);
        signIn.User();
    }
    //User should be able to sign in using personal information
    @Test
    public void testSignInAccount() {
        ViewSignInUser signIn = PageFactory.initElements(driver, ViewSignInUser.class);
        signIn.ClickViewSignInUser();
        signIn.InputSignInEmailorID();
        signIn.InputSignInPassWord();
        signIn.ClickSignInButton();
    }
}
