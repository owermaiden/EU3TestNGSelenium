package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected(),"verify checkbox is not selected");
        Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected(),"verify checkbox is not selected");
        Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isSelected(),"verify checkbox is not selected");
        Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).isSelected(),"verify checkbox is not selected");
        Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).isSelected(),"verify checkbox is not selected");
        Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected(),"verify checkbox is not selected");
        Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).isSelected(),"verify checkbox is not selected");
        Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).isSelected(),"verify checkbox is not selected");

        driver.findElement(By.cssSelector("#ctl00_MainContent_btnUncheckAll")).click();
        Assert.assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected(),"verify checkbox is not selected");
        Assert.assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected(),"verify checkbox is not selected");
        Assert.assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isSelected(),"verify checkbox is not selected");
        Assert.assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).isSelected(),"verify checkbox is not selected");
        Assert.assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).isSelected(),"verify checkbox is not selected");
        Assert.assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected(),"verify checkbox is not selected");
        Assert.assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).isSelected(),"verify checkbox is not selected");
        Assert.assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).isSelected(),"verify checkbox is not selected");


        driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl03_OrderSelector")).click();
        driver.findElement(By.cssSelector("#ctl00_MainContent_btnDelete")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl03_OrderSelector")).isDisplayed(),"verify element is not exist");

        Thread.sleep(3000L);
        driver.quit();

    }
}
