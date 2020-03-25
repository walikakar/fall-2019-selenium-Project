package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
    public static void main(String[] args) {

        /*
        go to forgot password page
        locate
        print out submit
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement retreivePassWordButton = driver.findElement(By.id("form_submit")); // submit
        System.out.println(retreivePassWordButton.getAttribute("type"));   //

        System.out.println(retreivePassWordButton.getAttribute("class")); // radios
        System.out.println(retreivePassWordButton.getAttribute("ID"));

    }

}
