package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class Loading1Page {

    public Loading1Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "pwd")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(id = "loading")
    public WebElement loadingBar;

    @FindBy(id = "flash")
    public WebElement errorMessage;


}
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


/*
Gurhan'in Kodlari:

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Loading1Page {

    public Loading1Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "pwd")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(id = "loading")
    public WebElement loadingBar;

    @FindBy(id = "flash")
    public WebElement errorMessage;




}
 */
