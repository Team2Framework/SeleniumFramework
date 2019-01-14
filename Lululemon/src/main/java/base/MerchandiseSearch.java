package base;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MerchandiseSearch  extends  CommonAPI{


    @FindBy(how = How.XPATH, using ="/html/body/header/div/nav/div[3]/ul/li[3]/a/svg")
    public static WebElement search;
    @FindBy(how = How.XPATH, using ="//*[@id=\"gh-btn\"]")
    public static WebElement submitButtonWebElement;
    public WebElement getSearchInputWebElement() {
        return getSearchInputWebElement();
    }
    public WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }
    public void searchFor(String value){
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton() throws InterruptedException {
        getSubmitButtonWebElement().click();
        driver.navigate().back();
        Thread.sleep(2000);
    }
    public void clearInput(){
        getSearchInputWebElement().clear();
    }
    public void searchItemsAndSubmitButton() throws IOException, InterruptedException {
        List<String> list = getItemValue();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
        }
    }
    public WebElement getSearchInputField() {
        return getSearchInputWebElement();
    }
    public void setSearchInputField(WebElement searchInputField) {
        this.getSearchInputWebElement() = searchInputField;
    }
    public void searchItems() throws InterruptedException, IOException {
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }
    public List<String> getItemValue(){
        List<String> itemsList = new ArrayList<>();
        itemsList.add("Yoga Mat");
        itemsList.add("Hats");
        itemsList.add("Best Seller");
        itemsList.add("Bags");
        itemsList.add("Men's wear");
        itemsList.add("Hoodies");
        itemsList.add("Tights");
        itemsList.add("Long sleeves");
        return itemsList;
    }
}


