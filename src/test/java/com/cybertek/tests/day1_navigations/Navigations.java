package com.cybertek.tests.day1_navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
    public static void main(String[] args) throws InterruptedException {
        /*
        Navigation:
        driver.navigate().to("URL")
        driver.navigate().back()
        driver.navigate().forward()
        driver.navigate().referash()


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();




        String practiceWebURL = "http://practice.cybertekschool.com/";

        // go to practice
        driver.get(practiceWebURL);
        // I want to see the full window
        // I want to see the full window
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        Thread.sleep(3000);


        // go to google
        String GoogleURL = "https://www.google.com";
        driver.navigate().to(GoogleURL);

        Thread.sleep(3000);
        // back to practice

        driver.navigate().back();

        //  driver.navigate().forward()

        driver.navigate().forward();

        driver.navigate().refresh();

        // close driver(); : close one tab in current website

        driver.close();

        // quit();   close all tabs website
        driver.quit();

         */
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();

       String GoogleUrlTitle = "https://www.google.com";
       driver.navigate().to(GoogleUrlTitle);
       driver.manage().window().maximize();
       Thread.sleep(3000);
       String PracticeUrl = "http://practice.cybertekschool.com/";
       Thread.sleep(3000);
       driver.navigate().to(PracticeUrl);
       driver.navigate().forward();
       Thread.sleep(3000);
       driver.navigate().back();
       driver.navigate().refresh();
      // driver.close();

    }
}
