package NYHome;

import base.CommonAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;

import java.io.File;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class NYSciencePage extends CommonAPI {

    public void setUp(@Optional("https://www.nytimes.com/") String url){
    }
    @FindBy(css = "#app > div > div > header > section.css-1waixk9.e1nre7572 > div.css-qo6pn.emxkhtz0 > div.css-6n7j50 > button > svg")
    public static WebElement menu;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[8]/a")
    public static WebElement science;
    @FindBy(xpath = "//*[@id=\"collection-climate\"]/div[1]/section/div[1]/ol/li[1]/article/figure/a/img)")
    public static WebElement photo1;
    @FindBy(xpath = "//*[@id=\"collection-science\"]/div[1]/section[1]/div[2]/div/ol/li[3]/article/figure/a/img")
    public static WebElement photo2;
    @FindBy(xpath = "//*[@id=\"collection-science\"]/div[1]/section[1]/div[2]/div/ol/li[4]/article/figure/a/img")
    public static WebElement photo3;

    TakesScreenshot ts = (TakesScreenshot) driver;
    public void scienceScreenshot() throws InterruptedException, IOException {
        driver.findElement(By.xpath("//*[@id=\"collection-science\"]/div[1]/section[1]/div[1]/ol/li[1]/article/figure/a/img")).sendKeys("Science");
        File source= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File ("./Screenshots/NYTimes.png"));
        driver.quit();
    }
    public void setPhotos() throws InterruptedException {
        menu.click();
        sleep(2);
        photo1.click();
    }
    public void setPhotos1() throws InterruptedException{
        menu.click();
        sleep(2);
        photo2.click();
        clickByXpath("//*[@id=\"collection-science\"]/div[1]/section[1]/div[2]/div/ol/li[3]/article/figure/a/img");
    }
    public void setPhoto2() throws InterruptedException{
        menu.click();
        sleep(2);
        photo3.click();
        clickByXpath("//*[@id=\"collection-science\"]/div[1]/section[1]/div[2]/div/ol/li[4]/article/figure/a/img");
    }




}
