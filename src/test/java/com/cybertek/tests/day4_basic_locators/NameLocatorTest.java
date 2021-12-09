package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //make browser fullscreen
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement nameInput = driver.findElement(By.name("full_name"));
        nameInput.sendKeys("Mike Smith");

        // put email and click sign-up button
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("ower@gmail.com");

        //lazy way
        //driver.findElement(By.name("email")).sendKeys("ower@gmail.com");

        WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();


        driver.quit();
    }
}
