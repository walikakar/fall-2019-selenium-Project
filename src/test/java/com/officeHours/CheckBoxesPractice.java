package com.officeHours;

import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class CheckBoxesPractice {
    public static void main(String[] args) throws Exception{
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");

    /*   driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(1)")).click();
       Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(2)")).click();
        Thread.sleep(2000);
        driver.quit();*/
    List<WebElement> checkboxes = (List<WebElement>) driver.findElement(By.xpath("//input[@type='checkbox']"));

    for(WebElement checkbox :  checkboxes){
        Thread.sleep(3000);
        if(!checkbox.isSelected()){
            checkbox.click();
        }
    }
    driver.quit();
    }
}
