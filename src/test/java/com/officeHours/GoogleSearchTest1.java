package com.officeHours;
import java.util.Arrays;
import java.util.List;
import com.cybertek.utillities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchTest1 {
    public static void main(String[] args) {
         /*
1. Open browser
2. Go to https://google.com
3. Search for one of the strings the list searchStrs given below
4. In the results pages, capture the url right above the first result
5. Click on the first result
6. Verify that url is equal to the value from step 4
7. Navigate back
8. Repeat the same steps for all search items in the list
Note: Do this exercise using a for loop. Here is the list that was mentioned step 3:
List<String> searchStrs = Arrays.asList("Java", "cucumber bdd", “Selenium web browser automation" );

     */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");

        List<String> searchStrs = Arrays.asList("Java", "cucumber bdd", "Selenium web browser automation");
        for (String searchitem : searchStrs) {
            WebElement searchStr = driver.findElement(By.name("q"));
            searchStr.sendKeys(searchitem + Keys.ENTER);

            WebElement url = driver.findElement(By.cssSelector(".iUh30.tjvcx"));
          String expectedUrl = url.getText();
            System.out.println(expectedUrl);

           WebElement link = driver.findElement(By.linkText("div.r>a>h3"));
           link.click();

           if(expectedUrl.equals(driver.getCurrentUrl())){
               System.out.println("Pass");
           }else {
               System.out.println("expectedUrl =" + expectedUrl);
               System.out.println(" Actual Url = " + driver.getCurrentUrl());
           }
           driver.close();
        }
    }
}
