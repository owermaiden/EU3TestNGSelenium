package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xPathLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button2 = driver.findElement(By.xpath("//button[@name='button2']"));
        button2.click();

        WebElement button2b = driver.findElement(By.xpath("//button[@onclick='button2()' and @name='button2']"));
        button2b.click();

        WebElement button1 = driver.findElement(By.xpath("//*[text()='Button 1']"));
        button1.click();

        WebElement button1a = driver.findElement(By.xpath("//button[.='Button 1']"));
        button1a.click();

        WebElement button1b = driver.findElement(By.xpath("//button[contains(text(),'Button 1')]"));
        button1b.click();

        // partial dynamic id
        WebElement button3 = driver.findElement(By.xpath("//button[starts-with(@id,'button_')]"));
        button3.click();

        WebElement button4 = driver.findElement(By.xpath("//button[contains(@id,'_button')][1]"));
        button4.click();

        // parent child relationship -> find p element of div which has container class
        WebElement p = driver.findElement(By.xpath("//div[@class='container']/p"));

        // what if an element is not sibling or there is no parent child relationship between them
        WebElement p1 = driver.findElement(By.xpath("(//p)[1]"));

        Thread.sleep(2000);

        driver.get("http://practice.cybertekschool.com");
        WebElement a = driver.findElement(By.xpath("(//a[contains(text(),'Dynamic')])[1]"));
        a.click();



        Thread.sleep(2000);
        driver.quit();
    }
}
