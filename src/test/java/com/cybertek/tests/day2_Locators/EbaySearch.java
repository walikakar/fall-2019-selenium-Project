package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearch {
    public static void main(String[] args) {
        /*
        Task :
        go to amazon https://www.azazon.com/
        go to Ebay https://www.ebay.com/
        Enter a search term
        Click on search button
        Verify title contains search term
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(" https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.navigate().to(" https://www.ebay.com/");

        WebElement SearchBox = driver.findElement(By.name("_nkw"));
        SearchBox.sendKeys("shoes");

       WebElement searchButton = driver.findElement(By.id("gh-btn"));
       searchButton.click();

       String expectedPartialTitle = "shoe";
       String actualTitle = driver.getTitle();
        if (expectedPartialTitle.contains(actualTitle)) {

            System.out.println("Pass, it contains");
        }else {
            System.out.println("Fail, not contains");
            System.out.println("expectedPartialTitle = " + expectedPartialTitle);
            System.out.println("actualTitle = " + actualTitle);
        }




    }
}
