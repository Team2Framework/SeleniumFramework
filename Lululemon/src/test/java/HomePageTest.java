import base.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {
    HomePage mainPage;

    @BeforeMethod
    public void initElement() {
        mainPage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void testViewWebsite() {
        mainPage.ClickViewWebsite();
    }

        @Test
        public void testViewLogo () {
            mainPage.ClickViewLogo();
        }
        @Test
        public void testViewHome () {
            mainPage.ClickViewMyAccount();
        }
        @Test
        public void testViewCart () {
            mainPage.ClickViewCart();
        }
        @Test
        public void testViewWomen () {
            mainPage.ClickViewWomen();
        }
        @Test
        public void testViewMen () {
            mainPage.ClickViewMen();
        }
        @Test
        public void testViewGirls () {
            mainPage.ClickViewGirls();
        }
        @Test
        public void testViewBestSeller () {
            mainPage.ClickViewBestSellers();
        }
        @Test
        public void testViewBottom () {
            mainPage.ClickViewBottom();
        }
        @Test
        public void testViewMyAccount () {
            mainPage.ClickViewMyAccount();
        }
        @Test
        public void testViewCollections () {
            mainPage.ClickViewCollections();
        }
        @Test
        public void testViewCommunity () {
            mainPage.ClickViewCommunity();
        }
        @Test
        public void testViewProfile () {
            mainPage.ClickViewProfile();
        }
        @Test
        public void testViewSignOut () {
            mainPage.ClickViewSocialImpact();
        }
        @Test
        public void testViewSearch () {
            mainPage.ClickViewSearch();
        }
        @Test
        public void testViewViewAll () {
            mainPage.ClickViewViewAll();
        }
        @Test
        public void testViewAccessories () {
            mainPage.ClickViewAccessories();
        }
        @Test
        public void testViewTops () {
            mainPage.ClickViewTops();
        }


        @Test
        public void testViewJoggers () {
            mainPage.ClickViewJoggers();
        }
        @Test
        public void testViewRunning () {
            mainPage.ClickViewRunning();
        }
        @Test
        public void testViewJackets () {
            mainPage.ClickViewJackets();
        }
        @Test
        public void testViewShortSleeves () {
            mainPage.ClickViewShortSleeve();
        }
        @Test
        public void testViewSweaters () {
            mainPage.ClickViewSweaters();
        }
        @Test
        public void testViewBackInStock () {
            mainPage.ClickViewBackInStock();
        }
        @Test
        public void testViewGiftIdeas () {
            mainPage.ClickViewGiftIdeas();
        }
        @Test
        public void testViewGymnastic () {
            mainPage.ClickViewGymnastic();
        }
        @Test
        public void testViewDance () {
            mainPage.ClickViewDance();
        }
        @Test
        public void testViewIntimates () {
            mainPage.ClickViewIntimates();
        }
        @Test
        public void testViewWhatsNew () {
            mainPage.ClickViewWhatsNew();
        }
        @Test
        public void testViewYoga () {
            mainPage.ClickViewYoga();
        }
        @Test
        public void testViewScarves () {
            mainPage.ClickViewScarves();
        }
        @Test
        public void testViewShoes () {
            mainPage.ClickViewShoes();
        }
        @Test
        public void testViewEvents () {
            mainPage.ClickViewEvents();
        }
        @Test
        public void testSustainability () {
            mainPage.ClickSustainability();
        }


    }

