package com.cybertek.tests.day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText {
    public static void main(String[] args) {

        // locator --> LinkText
        // <a> a tag is

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        driver.manage().window().maximize();


        WebElement example3 = driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));
        String textVersionOfExample3 = example3.getText();

        System.out.println(textVersionOfExample3);

      //  driver.close();

        // linkText vs partialinkTest
        // I want to locate Example3 with only a part of it

        WebElement example3_2 = driver.findElement(By.partialLinkText("Example 3:"));
        String text = example3_2.getText();
        System.out.println(text);


        WebElement cybertekSchool = driver.findElement(By.partialLinkText("School"));
        String SchoolText = cybertekSchool.getText();
        System.out.println(SchoolText);

        WebElement cybertekSchool1 = driver.findElement(By.linkText("Cybertek School"));
        String TextVersion = cybertekSchool1.getText();
        System.out.println(TextVersion);

        // driver.quit();
        // locate the element : Home

        System.out.println(driver.findElement(By.linkText("Home")).getText());
        driver.close();
    }
}
