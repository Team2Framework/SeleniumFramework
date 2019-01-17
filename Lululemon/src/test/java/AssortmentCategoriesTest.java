import base.AssortmentCategories;
import org.apache.bcel.generic.PUSH;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssortmentCategoriesTest extends AssortmentCategories {

    AssortmentCategories category;

    @BeforeMethod
    public void initElement() {
        category = PageFactory.initElements(driver, AssortmentCategories.class);
    }
    @Test
    public void testViewAll() {
        category.viewAll();
    }
    @Test
    public void testViewMenClothing() {
        category.viewMenClothing();
    }
    @Test
    public void testViewCollection() {
        category.ViewCollections();
   }
    @Test
    public void testViewGirlsClothing() {
        category.ViewGirls();
    }
    @Test
    public void testViewAccessories() {
        category.ViewAccessories();
    }
    @Test
    public void testViewTops() {
        category.ViewTops();
    }
    @Test
    public void testViewBottoms() {
        category.ViewBottoms();
    }
    @Test
    public void testViewIntimate() {
        category.ViewIntimates();
    }
    @Test
    public void testViewShoes(){
        category.ViewShoes();
    }
    @Test
    public void testViewWomenAll(){
        category.viewWomenAll();
    }
    @Test
    public void viewWomenClothing(){
        category.viewWomenClothing();
    }
    @Test
    public void viewCommunity() {
        category.viewCommunity();
    }
}
