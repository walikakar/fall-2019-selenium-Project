package com.cybertek.tests.day1_navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLofPracticeWeb {
    public static void main(String[] args) {
        /*
        1. go to cybertek Practice wesite
        2.verify the URL
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        String expectedURL = "http://practice.cybertekschool.com/";
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)) {

            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("expectedURL = " + expectedURL);
            System.out.println("ActualURL = "+ actualURL);
        }
        driver.close();
    }
}
