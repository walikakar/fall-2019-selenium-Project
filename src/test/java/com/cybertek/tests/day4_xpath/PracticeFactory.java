package com.cybertek.tests.day4_xpath;

import com.cybertek.utillities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class PracticeFactory {
    public static void main(String[] args) {

        // go to google

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("https://google.com");

        driver.close();
    }
}
