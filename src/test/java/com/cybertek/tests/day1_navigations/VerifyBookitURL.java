package com.cybertek.tests.day1_navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBookitURL {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();

        String ExpectedUrl = "cybertek-reservation";
        String ActualUrl = driver.getCurrentUrl();
        if (ExpectedUrl.contains(ActualUrl)) {

            System.out.println("Pass, it contains");
        }else {
            System.out.println("Fail, it not contains");
            System.out.println("ExpectedUrl = " + ExpectedUrl);
            System.out.println("ActualUrl = " + ActualUrl);

        }
        driver.close();
    }
}
