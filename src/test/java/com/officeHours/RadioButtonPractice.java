package com.officeHours;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPractice {
    public static void main(String[] args) throws Exception{


        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()='Blue']/preceding-sibling::input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[contains(text(),'Yellow']/preceding-sibling::input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[contains(text(),'Green']/preceding-sibling::input")).isEnabled();
        driver.findElement(By.xpath("//label[contains(text(),'Green']/preceding-sibling::input")).click();
        Thread.sleep(2000);
        driver.close();
    }
}