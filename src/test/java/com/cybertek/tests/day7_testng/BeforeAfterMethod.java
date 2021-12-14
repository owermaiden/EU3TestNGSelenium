package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    @BeforeClass
    public void setUpClass(){
        System.out.println("do something");
    }

    @Test
    public void test1(){
        System.out.println("something");
    }

    @Ignore
    @Test
    public void test2(){
        System.out.println("ignore");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("webdriver vs aç");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("close browser vs..");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("do something after");
    }
}
