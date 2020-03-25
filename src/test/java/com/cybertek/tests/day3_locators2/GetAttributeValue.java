package com.cybertek.tests.day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");

        driver.manage().window().maximize();

        // I want to get the value of type attribute
        // type="text" -> getAttruibute("attribute name")

        // locate username box
        WebElement username = driver.findElement(By.name("username"));

        // <input type="text" name="username">

       String valueOfType = username.getAttribute("type");
       System.out.println("Value Of Type = " + valueOfType);
        WebElement Loginbutton = driver.findElement(By.id("wooden_spoon"));
       String valueOfclass = Loginbutton.getAttribute("class");
       System.out.println("valueOfclass = " + valueOfclass);
       System.out.println(Loginbutton.getAttribute("class"));

        // getText Vs getAttribute
        // getText convert the value to String and get Attribute






    }
}
