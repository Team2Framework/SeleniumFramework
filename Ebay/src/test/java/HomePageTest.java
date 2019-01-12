import base.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends HomePage {
    @Test
    public void verifyEbay(){
        boolean expected = true;
        boolean actual = driver.findElement((By.cssSelector("#gh-logo"))).isDisplayed();
        System.out.println(actual);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void searchItems() throws IOException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.searchItemsAndSubmitButton();
    }
    @Test
    public void getCategories(){
        mouseHoverByCSS("#gh-cat");
        viewMultipleByCSS();
    }
}