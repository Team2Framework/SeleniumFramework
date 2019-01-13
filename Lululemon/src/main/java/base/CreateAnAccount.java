package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccount extends CommonAPI {
    @FindBy(xpath = ("//*[@id="content-wrapper"]/div/div[2]/div/div[2]/div/h4"))
    public static WebElement CreateAnAccount;
    @FindBy(id = ("//*[@id="content-wrapper"]/div/div[2]/div/div[2]/div/h4"))
    public static WebElement Email;
    @FindBy("//*[@id="email-signup-account"]")
    public static WebElement RegisterPassWord;
    @FindBy(id = (//*[@id="new-password"]))
             public static WebElement base.CreateAnAccount;
            @FindBy(id = ("//*[@id=\"signup\"]/div[5]/label/span"))
    public static WebElement base.CreateAnAccount;
    @FindBy(id = ("//*[@id=\"signup-submit\"]"))
    public void ClickViewRegisterUser() {
        ViewRegisterUser.click();
    }
    public void InputRegisterEmail() {
        RegisterEmail.sendKeys("Doladaoud@icloud.com");
    }
    public void InputRegisterPassWord(){
            RegisterPassWord.sendKeys("Shila123");
            }
    public void ClickCreateAccountButton() {
        CreateAccountButton.click();
    }
    public void clickSignUpForLululemonEmails(){
            SignUpForLululemonEmails.click();
}
    public void ClickCreateAnAccountButton(){
            CreateAnAccountButton.click();
}

}


