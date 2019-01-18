package NYHome;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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


    public static void setMenu(WebDriver driver) throws InterruptedException {
        menu.click();
        Thread.sleep(3000);
    }
    public static void sportspage(WebDriver driver) throws InterruptedException {
        sports.click();
    }
    public static void setScience(WebDriver driver) throws InterruptedException {
        science.click();
    }
    public static void setBusiness(WebDriver driver) throws InterruptedException {
        business.click();
    }
    public static void setOpinion(WebDriver driver) throws InterruptedException {
        opinion.click();
    }
    public static void setHealth(WebDriver driver) throws InterruptedException {
        health.click();
    }
    public static void setArts(WebDriver driver) throws InterruptedException {
        arts.click();
    }
    public static void setBooks(WebDriver driver) throws InterruptedException {
        books.click();
    }
    public static void setStyle(WebDriver driver) throws InterruptedException {
        style.click();
    }
    public static void setFood(WebDriver driver) throws InterruptedException {
        food.click();
    }
    public static void setTravel(WebDriver driver) throws InterruptedException {
        travel.click();
    }
    public static void setMagazine(WebDriver driver) throws InterruptedException {
        magazine.click();
    }




}
