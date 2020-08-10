package test.myWarm_Ups.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class TC_3_SelectingDateOnDropdownAndVerifying1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //TC #3: Selecting date on dropdown and verifying
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    //3. Select “December 1st, 1921” and verify it is selected.
    //Select year using : visible text
    //Select month using : value attribute
    //Select day using : index number
    @Test
    public void SelectingDateOnDropdownVerification() {
        Select selectYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        selectYear.selectByVisibleText("1921");
        Assert.assertEquals(selectYear.getFirstSelectedOption().getText(),"1921");

        Select selectMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        selectMonth.selectByValue("11");
        Assert.assertEquals(selectMonth.getFirstSelectedOption().getText(),"December");

        Select selectDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        selectDay.selectByIndex(0);
        Assert.assertEquals(selectDay.getFirstSelectedOption().getText(),"1");



    }
}
