package base;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import base.CommonAPI;
import java.util.List;

public class DropDownOptions extends CommonAPI {
    public void dropDown(){
        List<WebElement> element = getListOfWebElementsByCss(".//ul[@id='js-navigation-menu']//li[1] option");
        List<String> listOfText = getListOfString(element);
        for (String text : listOfText) {
            System.out.println(text);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }
}


