package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CustomerServicePage extends CommonAPI {
    public CustomerServicePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h3[@class='aside-prompt']")
    WebElement CustomerServiceLabel;
    @FindBy(css = "#mad-t2d-form-input")
    WebElement phoneNumberInputBox;
    @FindBy(xpath = "//button[@class = 'btn-secondary btn-sub-action']")
    WebElement SendButton;
    @FindBy(xpath = "//a[contains(text(),'Add your property to Expedia')]")
    WebElement addPropertyButton;
    @FindBy(css = "#search-term")
    WebElement searchBox;

    public void CSLabelText(){
        String text = CustomerServiceLabel.getText();
        Assert.assertTrue(text.contains("We're here to help"));
    }
    public void verifyPhoneTextLabel() throws InterruptedException {
        phoneNumberInputBox.clear();
        phoneNumberInputBox.sendKeys("2039163410");
        SendButton.click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement labelText;
        labelText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert-message']")));
        Assert.assertEquals(labelText.getText(),"Thank you! A text with the download link has been sent to your mobile device");
    }
    public void properUrl(){
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.expedia.com/service/");
    }
}
