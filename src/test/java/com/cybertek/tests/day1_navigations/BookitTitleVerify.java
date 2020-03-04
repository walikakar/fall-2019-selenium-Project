package com.cybertek.tests.day1_navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookitTitleVerify {
    public static void main(String[] args) {


         /*
        There are 2 warm up tasks, do it before the class:
Task 1:
1. Go to Bookit login page
https://cybertek-reservation-qa.herokuapp.com/sign-in
2. Verify the title of the page


Task 2:
2. Go to Bookit login page
https://cybertek-reservation-qa.herokuapp.com/sign-in
2. Verify that URL contains “cybertek-reservation”
         */



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();

        String expectedTitle = "bookit";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("FAIL:");
            System.out.println("Expected: "+expectedTitle);
            System.out.println("Actual: "+actualTitle);
        }

        //task2:
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        String words = "cybertek-reservation";
        if(driver.getCurrentUrl().contains(words)){
            System.out.println("Pass, it contains");
        }else{
            System.out.println("Fail, it doesn't contain");
        }
        driver.close();

    }
}
