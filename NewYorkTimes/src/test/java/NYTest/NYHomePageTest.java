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
        //NYHomePage.menu.click();
        NYHomePage M = PageFactory.initElements(driver, NYHomePage.class);
    }
    @Test
    public void Sports(){
        NYHomePage.sports.click();
        NYHomePage Sp = PageFactory.initElements(driver, NYHomePage.class);
    }
    @Test
    public void Book(){
        WebDriver driver=null;
        //NYHomePage.books.click();
        NYHomePage Bk = PageFactory.initElements(driver, NYHomePage.class);
    }
    @Test
    public void Science(){
        NYHomePage.science.click();
        //NYHomePage Sc = PageFactory.initElements(driver, NYHomePage.class);
    }
    @Test
    public void Business(){
        NYHomePage.business.click();
        //NYHomePage Bu = PageFactory.initElements(driver, NYHomePage.class);
    }
    @Test
    public void Magazine(){
        NYHomePage.magazine.click();
        //NYHomePage Mg = PageFactory.initElements(driver, NYHomePage.class);
    }
    @Test
    public void Travel(){
        NYHomePage.travel.click();
        //NYHomePage Tr = PageFactory.initElements(driver, NYHomePage.class);
    }
    @Test
    public void Style(){
        NYHomePage.style.click();
        //NYHomePage St = PageFactory.initElements(driver, NYHomePage.class);
    }
    @Test
    public void Arts(){
        NYHomePage.arts.click();
        //NYHomePage Ar = PageFactory.initElements(driver, NYHomePage.class);
    }
    @Test
    public void Health(){
        NYHomePage.health.click();
        //NYHomePage Hl = PageFactory.initElements(driver, NYHomePage.class);
    }
    @Test
    public void getSports() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-sports > header > nav > ol > li:nth-child(7) > a")).getText();
        System.out.println(Actual);
    }
    @Test
    public void selectSports() throws InterruptedException {
        menu.click();
        sleep(2);
        business.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-business > div.css-8age7h.ekkqrpp0 > section.css-1u611yh.e46isfb1 > div.css-1s5mpje.ekkqrpp1 > div > ol.css-rgzd4z.ekkqrpp2 > li:nth-child(1) > article > div > h2 > a")).getText();
        System.out.println(Actual);
    }
    @Test
    public void selectScience() throws InterruptedException {
        menu.click();
        sleep(2);
        science.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-science > div.css-8age7h.ekkqrpp0 > section.css-1r6mpip.e46isfb1 > div.css-1s5mpje.ekkqrpp1 > ol > li:nth-child(1) > article > div > h2 > a")).getText();
        System.out.println(Actual);
    }

}
