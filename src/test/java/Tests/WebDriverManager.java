package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public  class WebDriverManager {

    public static WebDriver startdriver() {
        System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");

        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
