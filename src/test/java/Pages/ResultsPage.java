package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage {
    WebDriver driver;
    By list= By.className("LC20lb");

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getResult(){
        return driver.findElements(list).size();

    }
}
