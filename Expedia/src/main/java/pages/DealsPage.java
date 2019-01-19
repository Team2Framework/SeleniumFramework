package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DealsPage extends CommonAPI {
    public DealsPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#primary-header-deals")
    WebElement dealsLink;
    @FindBy(xpath = "//h3[contains(text(),'Vacation Package Deals')]")
    WebElement vacationPakageDealsLabel;
    @FindBy(xpath = "//h3[contains(text(),'Flight Deals')]")
    WebElement flightDealsLabel;
    @FindBy(xpath = "//h3[contains(text(),'Hotel Deals')]")
    WebElement hotelDealsLabel;
    @FindBy(xpath = "//h3[contains(text(),'Cruise Deals')]")
    WebElement cruiseDealsLabel;
    @FindBy(xpath = "//h3[contains(text(),'Car Rental Deals')]")
    WebElement carRentalDealsLabel;

    public void properUrl() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.expedia.com/Deals");
    }
    public void pageTitleValidation(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Travel Deals: Find Cheap Deals on Travel, Trips & Tours | Expedia.com");
    }
    public void chooseClassVerification(){
        Select dropDown = new Select(driver.findElement(By.cssSelector("#F-Class")));
        dropDown.selectByVisibleText("Business");
        WebElement businessOption = driver.findElement(By.xpath("//option[@value='b']"));
        Assert.assertTrue(businessOption.isSelected());
    }
    public void carRentalDealsLabelVisibility(){
        boolean visible = carRentalDealsLabel.isDisplayed();
        Assert.assertTrue(visible);
    }
}

