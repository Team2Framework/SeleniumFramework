package NYTest;

import NYHome.NYHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class NYHomePageTest extends NYHomePage {
    NYHomePage nyHomePage = PageFactory.initElements(driver, NYHomePage.class);
    @Test
    public void Menu() throws InterruptedException {
       nyHomePage.clickOnElement("#app > div > div > header > section.css-1waixk9.e1nre7572 > div.css-qo6pn.emxkhtz0 > div.css-6n7j50 > button > svg");
    }
    @Test
    public void Menu1(){
       NYHomePage nyHomePage = PageFactory.initElements(driver, NYHomePage.class);
    }
    @Test
    public void Sports(){
        NYHomePage.sports.click();
        //sportspage(WebDriver driver);
    }
    @Test
    public void Book(){
        NYHomePage nyHomePage = PageFactory.initElements(driver, NYHomePage.class);
    }
    @Test
    public void Science(){
        NYHomePage.science.click();
    }
    @Test
    public void Business(){
        NYHomePage nyHomePage = PageFactory.initElements(driver, NYHomePage.class);
    }
    @Test
    public void Magazine(){
        NYHomePage.magazine.click();
    }
    @Test
    public void Travel(){
        NYHomePage.travel.click();
    }
    @Test
    public void Style(){
        NYHomePage.style.click();
    }
    @Test
    public void Arts(){
        NYHomePage nyHomePage = PageFactory.initElements(driver, NYHomePage.class);
    }
    @Test
    public void Health(){
        NYHomePage.health.click();
    }

}
