package com.cybertek.tests.day1_navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEtsyTitle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://etsy.com");
        String expectedTitle = "etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = driver.getTitle();
        driver.manage().window().maximize();

        if (expectedTitle.equals(actualTitle)) {

            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("I expected " + expectedTitle);
            System.out.println("The Actual title is "+ actualTitle);

        }
        driver.close();
    }
}
