package base;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AssortmentCategories extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'women')]")
     WebElement ViewWomenClothing;
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
    @FindBy(xpath = "//a[@href='/c/women-shoes/_/N-8f4?Nrpp=9']")
    public static WebElement ViewShoes;
    @FindBy(xpath = "//a[contains(text(),'community')]")
    public static WebElement ViewCommunity;

    public AssortmentCategories(){
        PageFactory.initElements(driver, this);
    }

    public void viewAssortments() {


        public void viewWomenClothing(){

        }
        public void ViewMenClothing (){
            viewAssortments();
            ViewMenClothing.();
        }
        public void ClickViewShoes() {
            viewAssortments();
            ViewShoes.click();
        }
        public void ClickViewGirls() {
            viewAssortments();
            ViewGirls.click();
        }
        public void ClickViewAccessories() {
            viewAssortments();
            ViewAccessories.click();
        }
        public void ClickViewIntimates() {
            viewAssortments();
            ViewIntimate.click();
        }
        public void ClickViewBottoms() {
            viewAssortments();
            ViewBottoms.click();
        }
        public void ClickViewTops() {
           viewAssortments();
            ViewTops.click();
        }
        public void ClickViewCollections(){
            viewAssortments();
            ViewCollection.click();
        }

    }
}