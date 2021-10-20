package tests.searchAppartment;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Url.HOME_URL_YAD2;


public class searchApartmentTest extends BaseTest {

    @Test
    public void checkRedirectsToList(){
        basePage.open(HOME_URL_YAD2);

        yad2HomePage
                .findFlat()
                .clickSearch();

        listingPage.checkCountFlatsForRent();

    }

}
