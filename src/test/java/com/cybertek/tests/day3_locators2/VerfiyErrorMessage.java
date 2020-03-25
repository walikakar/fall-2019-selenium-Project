package com.cybertek.tests.day3_locators2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerfiyErrorMessage {
    public static void main(String[] args) {

        /*
        1. go to login page //http://practice.cybertekschool.com/login
        2. enter invalid username
        3. enter invalid password
        4.verify the error massage
         */

        // testers will gather test data in excel sheet
        // generate data from dummy data website
        // java faker

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Faker fakerData = new Faker();
        String username = fakerData.name().fullName();

        String passWord = fakerData.app().author();
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(passWord);

        driver.findElement(By.id("wooden_spoon")).click();


    }
}
