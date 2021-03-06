package com.officeHours.practice;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutor {
    WebDriver driver;

    JavascriptExecutor jse;


    @BeforeMethod

    public void beforeMethod() {

        driver = WebDriverFactory.getDriver("chrome");

        jse = (JavascriptExecutor) driver;

    }


    @AfterMethod

    public void afterTest() {

        driver.quit();

    }


    @Test

    public void scroll() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/");


        WebElement link = driver.findElement(By.linkText("Cybertek School"));

        Thread.sleep(2000);

        jse.executeScript("arguments[0].scrollIntoView(true);", link);


        Thread.sleep(2000);

    }
}