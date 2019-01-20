package NYHome;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class NYHomePage extends CommonAPI {

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
    @FindBy(css = "#app > div > div > header > section.hasLinks.css-1rl68kf.ea53akk3 > div.css-9e9ivx > a")
    public static WebElement subscribe;
    @FindBy(css = "#app > div:nth-child(2) > div > header > div.css-1d8a290 > ul > li:nth-child(1) > a")
    public static WebElement worldnews;

    public void nyHome(){
        PageFactory.initElements(driver, this);
    }
    public void setMenu() throws InterruptedException {
        menu.click();
        Thread.sleep(3000);
    }
    public void sportspage() throws InterruptedException {
        sports.click();
    }
    public void setScience() throws InterruptedException {
        science.click();
    }
    public void setBusiness() throws InterruptedException {
        business.click();
    }
    public void setOpinion(WebDriver driver) throws InterruptedException {
        opinion.click();
    }
    public void setHealth() throws InterruptedException {
        health.click();
    }
    public void setArts() throws InterruptedException {
        arts.click();
    }
    public void setBooks() throws InterruptedException {
        books.click();
    }
    public void setStyle() throws InterruptedException {
        style.click();
    }
    public void setFood(WebDriver driver) throws InterruptedException {
        food.click();
    }
    public void setTravel() throws InterruptedException {
        travel.click();
    }
    public void setMagazine() throws InterruptedException {
        magazine.click();
    }
    public void setTodaysP(WebDriver driver) throws InterruptedException {
        todayspaper.click();
        Thread.sleep(3000);
    }
    public String validateNYTitle(){
        return driver.getTitle();
    }
    public void clickByXpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickByXpathWebElement(WebElement locator){
        locator.click();
    }
    public void setWorldNew(){
        clickByXpathWebElement(worldnews);
        String Actual = driver.findElement(By.cssSelector("#collection-world > div.rank > section.highlights.highlights-collection-package.collection-package.collection > div.rank-template.featured-rank-template.template-2 > ol > li:nth-child(1) > article > div > h2 > a")).getText();
        String Expected = "Death Toll in Mexico Blast Rises to 66; Leader Vows to Intensify Crackdown on Fuel Theft";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
        String actual = driver.findElement(By.xpath("#collection-world > div.rank > section.highlights.highlights-collection-package.collection-package.collection > div.rank-template.featured-rank-template.template-2 > ol > li.story-group > ol > li:nth-child(1) > div > h2 > a")).getText();
        String expected = "More Than 100 Migrants Die at Sea in Wreck Off Libya, Survivors Say";
        Assert.assertEquals(actual,expected);
        System.out.println(actual);
    }


}
