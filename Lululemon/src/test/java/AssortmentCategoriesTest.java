import base.AssortmentCategories;
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

        category.ViewAssortments();
    }
    @Test
    public void testViewMenClothing() {

        category.ViewAssortments();
    }
    @Test
    public void testViewCollection() {
        category.ViewAssortments();
    }
    @Test
    public void testViewGirlsClothing() {

        category.ViewAssortments();
    }
    @Test
    public void testViewAccessories() {

        category.ViewAssortments();
    }
    @Test
    public void testViewTops() {

        category.ViewAssortments();
    }
    @Test
    public void testViewBottoms() {

        category.ViewAssortments();
    }
    @Test
    public void testViewIntimate() {

        category.ViewAssortments();
    }
}
