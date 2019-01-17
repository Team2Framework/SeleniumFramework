import base.MerchandiseSearch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class MerchandiseSearchTest extends MerchandiseSearch {
    //User should be able to search items in the search box and get results
    @Test
    public void searchItems() throws IOException, InterruptedException {
        MerchandiseSearch search = PageFactory.initElements(driver, MerchandiseSearch.class);
        search.searchItemsAndSubmitButton();
    }
}

