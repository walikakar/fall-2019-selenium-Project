package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGmail {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
     //   WebDriver driver = new

       /*

User Story : As a user, .......

Tes case 1: long successfully

1. Go to the VyTrack login page
2. Writer username data : storemanager52
3. write passowrd   user user123
4.click button
5.verify user is on the home page


Test Case2 ; Login invalid credential

1- go to login page
2. write invalid user name
3. write invalid password
4.click login button
5. verify that user see error



 */

       /* driver.get("https://app.vytrack.com/user/login");
        driver.manage().window().maximize();

        WebElement emailBox = driver.findElement(By.id("prependedInput"));
        emailBox.sendKeys("storemanager52");

        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();


      //  driver.quit(); */







    }
}
