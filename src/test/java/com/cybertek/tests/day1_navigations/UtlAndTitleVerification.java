package com.cybertek.tests.day1_navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtlAndTitleVerification {
    public static void main(String[] args) throws Exception{
            /*
    1. Go to google webstite
2. save the title in a string variable
3. go to Etsy
4. save the Etst Title in a String
5. Navigate back to previouse page
6. Verify the title is same as step 2
7. Navigate forward to previoud page
8.Verify the title is same as step 4
     */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        String ggTitle ="Google";
        driver.manage().window().maximize();

        String ggExpectedTitle ="Google";
        Thread.sleep(3000);
        driver.navigate().to("https://www.etsy.com/");
        Thread.sleep(3000);
        String etsyExpectedTitle ="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        driver.navigate().back();

        String actualGoogleTitle = driver.getTitle();

        if(ggExpectedTitle.equals(actualGoogleTitle)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("actualTitle = " + actualGoogleTitle);
            System.out.println("actualTitle = " + actualGoogleTitle);

        }
        driver.navigate().forward();

        String etsyActualTitle = driver.getTitle();
        if(etsyExpectedTitle.equals(etsyActualTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("etsyExpectedTitle = " + etsyExpectedTitle);
            System.out.println("etsyActualTitle = " + etsyActualTitle);
            
        }
        driver.close();
    }
}
