package com.cybertek.tests.day1_navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args)throws Exception {

       // binary the driver and browsers
        WebDriverManager.chromedriver().setup();

        // WebDriver object --> Interface
        // i have a driver
        WebDriver driver = new ChromeDriver();

        // i want to open Google home page
        // how do you launch / open a web page?
        // by using get() --> url as String
      //  driver.get("https://www.google.com");
       // driver.get("https://www.yahoo.com");

        // Navigation
        // navigate().to () --> open a wep page

        driver.navigate().to("https://www.google.com");
        // get() vs navigate().to()
        // get--> wait to load the page
        //to () does not wait
        // navigate().back() --> back
        // go to google 2. got to cybertek practice website

        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.navigate().to("http://practice.cybertekschool.com/");
        Thread.sleep(1000);
        driver.navigate().back();

        // navigate().forward()
        // go to practice -- > google --> back to practice -- > forward to google
        driver.navigate().forward();

        /* WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();

         driver.get("https://www.google.com");
         Thread.sleep(3000);
         driver.navigate().to("https://www.yahoo.com");
         Thread.sleep(3000);
         driver.navigate().forward();
         driver.navigate().back(); */

    }
}
