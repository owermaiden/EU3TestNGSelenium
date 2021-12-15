package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElements {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenRadioBtn = driver.findElement(By.cssSelector("#green"));

        // how to check web element is enabled or not
        Assert.assertFalse(greenRadioBtn.isEnabled(), "verify green is not enabled");

        Thread.sleep(3000L);
        driver.quit();
    }

    @Test
    public void test2() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputDisabled = driver.findElement(By.cssSelector("#input-example>input"));
        inputDisabled.sendKeys("some message");


        Thread.sleep(3000L);
        driver.quit();
    }


}
