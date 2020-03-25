package com.cybertek.utillities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils1 {
     /*
    takes a list of web elements and returns a list of String
     */

     public static List<String> getElementTest(List<WebElement> listEL){
         List<String> list = new ArrayList<>();
         for(WebElement element :listEL){
             list.add(element.getText());

         }
         return list;
     }
}
