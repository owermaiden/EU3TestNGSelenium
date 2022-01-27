package com.cybertek.tests.day6_cssLocator;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //#idValue
        WebElement button = driver.findElement(By.cssSelector("#disappearing_button"));
        button.click();

        // .classValue
        driver.findElement(By.cssSelector(".btn")).getText();

        // multiple class
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();

        // with attribute
        driver.findElement(By.cssSelector("button[onclick='button1()']")).click();

        // css can not locate with text value...

        //starts with ^, ends with $, contains * (for dynamic id )
        driver.findElement(By.cssSelector("button[id^='button_']")).click();  //starts with
        driver.findElement(By.cssSelector("button[id$='_button']")).click();  //ends with
        driver.findElement(By.cssSelector("button[id*='button']")).click();    //contains

        // index of element under the same family (doesn't work)
         driver.findElement(By.cssSelector("button[id$='_button']:nth-of-type(2)")).click();


        Thread.sleep(2000L);
        driver.quit();
    }
}
