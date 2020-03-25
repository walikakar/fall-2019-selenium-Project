package com.cybertek.tests.day4_xpath;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {
    public static void main(String[] args) {


        // go the Practice login page
        // locate username box with absolute xpath
        // locate username box with relative xpath
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
      //  WebElement absulateXpath = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[1]/div/input"));
      //  System.out.println(absulateXpath.getTagName());

        WebElement userName = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[1]/div/input"));
        userName.sendKeys("tom");


        driver.findElement(By.xpath("//input[@type='text'"));
       // WebElement relativeXpath = driver.findElement(By.xpath("//input[@type='text']"));
       // System.out.println(relativeXpath.getTagName());




    }


}
