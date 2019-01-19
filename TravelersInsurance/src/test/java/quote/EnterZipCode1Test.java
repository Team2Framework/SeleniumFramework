package quote;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.openqa.grid.common.SeleniumProtocol.WebDriver;

public class EnterZipCode1Test extends CommonAPI{

    @Test
    public void zipCode()throws Exception, IOException, SQLException, ClassNotFoundException {
        Public EnterZipCode1(WebDriver driver){
            PageFactory.initElements(driver,this);
        }
        // Entering the zip code and clicking the button
        public void enterZipCode(){
            zipCode.sendKeys("07072");
            startQuoteButton.click();
        }
}
