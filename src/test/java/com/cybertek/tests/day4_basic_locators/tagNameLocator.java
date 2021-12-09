package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //make browser fullscreen
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        // driver finds the first input tag every time...Use ctrl+F to find which tag is used how many times
        WebElement nameInput = driver.findElement(By.tagName("input"));
        nameInput.sendKeys("Mike Smith");

        driver.findElement(By.tagName("button")).click();

        Thread.sleep(5000L);


        driver.quit();
    }
}
