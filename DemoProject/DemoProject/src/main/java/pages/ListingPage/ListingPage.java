package pages.ListingPage;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class ListingPage extends BasePage {

    public ListingPage(WebDriver driver) {  //constructor
        super(driver);
    }

    private  final By flatForRent = By.xpath("//div[@class ='rows']");

    public ListingPage checkCountFlatsForRent(){
        int count = driver.findElements(flatForRent).size();
        Assert.assertEquals(count,39);

        return this;
    }
}
