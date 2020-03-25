package com.cybertek.tests.day3_locators2;

import com.github.javafaker.Faker;

import java.sql.SQLOutput;

public class FakerPractice {
    public static void main(String[] args) {

       Faker fakeData = new Faker();
        // need firstname

        // this way
        int counter = 0;
        while (counter < 10) {

            String name = fakeData.name().firstName();
            System.out.println("name = " + name);
            counter++;


        }
    }
}