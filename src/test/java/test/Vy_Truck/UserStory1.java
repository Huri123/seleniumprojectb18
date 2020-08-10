package test.Vy_Truck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class UserStory1 {

    LoginPage loginPage;

    @Test
    public void vehicle_information_test() throws InterruptedException{

        //1.Verify that truck driver should be able to see all Vehicle information once navigate to Vehicle page.
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
        loginPage = new LoginPage();
        String username=ConfigurationReader.getProperty("truckdriver_username1");
        String password=ConfigurationReader.getProperty("truckdriver_password");
        Thread.sleep(1000);
        loginPage.login(username,password);

        Actions actions = new Actions(Driver.getDriver());
        WebElement fleetModule = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        WebElement Vehicle = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        Thread.sleep(1000);
        actions.moveToElement(fleetModule).moveToElement(Vehicle).click().perform();

        WebElement carInformation = Driver.getDriver().findElement(By.id("container"));
        Assert.assertTrue(carInformation.isDisplayed());

        //2.Verify that when user click on any car on the grid , system should display general information about the car
        WebElement car = Driver.getDriver().findElement(By.xpath("//table//tbody//td[2]")); //gives error
        Thread.sleep(1000);
        car.click();


    }

}
