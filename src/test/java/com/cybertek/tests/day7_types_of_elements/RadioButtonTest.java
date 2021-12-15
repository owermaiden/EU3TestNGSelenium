package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioBtn = driver.findElement(By.cssSelector("#blue"));
        WebElement red = driver.findElement(By.id("red"));

        // how to check radio button is selected
        System.out.println("blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());
        System.out.println("red.isSelected() = " + red.isSelected());

        // verify blue is selected red is not selected
        Assert.assertTrue(blueRadioBtn.isSelected(),"verify blue button is selected");
        Assert.assertFalse(red.isSelected(), "verify red is not selected");

        // how to click radio buttons
        red.click();

        // verify blue is not selected red is selected
        Assert.assertTrue(red.isSelected(),"verify red button is selected");
        Assert.assertFalse(blueRadioBtn.isSelected(), "verify blue is not selected");

        Thread.sleep(3000L);
        driver.quit();

    }
}
