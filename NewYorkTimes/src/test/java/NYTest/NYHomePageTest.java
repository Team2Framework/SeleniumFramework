package NYTest;

import NYHome.NYHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class NYHomePageTest extends NYHomePage {
    NYHomePage nyHomePage = PageFactory.initElements(driver, NYHomePage.class);

    public void setUp1(@Optional("https://www.nytimes.com/") String url){
    }
    @BeforeMethod
    @Test
    public String getHomeTitle(){
        System.out.println(driver.getTitle());
        String hometitle =nyHomePage.validateNYTitle();
        Assert.assertEquals(hometitle,"Breaking News, World News & Multimedia - The New York Times");
        return hometitle;
    }
    @Test
    public void Menu1() throws InterruptedException {
        nyHomePage.setMenu();
    }
    @Test
    public void Sports()throws InterruptedException{
        nyHomePage.sportspage();
    }
    @Test
    public void Book()throws InterruptedException{
        nyHomePage.setBooks();
    }
    @Test
    public void Science() throws InterruptedException {
        nyHomePage.setScience();
    }
    @Test
    public void Business() throws InterruptedException {
         nyHomePage.setBusiness();
    }
    @Test
    public void Magazine()throws InterruptedException {
       nyHomePage.setMagazine();
    }
    @Test
    public void Travel()throws InterruptedException {
        nyHomePage.setTravel();
    }
    @Test
    public void Style()throws InterruptedException {
        nyHomePage.setStyle();
    }
    @Test
    public void Arts()throws InterruptedException {
        nyHomePage.setArts();
    }
    @Test
    public void Health()throws InterruptedException {
        nyHomePage.setHealth();
    }
    @Test
    public void getLogo() throws InterruptedException {
        String Actual = driver.findElement(By.cssSelector("#app > div > div > header > section.css-1waixk9.e1nre7572 > div.css-8xdxq2.e1ngbli50 > a > svg")).getText();
        System.out.println(Actual);
    }
    @Test
    public void getTodaysPaper() throws InterruptedException {
        todayspaper.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-todays-new-york-times > div > section:nth-child(1) > div.css-1s5mpje.ekkqrpp1 > ol > li:nth-child(1) > article > div > h2 > a")).getText();
        System.out.println(Actual);
    }
    public void setSubscribe(){
        subscribe.click();
    }

}
