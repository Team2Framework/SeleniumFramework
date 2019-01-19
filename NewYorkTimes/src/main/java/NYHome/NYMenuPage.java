package NYHome;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class NYMenuPage extends CommonAPI {
    public void setUp(@Optional("https://www.nytimes.com/") String url){
    }
    @FindBy(css = "#app > div > div > header > section.css-1waixk9.e1nre7572 > div.css-qo6pn.emxkhtz0 > div.css-6n7j50 > button > svg")
    public static WebElement menu;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[10]/a")
    public static WebElement sports;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[8]/a")
    public static WebElement science;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[5]/a")
    public static WebElement business;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[6]/a")
    public static WebElement opinion;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[9]/a")
    public static WebElement health;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[11]/a")
    public static WebElement arts;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[12]/a")
    public static WebElement books;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[13]/a")
    public static WebElement style;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[14]/a")
    public static WebElement food;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[15]/a")
    public static WebElement travel;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[16]/a")
    public static WebElement magazine;
    @FindBy(css = "#app > div:nth-child(2) > div > header > section.hasLinks.css-1rl68kf.ea53akk3 > div.css-bfvq22.ea53akk2 > a")
    public static WebElement todayspaper;
    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/form/div/input")
    public static WebElement menusearch;
    public void getSports() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-sports > header > nav > ol > li:nth-child(7) > a")).getText();
        System.out.println(Actual);
    }
    public void selectBusiness() throws InterruptedException {
        menu.click();
        sleep(2);
        business.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-business > div.css-8age7h.ekkqrpp0 > section.css-1u611yh.e46isfb1 > div.css-1s5mpje.ekkqrpp1 > div > ol.css-rgzd4z.ekkqrpp2 > li:nth-child(1) > article > div > h2 > a")).getText();
        System.out.println(Actual);
    }
    public void selectScience() throws InterruptedException {
        menu.click();
        sleep(2);
        science.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-science > div.css-8age7h.ekkqrpp0 > section.css-1r6mpip.e46isfb1 > div.css-1s5mpje.ekkqrpp1 > ol > li:nth-child(1) > article > div > h2 > a")).getText();
        System.out.println(Actual);
    }
    public void selectOpinion() throws InterruptedException {
        menu.click();
        sleep(2);
        opinion.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#stream-panel > div.css-13mho3u > ol > li:nth-child(4) > div > div.css-4jyr1y > a > h2")).getText();
        System.out.println(Actual);
    }
    public void clickOnSearchMenu() throws InterruptedException{
        menu.click();
        sleep(2);
        menusearch.sendKeys("Weather", Keys.ENTER);
    }
    public void selectHealth() throws InterruptedException {
        menu.click();
        sleep(2);
        health.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-health > div.css-8age7h.ekkqrpp0 > section.css-1r6mpip.e46isfb1 > div.css-17r5r0a.ekkqrpp1 > ol > li.css-7cmujy.ekkqrpp3 > article > div > h2 > a")).getText();
        System.out.println(Actual);
    }
    public void selectArt() throws InterruptedException {
        menu.click();
        sleep(2);
        arts.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-arts > div.rank > section > div.rank-template.featured-rank-template.template-2 > ol > li:nth-child(2) > article > div > h2 > a")).getText();
        System.out.println(Actual);
    }
    public void selectMagazine() throws InterruptedException {
        menu.click();
        sleep(2);
        magazine.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-magazine > div.rank > section > div.rank-template.featured-rank-template.template-1 > ol > li:nth-child(1) > article > div > h2 > a")).getText();
        System.out.println(Actual);
    }
    public void selectBooks() throws InterruptedException {
        menu.click();
        sleep(2);
        books.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-books > div.css-8age7h.ekkqrpp0 > section.css-1r6mpip.e46isfb1 > div.css-1s5mpje.ekkqrpp1 > ol > li:nth-child(1) > article > div > h2 > a")).getText();
        System.out.println(Actual);
    }
    public void findTrump() throws InterruptedException{
        menu.click();
        sleep(2);
        menusearch.sendKeys("Trump", Keys.ENTER);
        getTextByName("How to Make Trump’s Tax Returns Public");
        String Actual = driver.findElement(By.cssSelector("#site-content > div > div > div:nth-child(2) > div.css-46b038 > ol > li:nth-child(2) > div > div > a > h4")).getText();
        System.out.println("Trump was found " + Actual);
    }



}
