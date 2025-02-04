package test.day12_synchronization;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Loading1Page;
import pages.Loading7Page;
import utilities.Driver;

public class ExplicitWaitPractices {

    @Test
    public void tc40_dynamic_title_test(){
        /*
    TC#40 : Dynamically Loaded Page Elements 7
        1. Go to http://practice.cybertekschool.com/dynamic_loading/7
        2. Wait until title is “Dynamic Title”
        3. Assert : Message “Done” is displayed.
        4. Assert : Image is displayed.
        Note: Follow POM
     */

        String url = "http://practice.cybertekschool.com/dynamic_loading/7";
        Driver.getDriver().get(url);

        Loading7Page loading7Page = new Loading7Page();

        //creating the instance of WebDriverWait to use its methods
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        String expectedTitleToBe = "Dynamic title";
        //we are using the object to set up our EXPECTED CONDITION
        wait.until(ExpectedConditions.titleIs(expectedTitleToBe));

        //done message is displayed
        Assert.assertTrue(loading7Page.doneMessage.isDisplayed());

        //image is displayed
        Assert.assertTrue(loading7Page.spongeBobImage.isDisplayed());





    }

    @Test
    public void tc41_dynamic_form_test() throws InterruptedException{
/*
TC#41 : Dynamically Loaded Page Elements 1
1. Go to http://practice.cybertekschool.com/dynamic_loading/1
2. Click to start
3. Wait until loading bar disappears
4. Assert username inputbox is displayed
5. Enter username: tomsmith
6. Enter password: incorrectpassword
7. Click to Submit button
8. Assert “Your username is invalid!” text is displayed.
Note: Follow POM
 */
            Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");

            Loading1Page loading1Page = new Loading1Page();

            loading1Page.startButton.click();
            //Thread.sleep(10000);

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

            wait.until(ExpectedConditions.invisibilityOf(loading1Page.loadingBar));

            Assert.assertTrue(loading1Page.usernameInput.isDisplayed(), "Username input box is not displayed!");

            loading1Page.usernameInput.sendKeys("asdfasdf");

            loading1Page.passwordInput.sendKeys("SuperSecretPassword");

            loading1Page.submitButton.click();

            Assert.assertTrue(loading1Page.errorMessage.isDisplayed());
    }


}

/*
Gurhan'in Kodlari:

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Loading1Page;
import pages.Loading7Page;
import utilities.Driver;

public class ExplicitWaitPractices {

    /*
    TC#40 : Dynamically Loaded Page Elements 7
        1. Go to http://practice.cybertekschool.com/dynamic_loading/7
        2. Wait until title is “Dynamic Title”
        3. Assert : Message “Done” is displayed.
        4. Assert : Image is displayed.
        Note: Follow POM
     */
    /*
@Test
public void tc40_dynamic_title_test(){
    String url = "http://practice.cybertekschool.com/dynamic_loading/7";
    Driver.getDriver().get(url);

    Loading7Page loading7Page = new Loading7Page();

    //creating the instance of WebDriverWait to use its methods
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    String expectedTitleToBe = "Dynamic title";

    //we are using the object to set up our EXPECTED CONDITION
    wait.until(ExpectedConditions.titleIs(expectedTitleToBe));

    //done message is displayed
    Assert.assertTrue(loading7Page.doneMessage.isDisplayed());

    //image is displayed
    Assert.assertTrue(loading7Page.spongeBobImage.isDisplayed());
    //BREAK UNTIL 3.05 PM EST




}

    /*
    TC#41: Dynamically Loaded Page Elements 1
    1.Go to http://practice.cybertekschool.com/dynamic_loading/1
    2.Click to start
    3.Wait until loading bar disappears
    4.Assert username input box is displayed
    5.Enter username: tomsmith
    6.Enter password: incorrectpassword
    7.Click to Submit button
    8.Assert "Your username is invalid!" text is displayed.
     */
    /*
    @Test
    public void tc41_dynamic_form_test() throws InterruptedException{
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");

        Loading1Page loading1Page = new Loading1Page();

        loading1Page.startButton.click();
        //Thread.sleep(10000);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        wait.until(ExpectedConditions.invisibilityOf(loading1Page.loadingBar));

        Assert.assertTrue(loading1Page.usernameInput.isDisplayed(), "Username input box is not displayed!");

        loading1Page.usernameInput.sendKeys("asdfasdf");

        loading1Page.passwordInput.sendKeys("SuperSecretPassword");

        loading1Page.submitButton.click();

        Assert.assertTrue(loading1Page.errorMessage.isDisplayed());

        //break until 4.10pm est


    }

}
 */