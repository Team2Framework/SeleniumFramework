import base.CreateAnAccount;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateAnAccountTest extends CreateAnAccount {
    CreateAnAccount Create;
    @Parameters("https://shop.lululemon.com/")

    @BeforeMethod
    public void initElement() {
        Create = PageFactory.initElements(driver, CreateAnAccount.class);
    }
    //User should be able to click on register user button
    @Test
    public void testViewRegister() {
        Create.ClickViewRegisterUser();
        driver.navigate().back();
    }
    //User should be able to create account with proper information
    @Test
    public void testCreateAccount() throws InterruptedException {
        Create.ClickCreateAccountButton();
        Thread.sleep(3000);
        Create.InputRegisterEmail();
        Create.InputRegisterPassWord();
      //  Create.InputSignUpForLululemonEmail();
        Create.ClickCreateAccountButton();
        driver.navigate().back();
    }
}
