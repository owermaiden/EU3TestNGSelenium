package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNgAssertionsDemo {

    @Test
    public void test1(){

        System.out.println("first assertion");
        Assert.assertEquals("title", "titl");  // this lie fails...Remainer will not work...

        System.out.println("first assertion");
        Assert.assertEquals("url", "url");

    }

    @Test
    public void test2(){
        Assert.assertEquals("ssss", "ssss"); // this line will not be affected from failing of test1
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("close the browser");
    }
}
