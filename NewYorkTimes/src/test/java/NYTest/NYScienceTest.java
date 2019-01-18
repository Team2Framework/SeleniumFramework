package NYTest;

import NYHome.NYSciencePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NYScienceTest extends NYSciencePage {

    @BeforeMethod
    @Test
    public void verifyScienceTitle() {
        String expectedTitle = "Science - The New York Times";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    
}
