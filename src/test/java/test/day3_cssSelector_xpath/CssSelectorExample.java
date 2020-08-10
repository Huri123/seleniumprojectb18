package test.day3_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class CssSelectorExample {

    public static void main(String[] args) throws InterruptedException {

        //Search Amazon
        //1.Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://amazon.com
        driver.get("https://www.amazon.com");
        //3. Enter any search term (use cssSelector to locate search box)
        WebElement amazonSearch = driver.findElement(By.cssSelector("input[tabindex='19']"));
        amazonSearch.sendKeys("wooden spoon" + Keys.ENTER);
        //4.Verify title contains the search term
        String actualTitle = driver.getTitle();
        String expectedInTitle = "wooden spoon";

        Thread.sleep(1000);//Bunu yaptik cunku bunu yapmadan fail diyor. yani browser yuklemeden check etti.it is because of speed.
                                //Bu islemedeydi actual title i yazdirip control etmemiz gerekiyordu
        if (actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }


    }
}