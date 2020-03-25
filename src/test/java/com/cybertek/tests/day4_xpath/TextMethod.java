package com.cybertek.tests.day4_xpath;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextMethod {
    public static void main(String[] args)  {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/context_menu");
        WebElement text = driver.findElement(By.xpath("//h3[text()='Context Menu']"));
        System.out.println(text.getText());

        // Verify -- exect vs actual

        String expectedText = "Context Menu";
        String actualText = text.getText();

        if (expectedText.equals(actualText)) {

            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("expectedText = " + expectedText);
            System.out.println("actualText = " + actualText);
        }

        driver.close();


    }
}
