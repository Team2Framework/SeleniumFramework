package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.CommonAPI;
import org.testng.annotations.AfterMethod;

public class CreateAnAccount extends CommonAPI {

    @FindBy(xpath = ("//h4[contains(text(),'Create an Account')]"))
    public static WebElement CreateAnAccount;
    public void CreateAnAccount(){

        CreateAnAccount.click();
    }
    @FindBy(xpath = ("//input[@id='email-signup-account']"))
    public static WebElement Email;
    @FindBy(xpath = "//input[@id='new-password']")
    public static WebElement RegisterPassWord;
    @FindBy(xpath = ("//span[@class='replace-checkbox-label']"))
    public static WebElement SignUpForLululemonEmails;
    @FindBy(xpath = ("//input[@id='signup-submit']"))
    public static WebElement CreateAccount;

    public void Email() {

        Email.sendKeys("Doladaoud@icloud.com");
    }
    public void InputRegisterPassWord(){

        RegisterPassWord.sendKeys("Shila123");
            }
    public void clickSignUpForLululemonEmails(){
            SignUpForLululemonEmails.click();

}
    public void CreateAAccount(){
        CreateAccount.click();

}

}


