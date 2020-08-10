package test.myWarm_Ups.day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class Alerts_Iframe_Actions {
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        Driver.getDriver().close();
    }

    @Test
    public void double_click(){
        //TC #16: Double Click Test
        //1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        //2. Switch to iframe.
        //3. Double click on the text “Double-click me to change my text color.”
        //4. Assert: Text’s “style” attribute value contains “red”.

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        Driver.getDriver().switchTo().frame("iframeResult");

        WebElement doubleClickOnTheText = Driver.getDriver().findElement(By.xpath("//p[@id='demo']"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(doubleClickOnTheText).doubleClick().perform();


        WebElement afterDoubleClick = Driver.getDriver().findElement(By.xpath("//p[@style='color: red;']"));

        Assert.assertTrue(afterDoubleClick.isDisplayed());

    }
    @Test
    public void tc17_drag_and_drop_test(){

        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //2. Drag and drop the small circle to bigger circle.

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());

        //using actions instance to do drag and drop
        actions = new Actions(Driver.getDriver());

        actions.clickAndHold(smallCircle).moveToElement(bigCircle).release().perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great!”


    }

    @Test
    public void context_click() throws InterruptedException{
        //TC #17: Context Click – HOMEWORK
        //1. Go to https://the-internet.herokuapp.com/context_menu
        //2. Right click to the box.
        //3. Alert will open.
        //4. Accept alert
        //No assertion needed for this practice.

        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        WebElement box = Driver.getDriver().findElement(By.xpath("//div[@id='hot-spot']"));
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(box).perform();
        Alert alert = Driver.getDriver().switchTo().alert();
        Thread.sleep(1000);
        alert.accept();

        //WebElement afterDrop = Driver.getDriver().findElement(By.xpath("//div[.='You did great!']"));
       // Assert.assertTrue(afterDrop.isDisplayed());
    }



}
