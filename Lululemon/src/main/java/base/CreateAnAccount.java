package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.CommonAPI;

public class CreateAnAccount extends CommonAPI {

    @FindBy(xpath = ("//h4[contains(text(),'Create an Account')]"))
    public static WebElement CreateAnAccount;
    public void ClickSignUpButton(){
        ClickSignUpButton().click();
    }
    @FindBy(xpath = ("//input[@id='email-signup-account']"))
    public static WebElement Email;
    @FindBy(xpath = "//input[@id='new-password']")
    public static WebElement RegisterPassWord;
    @FindBy(xpath = ("//span[@class='replace-checkbox-label']"))
    public static WebElement SignUpForLululemonEmails;
    @FindBy(xpath = ("//input[@id='signup-submit']"))
    public static WebElement CreateAccount;

    public void RegisterEmail() {
        RegisterEmail().sendkeys("Doladaoud@icloud.com");
    }
    public void InputRegisterPassWord(){
            RegisterPassWord.sendKeys("Shila123");
            }
    public void clickSignUpForLululemonEmails(){
            SignUpForLululemonEmails.click();
}
    public void ClickCreateAnAccountButton(){
            ClickCreateAnAccountButton().click();
}

}


