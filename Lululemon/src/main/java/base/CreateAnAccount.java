package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.CommonAPI;

public class CreateAnAccount extends CommonAPI {
    @FindBy(xpath = ("//*[@id="content-wrapper"]/div/div[2]/div/div[2]/div/h4"))
    public static WebElement CreateAnAccount;
    @FindBy(xpath = ("//*[@id="content-wrapper"]/div/div[2]/div/div[2]/div/h4"))
    public static WebElement Email;
    @FindBy(xpath = "//*[@id="email-signup-account"]")
    public static WebElement RegisterPassWord;
    @FindBy(xpath = ("//*[@id="new-password"]"))
             public static WebElement base.CreateAnAccount;
            @FindBy(xpath = ("//*[@id=\"signup\"]/div[5]/label/span"))
    public static WebElement CreateAnAccount;
    @FindBy(xpath = ("//*[@id=\"signup-submit\"]"))
    public void ClickViewRegisterUser() {
       ClickViewRegisterUser.click();
    }
    public void InputRegisterEmail() {
        InputRegisterEmail().SendKeys("Doladaoud@icloud.com");
    }
    public void InputRegisterPassWord(){
            RegisterPassWord.sendKeys("Shila123");
            }
    public void ClickCreateAccountButton() {
        ClickCreateAccountButton().click();
    }
    public void clickSignUpForLululemonEmails(){
            SignUpForLululemonEmails.click();
}
    public void ClickCreateAnAccountButton(){
            ClickCreateAnAccountButton().click();
}

}


