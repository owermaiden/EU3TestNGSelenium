package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNgAssertionsDemo {

    @Test
    public void test1(){

        System.out.println("first assertion");
        Assert.assertEquals("title", "title");  // this lie fails...Remainer will not work...

        System.out.println("first assertion");
        Assert.assertEquals("url", "url");
        Assert.assertNotEquals("hhttyy", "sswwee");

    }

    @Test
    public void test2(){
        Assert.assertEquals("ssss", "ssss"); // this line will not be affected from failing of test1

        String expectedTitle = "Cyb";
        String actualTitle = "Cybertek";
        Assert.assertTrue(actualTitle.startsWith(expectedTitle), "verify title starts with Cyb");
    }

    @Test
    public void test3(){

        String email = "mike@smith.com";
        Assert.assertTrue(email.contains("@"), "verify email contains @");
        Assert.assertFalse(0>1, "verify 0 is not greater than 1");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("close the browser");
    }
}
