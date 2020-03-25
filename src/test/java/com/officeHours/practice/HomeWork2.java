package com.officeHours.practice;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork2 {


    WebDriver driver;

    @BeforeMethod

    public void beforeMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get(" http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();

    }
    @Test
    public void checkedTest(){

      //  WebElement checkbox = driver.findElement(By.tagName("Checkbox"));


    }


    /*
      DAYS
1. go to  http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox
 2. Randomly select a checkbox. As soon as you check any day, print the name of the day and uncheck immediately.
 After you check and uncheck Friday for the third time, exit the program.
NOTE: Remember some checkboxes are not selectable.
You need to find a way to ignore them when they are randomly selected. It has to be dynamic. Do not hard code Saturday and Sunday.
 Use values of certain attributes.
     */

}
