package test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekVerifications {
    public static void main(String[] args) {

        //TC	#2:	Cybertek verifications
        // 1.Open	Chrome browser
        WebDriverManager.chromedriver().setup();

        // 2.Go	to	http://practice.cybertekschool.com
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");


        // 3.Verify	URL	containsExpected: cybertekschool
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="cybertekschool";

        if (actualUrl.contains(expectedUrl)){
            System.out.println("Url verification PASSED!");
        }else{
            System.out.println("Url verification FAILED!!!");
        }

        // 4.Verify	title:	Expected: Practice
        String actualTitle=driver.getTitle();
        String expectedTitle="Practice";

        if (actualUrl.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        driver.close();


    }
}
