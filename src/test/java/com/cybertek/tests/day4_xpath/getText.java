package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
    public static void main(String[] args) {


        // webelement is everthing in application may webelement like : email , password, click , and confirmation message.

        // 1. go to forgot password web page


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        /*
        Task :
        1. go to the forgot password page
        2.enter any email
        3. click retve
         */
        //  2.  enter any email
        // locate the email box first
        WebElement emailBox = driver.findElement(By.name("email"));
        // enter email --> SendKeys()
        emailBox.sendKeys("abc@gmail.com");

        //  3. click "retrieve password" bttb
        WebElement submitButton = driver.findElement(By.id("form_submit"));

        submitButton.submit();


        //   4. verify that the confirmation text "Your e-mail's been sent"
        // Your e-mail's been sent!
        String expectedText ="Your e-mail's been sent!";

        WebElement message = driver.findElement(By.name("confirmation_message"));
        // getText () method is used to convert message to String and usually start <h2> </h2>
        String ActualText = message.getText();

        if (expectedText.equals(ActualText)) {

            System.out.println("Pass");
        } else {
            System.out.println("Fail");

        }
        driver.close();
    }
}