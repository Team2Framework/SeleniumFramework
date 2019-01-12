package base;

import org.openqa.selenium.By;

public class SignUp extends CommonAPI {

    //Creating the account
    public void createAnAccount(){

        clickOnCss("#gh-ug-flex > a");
        //first name on the FirstName field

        clickOnCss("#firstname");
        typeByCss("#firstname", "Dola");

        //last name on the FirstName field
        clickOnCss("#lastname");
        typeByCss("#lastname", "Daoud");

        //last name on the FirstName field
        clickOnCss("#email");
        typeByCss("#email", "Doladaoud710@gmail.com");

        //last name on the FirstName field
        clickOnCss("#PASSWORD");

        typeByCss("#PASSWORD", "Abcd1234");

        // Click on Create account Button
        waitUntilClickAble(By.cssSelector("#ppaFormSbtBtn"));
        clickOnCss("#ppaFormSbtBtn");

        // replace your account
        clickOnCss("#reginter");
    }
}


