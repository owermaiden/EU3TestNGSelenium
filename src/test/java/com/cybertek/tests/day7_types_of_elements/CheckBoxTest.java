package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.cssSelector("#box1"));
        WebElement checkbox2 = driver.findElement(By.cssSelector("#box2"));
        checkbox1.click();
        checkbox2.click();

        // how to verify checkbox is selected
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        // verify checkbox1 is selected checbox2 is not selected
        Assert.assertTrue(checkbox1.isSelected(),"verify checkbox1 is selected");
        Assert.assertFalse(checkbox2.isSelected(), "verify checkbox2 is not selected");


        Thread.sleep(3000L);
        driver.quit();

    }
}
