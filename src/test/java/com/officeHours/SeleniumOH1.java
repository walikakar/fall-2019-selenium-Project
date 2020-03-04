package com.officeHours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SeleniumOH1 {

    /*
    -Iterator
        - List, Set , Map and other types of collections can use Iterator class to iterate over that colletion
        -Lis has indexes (for i, for each , while , Iterator)
        -Map(for each , Iterator- to loop through keys)

     */
    public static void main(String[] args) {
        // create arrayList of Strings - iterate over it
        ArrayList <String> KeysToSearch = new ArrayList<>();
        KeysToSearch.add("fruits");
        KeysToSearch.add("veggies");
        KeysToSearch.add("berries");
        // iterator() - return Iterator type which we can use with all iterator methods
        //[fruits, veggies, berries]
        Iterator <String> smallIterator = KeysToSearch.iterator();

        while (smallIterator.hasNext()){
            System.out.println(smallIterator.next());


        }
        // print before modification
        // add * to each String in list before printing
        Iterator <String>iterator = KeysToSearch.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
            System.out.println("*" + item);
        }

        // create a map with <String,String>

        HashMap<String , String > personalInfo = new HashMap<>();

        personalInfo.put("name","Bryan");
        personalInfo.put("student _id","231455566");
        personalInfo.put("major","computer scenice ");

        Iterator <String> mapIterator = personalInfo.keySet().iterator();
        while (mapIterator.hasNext()){
            String key = mapIterator.next();
            System.out.println(key +":"+  personalInfo.get(key));
        }


        // ==========================

        // Selenium
        /* 8 locators in selenium
       1. id - unique (it is not always available) - we always want to use when it is avaible
       2.  class - className
       3. name
        4.tag - every element will have  a tag
        // will only work with the link
       5. linktext
       6.  partial linktext
        locator that is using html (syntaxt)
       7. css
       8. xpath

         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("etsy.com");
        WebElement searchBar = driver.findElement(By.id("global-enhancements-search-query"));
        // findElement() -> returns WebElement
        // as param we put By. locator(value of attribute)
        //  (id,name , className , class......)


    }
}
