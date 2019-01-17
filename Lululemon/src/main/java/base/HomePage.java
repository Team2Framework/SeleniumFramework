package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(xpath = ("https://shop.lululemon.com/"))
    public static WebElement ViewWebsite;
    public void ClickViewWebsite() {
        ViewWebsite.click();
        navigateBack();
    }
    @FindBy(id = ("//*[@id=\"icon-logo\"]/path"))
    public static WebElement ViewLogo;
    public void ClickViewLogo() {
        ViewLogo.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[contains(text(),'women')]"))
    public static WebElement ViewWomen;
    public void ClickViewWomen() {
        ViewWomen.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[@href='/story/men?mnid=mn;en-US-JSON;men']"))
    public static WebElement ViewMen;
    public void ClickViewMen() {
        ViewMen.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[contains(text(),'girls')]"))
    public static WebElement ViewGirls;
    public void ClickViewGirls() {
        ViewGirls.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[contains(text(),'collections')]"))
    public static WebElement ViewCollections;
    public void ClickViewCollections() {
        ViewCollections.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[contains(text(),'community')]"))
    public static WebElement ViewCommunity;
    public void ClickViewCommunity() {
        ViewCommunity.click();
        navigateBack();
    }
    @FindBy(css = ("//h1[@class='page-title']"))
    public static WebElement ViewBestSellers;
    public void ClickViewBestSellers() {
        ViewBestSellers.click();
        //navigateBack();
    }
    @FindBy(xpath = ("//a[@href='/c/women-maintops/_/N-815']"))
    public static WebElement ViewTops;
    public void ClickViewTops() {
        ViewTops.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[@href='/c/women-bottoms/_/N-7yg']"))
    public static WebElement ViewBottoms;
    public void ClickViewBottom() {
        ViewBottoms.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[@href='/c/women-mainaccessories/_/N-81l']"))
    public static WebElement ViewAccessories;
    public void ClickViewAccessories() {
        ViewAccessories.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[@href='/c/women/_/N-7vf']"))
    public static WebElement ViewViewAll;
    public void ClickViewViewAll() {
        ViewViewAll.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[contains(text(),'Sustainability')]"))
    public static WebElement ViewSustainability;
    public void ClickSustainability() {
        ViewSustainability.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[@class='footer-menu__link'][contains(text(),'My Account')]"))
    public static WebElement ViewMyAccount;
    public void ClickViewMyAccount() {
        ViewMyAccount.click();
        navigateBack();
    }
    @FindBy(xpath = ("//*[@id='search-icon']"))
    public static WebElement ViewSearch;
    public void ClickViewSearch() {
        ViewSearch.click();
        navigateBack();
    }
    @FindBy(xpath = ("//span[@class='item-count']"))
    public static WebElement ViewCart;
    public void ClickViewCart() {
        ViewCart.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[@href='/secure/account/profilelandingpage.jsp']"))
    public static WebElement ViewProfile;
    public void ClickViewProfile() {
        ViewProfile.click();
        navigateBack();
    }
    @FindBy(xpath = ("//h1[@class='page-title']"))
    public static WebElement ViewWhatsNew;
    public void ClickViewWhatsNew() {
        ViewWhatsNew.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[contains(text(),'Back In Stock')]"))
    public static WebElement ViewBackInStock;
    public void ClickViewBackInStock() {
        ViewBackInStock.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[contains(text(),'intimates')]"))
    public static WebElement ViewIntimates;
    public void ClickViewIntimates() {
        ViewIntimates.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[contains(text(),'Gymnastics')]"))
    public static WebElement ViewGymnastic;
    public void ClickViewGymnastic() {
        ViewGymnastic.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[contains(text(),'Dance')]"))
    public static WebElement ViewDance;
    public void ClickViewDance() {
        ViewDance.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[@href='/c/women/yoga/_/N-7vfZ1z141d0?activity=true&mnid=mn;en-US-JSON;women;activity;yoga']"))
    public static WebElement ViewYoga;
    public void ClickViewYoga() {
        ViewYoga.click();
        navigateBack();
    }
    @FindBy(xpath = ("//h4[contains(text(),'Gift Ideas')]"))
    public static WebElement ViewGiftIdeas;
    public void ClickViewGiftIdeas() {
        ViewGiftIdeas.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[@href='/c/women-sweaters-and-wraps/_/N-8bn?mnid=mn;en-US-JSON;women;tops;sweaters']"))
    public static WebElement ViewSweaters;
    public void ClickViewSweaters() {
        ViewSweaters.click();
        navigateBack();
    }
    @FindBy(xpath = ("///a[@href='/c/tops-short-sleeve/_/N-8bl?mnid=mn;en-US-JSON;women;tops;short-sleeves']"))
    public static WebElement ViewShortSleeve;
    public void ClickViewShortSleeve() {
        ViewShortSleeve.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[@href='/c/women-shoes/_/N-8f4?mnid=mn;en-US-JSON;women;accessories;shoes']"))
    public static WebElement ViewShoes;
    public void ClickViewShoes() {
        ViewShoes.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[contains(text(),'Scarves + Wraps + Gloves')]"))
    public static WebElement ViewScaves;
    public void ClickViewScarves() {
        ViewScaves.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[contains(text(),'Events')]"))
    public static WebElement ViewEvents;
    public void ClickViewEvents() {
        ViewEvents.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[@href='/c/women-bottoms/running/_/N-7ygZ1z13zha?Nrpp=9']"))
    public static WebElement ViewRunning;
    public void ClickViewRunning() {
        ViewRunning.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[contains(text(),'Joggers')]"))
    public static WebElement ViewJoggers;
    public void ClickViewJoggers() {
        ViewJoggers.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[@href='/c/jackets-and-hoodies-jackets/_/N-8a1?Nrpp=9']"))
    public static WebElement ViewJackets;
    public void ClickViewJackets() {
        ViewJackets.click();
        navigateBack();
    }
    @FindBy(xpath = ("//a[contains(text(),'Social Impact')]"))
    public static WebElement ViewSocialImpact;
    public void ClickViewSocialImpact() {
        ViewSocialImpact.click();
    }

}




