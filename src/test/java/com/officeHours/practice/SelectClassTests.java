package com.officeHours.practice;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class SelectClassTests {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }

    @Test

    public void getSelectOptions() throws InterruptedException {

        // FIND THE ELEMENT THAT HAS SELECT TAG
        WebElement dropdown = driver.findElement(By.id("dropdown"));

        // create a select class and providing the constructor using the web element
        Select dropdownList = new Select(dropdown);

        // get the selected option
        WebElement selectOptions = dropdownList.getFirstSelectedOption();
        System.out.println(selectOptions.getText());

        // verify selected option
        Assert.assertEquals(selectOptions.getText(), "Please select an option");


    }

    @Test
    public void selectFromList() throws InterruptedException {

        WebElement dropdown = driver.findElement(By.id("state"));

//ToDO selectByVisibleText --> selects by the text of the option

        Select state = new Select(dropdown);
        state.selectByVisibleText("Virginia");
        Thread.sleep(3000);
        state.selectByVisibleText("New York");
        Thread.sleep(3000);

        state.selectByVisibleText("Florida");
        Thread.sleep(3000);
        state.selectByVisibleText("Vermont");
        Thread.sleep(3000);
        state.selectByVisibleText("Ohio");


        //ToDO selectByIndex--> selects based on the index of the option, 0 based count

        state.selectByIndex(0);
        Thread.sleep(1000);
        state.selectByIndex(1);
        Thread.sleep(1000);
        state.selectByIndex(3);
        Thread.sleep(1000);
        state.selectByIndex(5);
        state.selectByIndex(7);
        Thread.sleep(1000);

        state.selectByValue("VA");

    }

}



