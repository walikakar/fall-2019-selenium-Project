package com.cybertek.tests.day6_css;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        String url = "http://practice.cybertekschool.com/multiple_buttons";
        driver.get(url);
        driver.manage().window().maximize();

        //Using # to find by ID:
        WebElement button = driver.findElement(By.cssSelector("#disappearing_button"));
        System.out.println(button.getText());

        //Using dot when a class name:
        WebElement homeLink = driver.findElement(By.cssSelector(".nav-link"));
        System.out.println(homeLink.getText());

        //Using dot when a class name contains space(s):
        WebElement resultText = driver.findElement(By.cssSelector(".col-4.col-md-4"));
        System.out.println("resultText: "+resultText.getText());
        //Using dot when a class name contains space(s) -> in different order:
        WebElement resultText2 = driver.findElement(By.cssSelector(".col-md-4.col-4"));
        System.out.println("resultText2: "+resultText2.getText());

        //Using Tag Name:
        WebElement tagName = driver.findElement(By.cssSelector("h4"));
        System.out.println("tagName: "+tagName.getText());
        WebElement tagName2 = driver.findElement(By.cssSelector("button"));
        System.out.println("tagName2: "+tagName2.getText());

        // Child or Descendant
        // in xPath ==> /html/body/nav/ul/li/a
        // in CSS
        // 1. ==> html>body>nav>ul>li>a
        // 2. ==> html body nav ul li a

        WebElement cssPath = driver.findElement(By.cssSelector("html>body>nav>ul>li>a"));
        System.out.println("cssPath: "+cssPath.getText());
        WebElement cssPath2 = driver.findElement(By.cssSelector("html body nav ul li a"));
        System.out.println("cssPath2: "+cssPath2.getText());


        // css -- > locating by using attribute and value
        WebElement cssPath3 = driver.findElement(By.cssSelector("button[onclick='button1()']"));
        System.out.println("cssPath3: "+cssPath2.getText());


        // css--> locating by using attribute any tag without using a Tag name
        WebElement cssPath4 = driver.findElement(By.cssSelector("[onclick='button1()']"));
        System.out.println("cssPath4: "+cssPath2.getText());

        // css --> locating element with a dynamic values
        // Starts with     xpath //button[@start-with(@id, 'button_')
        // css E[A^='t']
       // button[id^='button_']
        WebElement cssPath5 = driver.findElement(By.cssSelector("button[id^='button_']"));
        System.out.println("cssPath5: "+cssPath2.getText());

        // css --> locating element with a dynamic values
        // ends with     xpath //button[@ends-with(@id, 'button_')
        // css E[A$='t']
        // button[id$='button_']
        //CSS --> Locating element by ends with:  E[A$='t'] --> use $ for ends with...
        WebElement dynBtn4 = driver.findElement(By.cssSelector("button[id$='_button"));
        System.out.println("dynBtn4 = " + dynBtn4.getText());

        //CSS --> Locating element by contains:  E[A*='t'] --> use *  for contains...
        WebElement dynBtn_4 = driver.findElement(By.cssSelector("button[id*='_button"));
        System.out.println("dynBtn_4 = " + dynBtn_4.getText());

        //CSS --> locate by Index: E:nth-of-type(2)
        WebElement btnNumber2 = driver.findElement(By.cssSelector("button:nth-of-type(2)"));
        System.out.println("btnNumber2 = " + btnNumber2.getText());

        //CSS --> locate the following sibling: ==>   E+*
        WebElement siblingBtn_1 = driver.findElement(By.cssSelector("p+*"));
        System.out.println("siblingBtn_1 = " + siblingBtn_1.getText());

        driver.quit();
    }
}
