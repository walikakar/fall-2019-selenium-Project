package com;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://app.vytrack.com/user/login");
        driver.manage().window().maximize();

        WebElement emailBox = driver.findElement(By.id("prependedInput"));
        emailBox.sendKeys("storemanager52");

        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        // find login Button , and then click
        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();



        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {

            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("actualTitle = " + actualTitle);
        }
        String expectedUrl = "https://app.vytrack.com/";
        String actualUrl= driver.getCurrentUrl();
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
