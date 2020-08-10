package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Loading7Page {

    /*
    TC#40 : Dynamically Loaded Page Elements 7
        1. Go to http://practice.cybertekschool.com/dynamic_loading/7
        2. Wait until title is “Dynamic Title”
        3. Assert : Message “Done” is displayed.
        4. Assert : Image is displayed.
        Note: Follow POM
     */

    public Loading7Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//strong")
    public WebElement doneMessage;

    @FindBy(xpath = "//img[@class='rounded mx-auto d-block']")
    public WebElement spongeBobImage;

}
/*
Gurhan'in Kodlari:

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Loading7Page {


    public Loading7Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//strong")
    public WebElement doneMessage;

    @FindBy(xpath = "//img[@class='rounded mx-auto d-block']")
    public WebElement spongeBobImage;

}
 */