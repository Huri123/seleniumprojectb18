package test.day10_jsexecuter_upload_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;
// this method executeScript() helps us pass different JavaScript codes to execute different tasks we want to do
// The following one helps us scroll down a page, then we pass a webEelement (that we located) to scroll to it
//javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", cybertekSchoolLink);

public class JavaScriptExecutorPractices {

    @Test
    public void jsexecutor_test(){

        Driver.getDriver().get("http://practice.cybertekschool.com/");

        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        //cybertekSchoolLink bunu inspect icin practice.cybertekschool sayfasini scroll down yaptik.En altta "Powered by Cybertek School" yaziyor. Orayi inspect yaptik.

        //JavascriptExecutor javascriptExecutor = Driver.getDriver(); //complaining
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver(); //bu yuzden casting yaptik
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",cybertekSchoolLink); //this line just makes this link visible to user, because it’s in the bottom of the page
                                                                                                    //Google a "scroll using javascriptexecuter" yazdik.
                                                                                                    //stackoverflow (https://stackoverflow.com/questions/12293158/page-scroll-up-or-down-in-selenium-webdriver-selenium-2-using-java) actik
                                                                                                    //14 deki cozumu kullandik

    }
}
/*
Gurhan'in Kodlari:

mport org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class JavaScriptExecutorPractices {

    @Test
    public void jsexecutor_test() throws InterruptedException{

        Driver.getDriver().get("http://practice.cybertekschool.com/");

        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver();

        Thread.sleep(4000);
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", cybertekSchoolLink);



    }



}
 */
