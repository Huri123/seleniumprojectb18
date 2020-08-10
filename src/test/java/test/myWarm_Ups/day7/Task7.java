package test.myWarm_Ups.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Task7 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        //TC#7: Cybertek “month” dropdown default value
        //1. Open browser
        //2. Go to website: http://practice.cybertekschool.com/dropdowns

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

    @Test
    public void test(){
        //3. Verify default value is always showing the current month
        //o Expected: If currently in June, should show June selected.
        Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Assert.assertEquals(month.getFirstSelectedOption().getText(),"June");
    }
}
