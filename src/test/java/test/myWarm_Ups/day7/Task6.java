package test.myWarm_Ups.day7;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Task6 {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        //TC#6: Cybertek registration form confirmation
        //Note: Use JavaFaker when possible.
        //1. Open browser
        //2. Go to website: http://practice.cybertekschool.com/registration_form

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    //3. Enter first name
    @Test(priority = 1)
    public void registration() {
        Faker faker = new Faker();
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());

        //4. Enter last name
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys(faker.name().username().replace(".",""));

        //6. Enter email address
        WebElement emailAdress= driver.findElement(By.xpath("//input[@name='email']"));
        emailAdress.sendKeys(faker.internet().emailAddress());

        //7. Enter password
        WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());

        //8. Enter phone number
        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys(faker.phoneNumber().phoneNumber().replace(".","-"));

        //9. Select a gender from radio buttons
        WebElement femaleGender = driver.findElement(By.xpath("//input[@value='female']"));
        femaleGender.click();

        //10. Enter date of birth
        WebElement DOB = driver.findElement(By.xpath("//input[@name='birthday']"));
        DOB.sendKeys("1/5/1985");

        //11. Select Department/Office
        Select department = new Select(driver.findElement(By.xpath("//select[@name='department']")));
        department.selectByVisibleText("MPDC");

        //12. Select Job Title
        Select jobTitle = new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(5); //QA

        //13. Select programming language from checkboxes
        WebElement programmingLanguage = driver.findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        programmingLanguage.click();

        //14. Click to sign up button
        WebElement signUp = driver.findElement(By.xpath("//button[@id='wooden_spoon']"));
        signUp.click();


    }

    @Test(priority = 2)
    public void verification(){
        //15. Verify success message “You’ve successfully completed registration.” is displayed.

        WebElement successMessage = driver.findElement(By.xpath("//div[@class='alert alert-success']//p"));
        Assert.assertTrue(successMessage.isDisplayed());
    }
}
