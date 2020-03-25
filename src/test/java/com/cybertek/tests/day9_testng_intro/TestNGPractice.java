package com.cybertek.tests.day9_testng_intro;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGPractice<Public> {

    /*
1. Open browser
2. Go to Vytrack login page
3. Login as a sales manager
4. Verify Dashboard page is open
5. Click on Shortcuts icon
6. Click on link See full list
7. Click on link Opportunities
8. Verify Open opportunities page is open
9. Click on Shortcuts icon
10. Click on link See full list
11. Click on link Vehicle Service Logs
12 Verify error message text is You do not have  permission to perform this action.
13. Verify Shortcut Actions List page is still open
     */

@BeforeClass
public void beforeClass() {
    System.out.println("\tBEFORE CLASS");
}
    @Test
    public void Test1() throws InterruptedException {

        //1. Open browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        //2. Go to Vytrack login page
        driver.get("http://qa3.vytrack.com");


        // 3. Login as a sales manager
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager110");

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");

        password.submit();


        // 4. Verify Dashboard page is open
        String expect = "Dashboard";
        String actual = driver.getTitle();

        Assert.assertEquals(expect, actual);
        Thread.sleep(2000);
     WebElement clickOnShortCut = driver.findElement(By.cssSelector("a[title='Shortcuts']"));
     clickOnShortCut.click();

     //6. Click on link See full list

     WebElement clickOnList = driver.findElement(By.linkText("See full list"));
     clickOnList.click();


     Thread.sleep(2000);
     //7. Click on link Opportunities

        WebElement clickOpp = driver.findElement(By.linkText("Opportunities"));
        clickOpp.click();

       // 8. Verify Open opportunities page is open
        String expect1 = "Open Opportunities";
        String actual1 = driver.getTitle();

        Assert.assertEquals(expect1,actual1);


    }
        @AfterClass
        public void AfterClass(){
            System.out.println("\tAFTER CLASS");
        }
    }



