package test.day10_jsexecuter_upload_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class Uploading {

    @Test
    public void uploading_test() throws InterruptedException {

        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

        Thread.sleep(3000);

        chooseFile.sendKeys("C:\\Users\\yakup\\Desktop\\test"); //bu path i paste yapmak icin: bilgisayarin altindaki search bar a test(upload edecegin file) yaz.Right click+copy full path yap. buraya paste et.

        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-submit"));
        fileUpload.click();

        WebElement uploadedMessage = Driver.getDriver().findElement(By.xpath("//div[@class='example']/h3"));

        Assert.assertTrue(uploadedMessage.isDisplayed());




    }
}
/*
Gurhan'in Kodlari:
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class Uploading {

    @Test
    public void uploading_test() throws InterruptedException{

        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

        Thread.sleep(3000);

        chooseFile.sendKeys("/Users/cybertekchicago-1/Desktop/test");

        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-submit"));
        fileUpload.click();

        WebElement uploadedMessage = Driver.getDriver().findElement(By.xpath("//div[@class='example']/h3"));

        Assert.assertTrue(uploadedMessage.isDisplayed());


    }


}
 */
