package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {
    @Test
    public void test2() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput = driver.findElement(By.cssSelector("#username"));
        WebElement startButton = driver.findElement(By.cssSelector("#start > button"));

        System.out.println("usernameInput.isDisplayed() = " + usernameInput.isDisplayed());

        Assert.assertFalse(usernameInput.isDisplayed(),"verify inputbox is Not displayed");
        startButton.click();
        Thread.sleep(5000L);
        Assert.assertTrue(usernameInput.isDisplayed(),"verify inputbox is displayed");


        Thread.sleep(2000L);
        driver.quit();
    }
}
