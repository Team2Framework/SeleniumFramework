package NYTest;

import NYHome.NYHomePage;
import NYHome.NYMenuPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class NYMenuTest extends NYMenuPage {
    NYMenuPage nymenu = PageFactory.initElements(driver, NYMenuPage.class);
    public void setUp3(@Optional("https://www.nytimes.com/") String url){
    }
    @BeforeMethod
    @Test
    public void clickOnSearch() throws InterruptedException {
        nymenu.clickOnSearchMenu();
    }
    @Test
    public void clickOnMag() throws InterruptedException {
        nymenu.selectMagazine();
    }
    @Test
    public void clickOnBusiness() throws InterruptedException {
        nymenu.selectBusiness();
    }
    @Test
    public void clickOnHealth() throws InterruptedException {
        nymenu.selectHealth();
    }
    @Test
    public void clickOnScience() throws InterruptedException {
        nymenu.selectScience();
    }
    @Test
    public void clickOnArt() throws InterruptedException {
        nymenu.selectArt();
    }
    @Test
    public void clickOnOpinion() throws InterruptedException {
        nymenu.selectOpinion();
    }
    @Test
    public void clickOnBooks() throws InterruptedException {
        nymenu.selectBooks();
    }
    @Test
    public void clickOnTrump() throws InterruptedException {
        nymenu.findTrump();
    }

}
