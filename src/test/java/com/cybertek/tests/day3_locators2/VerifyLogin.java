package com.cybertek.tests.day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.manage().window().maximize();

        driver.findElement(By.id("wooden_spoon")).click();

        WebElement welcomeMassage = driver.findElement(By.tagName("h4"));

        String expectedMassage = "Welcome to the Secure Area. when you are done click logout below.";
        //
        String actualWelcomeMessage = welcomeMassage.getText(); // getText() -- convert weElement to String

        if (expectedMassage.equalsIgnoreCase(actualWelcomeMessage)) {

            System.out.println("pass");
        } else {
            System.out.println("Fail");
            System.out.println("expectedMassage = " + expectedMassage);
            System.out.println("actualWelcomeMessage = " + actualWelcomeMessage);
        }

        driver.quit();
    }
}
