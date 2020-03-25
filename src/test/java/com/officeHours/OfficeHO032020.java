package com.officeHours;
import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.logging.StreamHandler;

public class OfficeHO032020 {
    @BeforeMethod
    public void setUp(){
       WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
    }
    //
    @DataProvider(name ="testData")
    public static Object [] testData(){
        return new Object [] {"404","500","301","200"};
    }
    /*
         DataProvider returns data in form of single dimensional Object array (Object [])or 2 dimensional object array (Object [] [])
         Object [] --> When you have only 1 parameter
         Object [] [] --> When you have 2+ parameters
         cannot carry primitive data (int, byte) but it can carry
         wrapper class objects(Integer, Byte)
         statusCode("404") --> run,
         statusCode("500")--> run,
      */
    @Test (dataProvider = "testData")
    public void statusCodes(String code ){
        //Step 2
        WebDriver driver = null;
        WebElement statusCodeLink = driver.findElement(By.linkText("Status Codes"));
        statusCodeLink.click();
        //Step 3
        WebElement statusCode = driver.findElement(By.linkText(code));
        statusCode.click();
        String expectedMessage ="This page returned a "+code+" status code";
        WebElement displayedMessageElement = driver.findElement(By.xpath("//p"));
        String actualMessage = displayedMessageElement.getText();
       /*
            The following is a HARD assertion and contains a message that is displayed only if the assertion fails.
            When a HARD assertion fails the rest of the script is skipped
        */
        Assert.assertTrue(actualMessage.contains(expectedMessage),"The status code does not exist");
    }
    @AfterMethod
    public void tearDown(){
        StreamHandler driver;

    }








}
