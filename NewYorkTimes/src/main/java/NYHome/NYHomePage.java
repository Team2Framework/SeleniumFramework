package NYHome;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;

public class NYHomePage extends CommonAPI {

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



}
