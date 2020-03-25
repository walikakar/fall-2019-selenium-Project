package com.officeHours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3LinkedText {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();


        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();

        Thread.sleep(3000);

        String expectedLogin = "Practice";
        String actualLogin = driver.getTitle();
        if (expectedLogin.equalsIgnoreCase(actualLogin)) {

            System.out.println("Test is pass");

        }else {
            System.out.println("Test is fail");
            System.out.println("expectedLogin = " + expectedLogin);
            System.out.println("actualLogin = " + actualLogin);
        }

        driver.close();
      /* WebElement example5 = driver.findElement(By.linkText("Example 2: Element on the page that is rendered after the trigger"));
        String Textversion2 = example5.getText();

        System.out.println(Textversion2);
        //System.out.println(example5.getText());
        //driver.navigate().back();
        Thread.sleep(300);

        WebElement example12 = driver.findElement(By.partialLinkText("Cybertek School"));
        System.out.println(example12.getText());
       // driver.close();
        */



    }
}

