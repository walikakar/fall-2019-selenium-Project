package com.cybertek.tests.day5_more_xpath;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathDemo {
    public static void main(String[] args) {
        //get chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //open url in the browser
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        /*
        WebElement represents an element from a page
        Q. Where the elements come from?
        A. From the findElement methods.
        Q. how findElement finds elements?
        A. Using locators.
         */

        WebElement buttonOne = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        //Start interacting with the element
        String txt = buttonOne.getText();
        System.out.println("txt = " + txt);


        WebElement buttonTwo = driver.findElement(By.xpath("//h3/following-sibling::button[2]")); // combination of two xpath sibling give the second one
        System.out.println("Button Two: " + buttonTwo.getText());

        System.out.println("Button Three: "+driver.findElement(By.xpath("//button[3]")).getText());


//        WebElement buttonThree = driver.findElement(By.xpath(""));
        WebElement buttonFour = driver.findElement(By.xpath("//div/button[4]"));
        String txt_4 = buttonFour.getText();
         WebElement buttonFive = driver.findElement(By.xpath("//button[.='Button 5']"));
        System.out.println(buttonFive.getText());

        // element.getAttribute("value") -- . method to get text form element, used with
        //get text of the element
        WebElement buttonSix= driver.findElement(By.xpath("//button[@id='disappearing_button']"));

        // element.getAttribute("value")  --. method to get text form element, used with input boxes alot

        // get text of the element

        System.out.println(buttonSix.getAttribute("innerHTML"));



        // if none of the works use outerHTML

        System.out.println(buttonSix.getAttribute("outerHTML"));



    }
}





















