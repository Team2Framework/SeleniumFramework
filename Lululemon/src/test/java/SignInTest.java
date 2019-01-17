import base.CommonAPI;
import base.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInTest extends SignIn {
    @Test(priority = 1)
    //User should be able to click on sign in button
    public void testSignIn() {
        SignIn signIn = PageFactory.initElements(driver, SignIn.class);
        signIn.ClickViewSignInUser();
    }
    //User should be able to sign in using personal information
    @Test(priority = 2)
    public void testSignInAccount() {
        SignIn sg = PageFactory.initElements(driver, SignIn.class);
        sg.ClickViewSignInUser();
        sg.inputSignInEmail();
        sg.inputSignInPassWord();
        sg.ClickSignInButton();
        sg.SigningOut();
    }
}
