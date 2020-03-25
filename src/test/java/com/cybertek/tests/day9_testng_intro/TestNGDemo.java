package com.cybertek.tests.day9_testng_intro;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGDemo {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Before suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Before Method");
    }

    @Test (priority = 3)
    public void test1(){
        String word1 = "java";
        String word2 = "java";
        System.out.println("Test1");
        Assert.assertEquals(word1,word2);
    }
    @Test (priority = 2)
    public void test2(){
        String word1 = "javaScript";
        String word2 = "javaScript";
        System.out.println("Test2");
        Assert.assertEquals(word1,word2);
    }
     @Test (priority = 1)
    public void test3(){
        Assert.assertTrue(15 >10);
    }
    @AfterMethod
    public void teardown(){
        System.out.println("After Method");

    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("After Suit");
    }
}
