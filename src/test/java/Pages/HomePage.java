package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    By searchBar= By.id("lst-ib");
    By searchButton=By.name("btnK");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public ResultsPage searchFor(String search){
        driver.findElement(searchBar).sendKeys(search);
        driver.findElement(searchButton).click();
        return new ResultsPage(driver);
    }
}
