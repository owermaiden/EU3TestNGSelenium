package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CheckBoxHw {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();



        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.cssSelector("#ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.cssSelector("#ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.cssSelector("#ctl00_MainContent_login_button")).click();

        driver.findElement(By.cssSelector("#ctl00_MainContent_btnCheckAll")).click();


        for (int i = 1; i < 9 ; i++){
            Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])["+i+"]")).isSelected(),"verify checkbox is not selected");
        }

        driver.findElement(By.cssSelector("#ctl00_MainContent_btnUncheckAll")).click();
        for (int i = 1; i < 9 ; i++){
            Assert.assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])["+i+"]")).isSelected(),"verify checkbox is not selected");
        }

        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        String selected = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]/parent::td/following-sibling::td[1]")).getText();
        driver.findElement(By.cssSelector("#ctl00_MainContent_btnDelete")).click();

        isElementPresent(By.xpath("//td[text()='"+selected+"']"), driver);

        Thread.sleep(3000L);
        driver.quit();

    }

    public boolean isElementPresent(By locatorKey, WebDriver driver) {
        try {
            driver.findElement(locatorKey);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
