package test.myWarm_Ups.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class P03_SeleniumEasy_Checkbox {
    public static void main(String[] args) {

        //TC #3: SeleniumEasy Checkbox Verification – Section 2
        //1. Open Chrome browser
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        //3. Verify “Check All” button text is “Check All”
        WebElement checkAll = driver.findElement(By.xpath("//input[@id='check1']"));
        String expected="Check All";
        String actualText=checkAll.getAttribute("value");
        if (actualText.equals(expected)){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }
        //4. Click to “Check All” button
        checkAll.click();
        //5. Verify all check boxes are checked
        //6. Verify button text changed to “Uncheck All”
    }
}
