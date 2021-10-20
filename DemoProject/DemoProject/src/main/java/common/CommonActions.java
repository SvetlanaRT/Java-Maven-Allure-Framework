package common;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static common.Config.PLATFORM_AND_BROWSER;
import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;


public class CommonActions {

    public static WebDriver createDriver(){
        WebDriver driver = null;
        switch(PLATFORM_AND_BROWSER) {
            case "Wind10_Chrome":
                System.setProperty("webdriver.chrome.driver","C:\\Users\\adlin\\DemoProject\\src\\main\\resources\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                Assert.fail("Incorrect Platform or Browser name:"+ PLATFORM_AND_BROWSER);

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }

}
