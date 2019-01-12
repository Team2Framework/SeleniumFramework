package base;

import org.openqa.selenium.By;
import org.testng.Assert;

public class SignIn extends CommonAPI {
    public  void clickSignIn(){
        clickByXpath("//*[@id=\"gh-ug\"]/a");
    }
    // we are in sign in page
    public  void verifySignIn(){
        boolean expected = true;
        boolean actual = driver.findElement(By.cssSelector("#GREET-HELLO")).isDisplayed();
        Assert.assertEquals(actual,expected);
        System.out.println("WE are in right page"); }
    //Signin
    public void signIn(String userName,String passWord){
        clickOnCss("#userid");
        typeByCss("#userid",userName);
        typeByCss("#pass",passWord);
        clickOnCss("#sgnBt"); }
        // Sign In with In valid Email and invalid password
    public void invalidEmailUse(String userName,String passWord){
        clickOnCss("#userid");
        typeByCss("#userid",userName);
        typeByCss("#pass",passWord);
        clickOnCss("#sgnBt"); }
        //Sign In with valid Email and invalid password
    public void validEmailAndInvalidPasswordUse(String userName,String passWord){
        clickOnCss("#userid");
        typeByCss("#userid",userName);
        typeByCss("#pass",passWord);
        clickOnCss("#sgnBt");
    }
    //Sign In with no Email and valid password
    public void noEmailAndValidPasswordUse(String userName,String passWord){
        clickOnCss("#pass");
        typeByCss("#pass",passWord);
        clickOnCss("#sgnBt"); }
        //Sign in with no email And No password
    public void noEmailNoPasswordUse(String userName,String passWord){
        clickOnCss("#userid");
        clickOnCss("#pass");
        clickOnCss("#sgnBt");
    }
}
