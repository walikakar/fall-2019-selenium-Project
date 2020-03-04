package com.cybertek.tests.day1_navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {
    public static void main(String[] args) {
        /*
        1. got Etsy : https://www.etsy.com/
        2. Verify URL
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();

        String expectedURL = "https://www.etsy.com/";
        //for verify title we use getTitle();
        // for verify URL we use currentURL
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)) {

            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("expectedURL " + expectedURL);
            System.out.println("actualURL = " + actualURL);



        }
        driver.close();




    }
}
