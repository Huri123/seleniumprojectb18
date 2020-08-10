package test.Vy_Truck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class UserStory1_oldOne {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        String browser = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browser);
        String URL = ConfigurationReader.getProperty("vytrack_url");
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test(priority = 1)
    public void verify_vehicleInformation() throws InterruptedException{

        String password = ConfigurationReader.getProperty("truckdriver_password");
        String username = "user27";

        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.id("_submit")).click();

    }
    @Test(priority = 2)
    public void verifyFleet() throws InterruptedException{
        WebElement Fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        Thread.sleep(1000);
        Fleet.click();
        WebElement Vehicle = driver.findElement(By.xpath("//span[.='Vehicles']"));
        Thread.sleep(1000);
        Vehicle.click();

    }

    @Test(priority = 3)
    public void verify_click_anyCar() throws InterruptedException{
        WebElement car = driver.findElement(By.xpath("//li[.='Employee Car']"));
        Thread.sleep(1000);
        car.click();

    }


}
