package com.cybertek.utillities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {


    // write a return method which return webDriver
    // name : getDriver
    // it takes a String as parameter --> browser type
    // returns ChromeDriver and FirefoxDriver

    public static WebDriver getDriver(String browserType) {

        WebDriver driver = null;   // local variables

        switch (browserType.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver();
                driver = new FirefoxDriver();

        }
      return driver;
    }
}

