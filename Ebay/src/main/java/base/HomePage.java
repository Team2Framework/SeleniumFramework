package base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI{
    @FindBy(how = How.CSS, using = "#gh-ac")
    public static WebElement searchInputWebElement;
    @FindBy(how = How.CSS, using = "#gh-btn")
    public static WebElement submitButtonWebElement;
    public WebElement getSearchInputWebElement () {
        return searchInputWebElement;
    }
    public WebElement getSubmitButtonWebElement () {
        return submitButtonWebElement;
    }
    public void serachFor (String value){
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton () {
        getSubmitButtonWebElement().click();
    }
    public void viewMultipleByCSS () {
        List<WebElement> menu = getListOfWebElementsByCss("[aria-label='Select a category for search']");
        for (WebElement search : menu) {
            System.out.println(search.getText());
        }
    }
    public void clearInput () {
        getSearchInputWebElement().clear();
    }
    public List<String> getMenuData () {
        List<String> data = new ArrayList<>();
        data.add("PS4");
        data.add("Video Games");
        data.add("");
        return data;
    }
    public void searchItemsAndSubmitButton () throws IOException {
        List<String> list = getItemValue();
        for (int i = 0; i < list.size(); i++) {
            serachFor(list.get(i));
            submitSearchButton();
            clearInput();
        }
    }
    public WebElement getSearchInputField () {
        return searchInputWebElement;
    }
    public void setSearchInputField (WebElement searchInputField){
        this.searchInputWebElement = searchInputField;
    }
    public void searchItems () throws InterruptedException, IOException {
        List<String> itemList = getItemValue();
        for (String st : itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }
    public List<String> getItemValue () {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("PS4");
        itemsList.add("PS4 Games");
        itemsList.add("Macbook Air Laptop");
        itemsList.add("Iphone");
        itemsList.add("Tumbler");
        itemsList.add("Ipad");
        itemsList.add("Kids Toys");
        itemsList.add("HouseHold Items");

        return itemsList;
    }

}

