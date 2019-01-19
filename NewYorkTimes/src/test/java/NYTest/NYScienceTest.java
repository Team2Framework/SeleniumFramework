package NYTest;

import NYHome.NYSciencePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class NYScienceTest extends NYSciencePage {
    public void setUp4(@Optional("https://www.nytimes.com/") String url){
    }
    @BeforeMethod
    @Test
    public void verifyScienceTitle() {
        driver.navigate().to("https://www.nytimes.com/");
        driver.findElement(By.name("Science")).click();
        String expectedTitle = "Science - The New York Times";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
