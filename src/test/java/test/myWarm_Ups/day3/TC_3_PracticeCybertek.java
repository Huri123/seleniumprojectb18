package test.myWarm_Ups.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_3_PracticeCybertek {
    public static void main(String[] args) {
        //TC #3: PracticeCybertek/ForgotPassword URL verification
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/forgot_password
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 3.Enter any email into input box
        driver.findElement(By.name("email")).sendKeys("www.cybertek@gmail.com");
        // 4.Click on Retrieve password
        driver.findElement(By.id("form_submit")).click();
        // 5.Verify URL contains: Expected: “email_sent”
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "email_sent";
        if (actualURL.contains(expectedURL)) {
            System.out.println("Url verification is PASSED!");
        } else {
            System.out.println("Url verification is FAILED!");
        }

        // 6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent!”
        String actualText = driver.findElement(By.name("confirmation_message")).getText();
        //String expectedText = "Your e-mail’s been sent!"; fail veriyor. ' bu farkli

        //fail veriyor o zaman;
        //System.out.println("actual message: "+actualText); bunu yap calistir.
        //actual message: Your e-mail's been sent! cikacak. sorun ' bu kesme isaretinde.
        // yani requirmenttaki code ile intelliJ deki code farkli cikti. Consoldakini
        //String expectedText = buraya paste yap.  String expectedText ="Your e-mail's been sent!";

        String expectedText ="Your e-mail's been sent!";
        if (actualText.equals(expectedText)) {
            System.out.println("Textbox verification is PASSED!");
        } else {
            System.out.println("Textbox verification is FAILED!");
        }
        // Hint: You need to use getText method for this practice.

        driver.close();
    }
}



