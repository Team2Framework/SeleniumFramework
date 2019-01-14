package base;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AssortmentCategories extends CommonAPI {

    @FindBy(css = "#app > div > div > header > a")
    public static WebElement ViewWomenClothing;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/header/section/div[1]/div/div[1]/ul/li[1]/a")
    public static WebElement ViewMenClothing;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/header/section/div[1]/div/div[1]/ul/li[3]/a")
    public static WebElement ViewGirls;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/header/section/div[1]/div/div[1]/ul/li[4]/a")
    public static WebElement ViewCollection;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[1]/div/div[2]/div[2]/div[3]/h4/a")
    public static WebElement ViewIntimate;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[1]/div/div[2]/div[2]/div[4]/h4/a")
    public static WebElement ViewAccessories;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/h4/a")
    public static WebElement ViewTops;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/h4/a")
    public static WebElement ViewBottoms;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[1]/div/div[2]/div[1]/div/ul/li[7]/a")
    public static WebElement ViewAll;

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
            ViewAll.click();
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
        public void ClickViewCollections () {
            ViewAssortments();
            ViewCollection.click();
        }

    }
}