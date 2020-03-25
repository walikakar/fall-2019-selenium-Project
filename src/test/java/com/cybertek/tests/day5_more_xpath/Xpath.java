package com.cybertek.tests.day5_more_xpath;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Xpath {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");


        String expectedUrl = "http://practice.cybertekschool.com/multiple_buttons";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {

            System.out.println("Pass");
        }else {
            System.out.println("Fail");

        }

    }
}
