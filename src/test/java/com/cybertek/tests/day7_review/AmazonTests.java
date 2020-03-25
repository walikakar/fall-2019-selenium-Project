package com.cybertek.tests.day7_review;
import com.cybertek.utillities.WebDriverFactory;
import jdk.javadoc.internal.doclets.formats.html.SearchIndexItem;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTests {
    public static void main(String[] args) throws InterruptedException {
        nameMatchTest();
    }

    /*
    Open Browser
    Go to amazon
    Search for any item
    Remember the name of the first result
    Click on the first result
    Verify that product name is same in the product page
     */

    private static void nameMatchTest() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
        String searchTerm = "disinfectant wipes";
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        //Option-1: Enter search term and press enter...
//        searchInput.sendKeys(searchTerm + Keys.ENTER);

        //Option-2: Enter search term and then find and click the search button.
        searchInput.sendKeys(searchTerm);
        Thread.sleep(2000);
        WebElement searchButton = driver.findElement(By.className("nav-input"));
        searchButton.click(); //--> this will check the functionality of the search button as well.
        WebElement firstResult = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        System.out.println(firstResult.getText());
        String expectedName = firstResult.getText();
        firstResult.click();

        Thread.sleep(2000);
        WebElement productName = driver.findElement(By.id("productTitle"));
        String actualName = productName.getText();

        System.out.println(actualName);

        if(expectedName.equals(actualName)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedName = " + expectedName);
            System.out.println("actualName = " + actualName);
        }

        driver.quit();
    }
}













