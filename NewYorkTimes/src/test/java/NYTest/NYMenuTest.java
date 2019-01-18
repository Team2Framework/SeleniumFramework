package NYTest;

import NYHome.NYHomePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class NYMenuTest extends NYHomePage {

    @Test
    public void getSports() throws InterruptedException {
        menu.click();
        sleep(2);
        sports.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-sports > header > nav > ol > li:nth-child(7) > a")).getText();
        System.out.println(Actual);
    }
    @Test
    public void selectBusiness() throws InterruptedException {
        menu.click();
        sleep(2);
        business.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-business > div.css-8age7h.ekkqrpp0 > section.css-1u611yh.e46isfb1 > div.css-1s5mpje.ekkqrpp1 > div > ol.css-rgzd4z.ekkqrpp2 > li:nth-child(1) > article > div > h2 > a")).getText();
        System.out.println(Actual);
    }
    @Test
    public void selectScience() throws InterruptedException {
        menu.click();
        sleep(2);
        science.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-science > div.css-8age7h.ekkqrpp0 > section.css-1r6mpip.e46isfb1 > div.css-1s5mpje.ekkqrpp1 > ol > li:nth-child(1) > article > div > h2 > a")).getText();
        System.out.println(Actual);
    }
    @Test
    public void selectOpinion() throws InterruptedException {
        menu.click();
        sleep(2);
        opinion.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#stream-panel > div.css-13mho3u > ol > li:nth-child(4) > div > div.css-4jyr1y > a > h2")).getText();
        System.out.println(Actual);
    }
    @Test
    public void selectHealth() throws InterruptedException {
        menu.click();
        sleep(2);
        health.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-health > div.css-8age7h.ekkqrpp0 > section.css-1r6mpip.e46isfb1 > div.css-17r5r0a.ekkqrpp1 > ol > li.css-7cmujy.ekkqrpp3 > article > div > h2 > a")).getText();
        System.out.println(Actual);
    }
    @Test
    public void selectArt() throws InterruptedException {
        menu.click();
        sleep(2);
        arts.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-arts > div.rank > section > div.rank-template.featured-rank-template.template-2 > ol > li:nth-child(2) > article > div > h2 > a")).getText();
        System.out.println(Actual);
    }
    @Test
    public void select() throws InterruptedException {
        menu.click();
        sleep(2);
        arts.click();
        sleep(2);
        String Actual = driver.findElement(By.cssSelector("#collection-arts > div.rank > section > div.rank-template.featured-rank-template.template-2 > ol > li:nth-child(2) > article > div > h2 > a")).getText();
        System.out.println(Actual);
    }

}
