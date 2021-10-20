package pages.Yad2_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class Yad2HomePage extends BasePage {

    public Yad2HomePage (WebDriver driver) {

        super(driver);
    }

    private final By typeOfAsset = By.xpath("//div[@class='y2_dropdown field_dropdown open right']/div[@class='dropdown_btn']/button[@class='field_drop_button']/span");
    private final By flat = By.xpath("//li[@class='checkbox_slot'][1]/div[1]/label[1]/input[@class='checkbox']");
    private final By select = By.xpath("//div[@class='drop_footer']/button[@class='y2_btn tertiary']/span[@class='button_content']/span[text()='בחירה']");
    private final By searchButton = By.xpath("//li[@class='search_column col_x2'][2]/button");

    //methods
    public  Yad2HomePage findFlat(){
        driver.findElement(typeOfAsset).click();
        driver.findElement(flat).click();
        driver.findElement(select).click();

        return this;
    }

    public  Yad2HomePage clickSearch(){  //to use wait method

        WebElement btnSearch = driver.findElement(searchButton);
        waitElementToBeVisible(btnSearch).click();

        return this;
    }
}

