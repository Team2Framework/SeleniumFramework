package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class HomePage extends CommonAPI {

    @FindBy(xpath = ("https://shop.lululemon.com/"))
    public static WebElement ViewWebsite;


    public void ClickViewWebsite() {
        ViewWebsite.click();
    }

    @FindBy(xpath = ("//*[@id=\"icon-logo\"]/path"))
    public static WebElement ViewLogo;

    public void ClickViewLogo() {
        ViewLogo.click();
    }

    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[1]/div/div[1]/ul/li[1]/a"))
    public static WebElement ViewWomen;

    public void ClickViewWomen() {
        ViewWomen.click();
    }

    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[1]/div/div[1]/ul/li[2]/a"))
    public static WebElement ViewMen;

    public void ClickViewMen() {
        ViewMen.click();
    }

    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[1]/div/div[1]/ul/li[3]/a"))
    public static WebElement ViewGirls;

    public void ClickViewGirls() {
        ViewGirls.click();
    }

    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[1]/div/div[1]/ul/li[4]/a"))
    public static WebElement ViewCollections;

    public void ClickViewCollections() {
        ViewCollections.click();
    }

    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[1]/div/div[1]/ul/li[5]/a"))
    public static WebElement ViewCommunity;

    public void ClickViewCommunity() {
        ViewCommunity.click();
    }

    @FindBy(css = ("category-nav-item"))
    public static WebElement ViewBestSellers;

    public void ClickViewBestSellers() {
        ViewBestSellers.click();
    }

    @FindBy(xpath = ("//*[@id=\"main-content\"]/div/ul/div[1]/div/div/div/div/div[2]/div/div/div/nav/div/ul/li[2]/a"))
    public static WebElement ViewTops;

    public void ClickViewTops() {
        ViewTops.click();
    }

    @FindBy(xpath = ("//*[@id=\"main-content\"]/div/ul/div[1]/div/div/div/div/div[2]/div/div/div/nav/div/ul/li[3]/a"))
    public static WebElement ViewBottoms;

    public void ClickViewBottom() {
        ViewBottoms.click();
    }

    @FindBy(xpath = ("//*[@id=\"main-content\"]/div/section/div/div/div[1]/div/nav/div/ul/li[4]/a"))
    public static WebElement ViewAccessories;

    public void ClickViewAccessories() {
        ViewAccessories.click();
    }

    @FindBy(xpath = ("//*[@id=\"main-content\"]/div/ul/div[1]/div/div/div/div/div[2]/div/div/div/nav/div/ul/li[5]/a"))
    public static WebElement ViewViewAll;

    public void ClickViewViewAll() {
        ViewViewAll.click();
    }

    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/footer/nav/div/div[2]/div[1]/ul/li/a"))
    public static WebElement ViewHelpContact;

    public void ClickHelpContact() {
        ViewHelpContact.click();
    }
    @FindBy(xpath = ("//*[@id=\"content-wrapper\"]/div/div/div[1]/ul[1]/li[2]/a"))
    public static WebElement ViewMyAccount;

    public void ClickViewMyAccount() {
        ViewMyAccount.click();
    }
    @FindBy(xpath = ("/html/body/header/div/nav/div[3]/ul/li[3]/a/svg"))
    public static WebElement ViewSearch;

    public void ClickViewSearch() {
        ViewSearch.click();
    }
    @FindBy(xpath = ("//*[@id=\"cart-total-header\"]"))
    public static WebElement ViewCart;

    public void ClickViewCart() {
        ViewCart.click();
    }
    @FindBy(xpath = ("//*[@id=\"content-wrapper\"]/div/div/div[2]/div[1]/ul/li[2]/a"))
    public static WebElement ViewProfile;

    public void ClickViewProfile() {
        ViewProfile.click();
    }
    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[1]/div/div[2]/div[1]/div/ul/li[1]/a"))
    public static WebElement ViewWhatsNew;

    public void ClickViewWhatsNew() {
        ViewWhatsNew.click();
    }
    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[1]/div/div[2]/div[1]/div/ul/li[3]/a"))
    public static WebElement ViewBackInStock;

    public void ClickViewBackInStock() {
        ViewBackInStock.click();
    }
    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[1]/div/div[2]/div[2]/div[3]/h4/a"))
    public static WebElement ViewIntimates;

    public void ClickViewIntimates() {
        ViewIntimates.click();
    }
    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[3]/div/div[1]/div[2]/ul/li[2]/a"))
    public static WebElement ViewGymnastic;

    public void ClickViewGymnastic() {
        ViewGymnastic.click();
    }
    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[3]/div/div[1]/div[2]/ul/li[1]/a"))
    public static WebElement ViewDance;

    public void ClickViewDance() {
        ViewDance.click();
    }
    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[1]/div/div[1]/div[2]/ul/li[1]/a"))
    public static WebElement ViewYoga;

    public void ClickViewYoga() {
        ViewYoga.click();
    }
    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[4]/div/div/div/div[4]/h4"))
    public static WebElement ViewGiftIdeas;

    public void ClickViewGiftIdeas() {
        ViewGiftIdeas.click();
    }
    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/ul/li[5]/a"))
    public static WebElement ViewSweaters;

    public void ClickViewSweaters() {
        ViewSweaters.click();
    }
    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/ul/li[1]/a"))
    public static WebElement ViewShortSleeve;

    public void ClickViewShortSleeve() {
        ViewShortSleeve.click();
    }
    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/ul/li[7]/a"))
    public static WebElement ViewShoes;

    public void ClickViewShoes() {
        ViewShoes.click();
    }
    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[3]/div/div[2]/div[2]/div[3]/ul/li[3]/a"))
    public static WebElement ViewScaves;

    public void ClickViewScarves() {
        ViewScaves.click();
    }
    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[5]/div/div/div/div[3]/h4/a"))
    public static WebElement ViewEvents;

    public void ClickViewEvents() {
        ViewEvents.click();
    }
    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/ul/li[4]/a"))
    public static WebElement ViewTights;

    public void ClickViewTights() {
        ViewTights.click();
    }
    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]/a"))
    public static WebElement ViewJoggers;

    public void ClickViewJoggers() {
        ViewJoggers.click();
    }
    @FindBy(xpath = ("//*[@id=\"app\"]/div/div/header/section/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/ul/li[7]/a"))
    public static WebElement ViewJackets;

    public void ClickViewJackets() {
        ViewJackets.click();
    }
    @FindBy(xpath = ("//*[@id=\"content-wrapper\"]/div/div/div[1]/ul[2]/li/a"))
    public static WebElement ViewSignOut;

    public void ClickViewSignOut() {
        ViewSignOut.click();
    }
}




