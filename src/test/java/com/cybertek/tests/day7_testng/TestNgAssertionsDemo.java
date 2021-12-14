package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAssertionsDemo {

    @Test
    public void test1(){
        Assert.assertEquals("title", "titl");
    }
}
