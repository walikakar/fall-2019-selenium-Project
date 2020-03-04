package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemet {
    public static void main(String[] args) {

        // task
        // go to cybertek okta login page
        //write email to the text box

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertekschool.okta.com/");
        //write email to the text box
        // write your password into the text box
       // webelement is interface will have abstract method we can store the findElement

        //write email to the text box
       WebElement emailBox =  driver.findElement(By.id("okta-signin-username"));
       emailBox.sendKeys("walikakar1984@gmail.com");

        // write your password into the text box
       WebElement passWord = driver.findElement(By.id("okta-signin-password"));
       passWord.sendKeys("Shabir@123");

      // driver.findElement(By.id("okta-signin-username")).sendKeys("Shabir@123");

       WebElement clickSubmit = driver.findElement(By.id("okta-signin-submit"));
       clickSubmit.submit();



    }
}
