package com.officeHours.practice;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsClassDemo {

    WebDriver driver;
    Actions actions;


    @BeforeMethod

    public void beforeMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        actions = new Actions(driver);
    }
    @AfterMethod

    public void afterMethod(){
        driver.close();
    }
    @Test

    public void hoverTest() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
     Thread.sleep(3000);
     WebElement target = driver.findElement(By.tagName("img"));

     actions.moveToElement(target).perform();

       Thread.sleep(3000);
    }
    @Test
    public void hover2(){

        driver.get("http://practice.cybertekschool.com/jqueryui/menu");
        WebElement enabled = driver.findElement(By.id("ui-id-3"));
        WebElement downloads = driver.findElement(By.id("ui-id-4"));
        WebElement pdf = driver.findElement(By.id("ui-id-5"));

        actions.moveToElement(enabled).pause(2000).moveToElement(downloads).pause(2000).
                moveToElement(pdf).pause(2000).build().perform();

        // move the mouse to enabled
        // wait
        // move the mouse to downloads
        //wait
        // click on PDF
        actions.moveToElement(enabled).pause(1000).moveToElement(downloads).pause(1000).click(pdf);

    }
    @Test

    public void dragAndDrop() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement money = driver.findElement(By.id("draggable"));
        Thread.sleep(3000);
        WebElement bank = driver.findElement(By.id("droptarget"));

        actions.dragAndDrop(money,bank).perform();
        Thread.sleep(3000);
    }
    @Test

    public void dragAndDrop1() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement money = driver.findElement(By.id("draggable"));
        Thread.sleep(3000);
        WebElement bank = driver.findElement(By.id("droptarget"));

        Thread.sleep(2000);

        // scroll
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(money).clickAndHold().moveToElement(bank).release().build().perform();


    }

         /*   TASK

    do the drag and drop by chaining actions

    move mouse to source/money

    mouse down

    move mouse to target/bank

    mouse up

     */
}
