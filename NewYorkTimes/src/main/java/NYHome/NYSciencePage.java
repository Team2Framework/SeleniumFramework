package NYHome;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Optional;

public class NYSciencePage extends CommonAPI {
    public void setUp(@Optional("https://www.nytimes.com/") String url){
    }
    @FindBy(css = "#app > div > div > header > section.css-1waixk9.e1nre7572 > div.css-qo6pn.emxkhtz0 > div.css-6n7j50 > button > svg")
    public static WebElement menu;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[8]/a")
    public static WebElement science;


}
