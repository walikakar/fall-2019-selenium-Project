package com.cybertek.tests.day1_navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlForYahoo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com/");


        driver.manage().window().maximize();
        String expectYahooUrl = "https://www.yahoo.com/";
        Thread.sleep(3000);

        driver.navigate().to("https://gmail.com/");
        String expectedUrl = "https://gmail.com/";
        Thread.sleep(3000);

        driver.navigate().back();

        String actualYahooUrl = driver.getCurrentUrl();

        if(expectYahooUrl.equals(actualYahooUrl)){
            System.out.println("pass");
        }else {
            System.out.println("Fail");
            System.out.println("expectYahooUrl = " + expectYahooUrl);
            System.out.println("actualYahooUrl = " + actualYahooUrl);

        }
         driver.navigate().forward();
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {

            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("actualUrl = " + actualUrl);
        }

        driver.close();
    }
}
