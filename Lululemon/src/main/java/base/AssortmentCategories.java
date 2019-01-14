package base;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AssortmentCategories extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'women')]")
    public static WebElement ViewWomenClothing;
    @FindBy(xpath = "//a[@href='/story/men?mnid=mn;en-US-JSON;men']")
    public static WebElement ViewMenClothing;
    @FindBy(xpath = "//a[contains(text(),'girls')]")
    public static WebElement ViewGirls;
    @FindBy(xpath = "//a[contains(text(),'collections')]")
    public static WebElement ViewCollection;
    @FindBy(xpath = "//a[@class='label with-children']")
    public static WebElement ViewIntimate;
    @FindBy(xpath = "//main[@id='main-content']")
    public static WebElement ViewAccessories;
    @FindBy(xpath = "//a[@class='label with-children']")
    public static WebElement ViewTops;
    @FindBy(xpath = "//a[@class='label with-children']")
    public static WebElement ViewBottoms;
    @FindBy(xpath = "//h1[@class='page-title']")
    public static WebElement ViewWomenAll;
    @FindBy(xpath = "//a[contains(text(),'community')]")
    public static WebElement ViewCommunity;

    public void ViewAssortments() {
        ViewAssortments();

        public void ViewWomenClothing(){
            ViewAssortments();
            ViewWomenClothing.click();
        }
        public void ViewMenClothing (){
            ViewAssortments();
            ViewMenClothing.click();
        }
        public void ViewShoes (){
            ViewAssortments();
            ViewShoes.click();
        }
        public void ViewGirls () {
            ViewAssortments();
            ViewGirls.click();
        }
        public void ViewAccessories () {
            ViewAssortments();
            ViewAccessories.click();
        }
        public void ViewIntimate () {
            ViewAssortments();
            ViewIntimate.click();
        }
        public void ViewBottoms () {
            ViewAssortments();
            ViewBottoms.click();
        }
        public void ViewTops(){
            ViewAssortments();
            ViewTops.click();
        }
        public void ClickViewCollections() {
            ViewAssortments();
            ViewCollection.click();
        }

    }
}