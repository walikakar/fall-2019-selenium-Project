package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickVsSubmit {
    public static void main(String[] args) {
        /*
            Click()  vs  submit()


        task:
        1. go to forgot password web page
        http://practice.cybertekschool.com/forgot_password
       2.  enter any email
       3. click "retrieve password" bttb

        4. verify the URL is:
        http://practice.cybertekschool.com/email_sent
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // 1. go to forgot password web page
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();

        //  2.  enter any email
        // locate the email box first
        WebElement emailBox = driver.findElement(By.name("email"));
        // enter email --> SendKeys()
        emailBox.sendKeys("abc@gmail.com");

        //  3. click "retrieve password" bttb
        WebElement submitButton = driver.findElement(By.id("form_submit"));

        submitButton.submit();


        //   4. verify the URL is:
        //        http://practice.cybertekschool.com/email_sent
        String expectUrl = "http://practice.cybertekschool.com/email_sent";
        String actualUrl = driver.getCurrentUrl(); // getCurrentUrl() will give us the string

        if (expectUrl.equals(actualUrl)) {

            System.out.println("Pass, Your Expected is matching the Actual URL");
        } else {
            System.out.println("Fail , Your Expected is not matching the Actual URL");
            System.out.println("Expected URL = " + expectUrl);
            System.out.println("Actual URL = " + actualUrl);
        }

        driver.close();



    }
}
