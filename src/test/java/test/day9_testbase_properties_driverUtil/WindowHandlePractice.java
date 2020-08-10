package test.day9_testbase_properties_driverUtil;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.base.TestBase;

import java.util.Set;

/*
TC-WarmUp # : Window Handle practice
1. Create a new class called: WindowHandleWarmup
2. Create new test and make set ups
3. Go to : https://www.amazon.com
4. Copy paste the lines from below into your class
5. Create a logic to switch to the tab where Etsy.com is open
6. Assert: Title contains “Etsy”

Lines to be pasted:
((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

These lines will simple open new tabs using something called JavaScriptExecut
and get those pages. We will learn JavaScriptExecutor later as well.
 */
public class WindowHandlePractice extends TestBase { //extends yaparak before method u aldik

    @Test
    public void multiple_window_test(){

        //3. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");

        String mainHandle = driver.getWindowHandle();


        //4. Copy paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        //_blank means open in the new window. new tab te bu google,etsy,facebook u aciyor.==> emin degilim tekrar dinle 10.33
       //it will open websites in the same window
        //new tab  is the same as new window, that is correct.
        //I know that in html _blank used to open something in the new “blank” window:
        //_blank	Opens the linked document in a new window or tab
        //_self	Opens the linked document in the same frame as it was clicked (this is default)
        //_parent	Opens the linked document in the parent frame
        //_top	Opens the linked document in the full body of the window
        //if you remove _blank, it still opens websites in new windows. By default it opens website in a new window.


        //5. Create a logic to switch to the tab where Etsy.com is open
        Set<String> windowHandles = driver.getWindowHandles();


        for (String each : windowHandles) {

            driver.switchTo().window(each);
            System.out.println("current title:" + driver.getTitle());

            if (driver.getCurrentUrl().contains("etsy")){
                // 6. Assert: Title contains “Etsy”
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
               //break;
            }
        }
    }
}
/*
Gurhan'in Kodlari:

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandlePractice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void multiple_window_test(){

        driver.get("https://www.amazon.com");

        // we are downcasting our driver to JavascriptExecutor to be able to use its methods.
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        //5. Create a logic to switch to the tab where Etsy.com is open
        Set<String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {

            driver.switchTo().window(each);
            System.out.println("current title:" + driver.getTitle());

            if (driver.getCurrentUrl().contains("etsy")){
                // 6. Assert: Title contains “Etsy”
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
                break;
            }

        }

    }

}
 */