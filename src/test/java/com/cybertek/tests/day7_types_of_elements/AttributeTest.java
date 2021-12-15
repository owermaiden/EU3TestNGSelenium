package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributeTest {
    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioBtn = driver.findElement(By.cssSelector("#blue"));

        // get the value of attribute
        System.out.println("blueRadioBtn.getAttribute(\"type\") = " + blueRadioBtn.getAttribute("type"));
        // checked attribute will return true or false
        System.out.println("blueRadioBtn.getAttribute(\"checked\") = " + blueRadioBtn.getAttribute("checked"));

        System.out.println("blueRadioBtn.getAttribute(\"outerHTML\") = " + blueRadioBtn.getAttribute("outerHTML"));
        System.out.println("blueRadioBtn.getAttribute(\"innerHTML\") = " + blueRadioBtn.getAttribute("innerHTML"));

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button2 = driver.findElement(By.xpath("//button[@name='button2']"));
        System.out.println("button2.getAttribute(\"innerHTML\") = " + button2.getAttribute("innerHTML"));
        String innerHtml = button2.getAttribute("innerHTML");
        Assert.assertTrue(innerHtml.contains("Button"));

        Thread.sleep(3000L);
        driver.quit();

    }
}
