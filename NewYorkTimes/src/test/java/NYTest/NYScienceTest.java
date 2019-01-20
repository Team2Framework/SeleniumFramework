package NYTest;

import NYHome.NYSciencePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import java.io.IOException;

public class NYScienceTest extends NYSciencePage {
    NYSciencePage nyscience = PageFactory.initElements(driver, NYSciencePage.class);
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
    public void screenShot() throws IOException, InterruptedException {
        nyscience.scienceScreenshot();
    }
    public void photo1() throws InterruptedException {
        nyscience.setPhotos();
    }
    public void photo2() throws InterruptedException {
        nyscience.setPhotos1();
    }
    public void photo3() throws InterruptedException {
        nyscience.setPhoto2();
    }
}
