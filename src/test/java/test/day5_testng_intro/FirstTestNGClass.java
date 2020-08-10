package test.day5_testng_intro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGClass {

    @BeforeMethod
    public void setUp(){  //bu methodun adi genelde setUp olur
        System.out.println("Before method is running...");
    }

    @AfterMethod
    public void tearDown(){  //bu methodun adi genelde tearDown olur  tear down means finalize,close,bitirmek
        System.out.println("After method is running...");
    }

    @Test //testNG annotation bu olmazsa normal java method olur. test etmez.test etmesi icin bu annotation un olmasi lazim
    public void test1(){
        System.out.println("Test1 is running...");
    }

    @Test  // it is mandatory to give “@test” annotation for every single method to test and recognize it.
    public void test2(){
        System.out.println("Test2 is running...");
    }
}

//@Test   Attaches a class or a method to become the part of the test.
//@BeforeTest Instructs the method to run before any test method related to the classes which are inside the <test> tag as per the <testng.xml> file.
//@AfterTest  Halts a method from execution till all the test methods finish their execution. These methods belong to the classes defined in the <test> tag of <testng.xml> file.
//@BeforeMethod   Allows a method to run before executing any of the @test annotated methods.
//@AfterMethod    Allows a method to take off after all of the @test annotated methods finish their execution.
//@Parameters You can use this annotation for passing the parameters to the test methods.
//@DataProvider   It marks a method as a data source for the test. Every @DataProvider annotated method must always return the value as <Object[ ][ ]>. You can use it in any of the @Test annotated methods.
//@BeforeClass    The method annotated with @BeforeClass gets executed once before the first test method of the current class.
//@AfterClass The method annotated with @AfterClass gets run once after finishing all the test methods in the current class.
//@BeforeGroups   It sets up the method to run before the first test method belonging to any of the groups involved in the execution.
//@AfterGroups    It sets up the method to run after the execution of all the test methods belonging to any of the groups participating in the test.
//@BeforeSuite    Any such method will get called before any of the suites runs from the test.
//@AfterSuite Any such method will stay its execution until all other methods in the current test suite get executed.
