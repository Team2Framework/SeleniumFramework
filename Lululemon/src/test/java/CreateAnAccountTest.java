import base.CreateAnAccount;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAnAccountTest extends base.CreateAnAccount {
    CreateAnAccount Create;
    @BeforeMethod
    public void initElement() {
        Create = PageFactory.initElements(driver, CreateAnAccount.class);
    }
    //User should be able to click on register user button
    @Test
    public void testViewRegister() {
        Create.ViewCreateAnAccount();
        driver.navigate().back();
    }
    //User should be able to create account with proper information
    @Test
    public void testCreateAccount() throws InterruptedException {
        Create.ClickViewCreateAccount();
        Thread.sleep(3000);
        Create.InputEmail();
        Create.InputPassword();
        Create.InputSignUpForLululemonEmail();
        Create.ClickCreateAccountButton();
        driver.navigate().back();
    }
}
