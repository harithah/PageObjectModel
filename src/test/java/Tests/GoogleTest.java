package Tests;

import Pages.HomePage;
import Pages.ResultsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleTest extends WebDriverManager{
WebDriver driver;
    HomePage homePage;
    ResultsPage resultsPage;

    @BeforeClass
    public void setup(){

       driver= startdriver();
       homePage=new HomePage(driver);
       resultsPage=new ResultsPage(driver);

    }



    @Test
    public void googleSearch() throws InterruptedException {
        driver.get("http://www.google.com");
        resultsPage=homePage.searchFor("Selenium.org");
        Thread.sleep(1000);
        Assert.assertEquals( resultsPage.getResult(),7,"The list is incorrect");

    }

    @AfterClass
    public void shutdown(){
        driver.close();
    }



}
