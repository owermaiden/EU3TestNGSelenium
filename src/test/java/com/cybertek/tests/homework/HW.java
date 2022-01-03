package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void testCase1(){
        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//a[@href='/registration_form']")).click();
        WebElement small = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/small[2]"));

        Assert.assertFalse(small.isDisplayed());
        driver.findElement(By.name("birthday")).sendKeys("wrong_dob");
        Assert.assertTrue(small.isDisplayed());
    }

    @Test
    public void testCase2(){
        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//a[@href='/registration_form']")).click();

        List<WebElement> checkboxes = driver.findElements(By.cssSelector(".form-check-label"));
        List<String> actual = new ArrayList<>(Arrays.asList("C++","Java","JavaScript"));
        int i = 0;
        for (WebElement checkbox : checkboxes) {
            Assert.assertEquals(actual.get(i++), checkbox.getText());
        }
    }

    @Test
    public void testCase3(){
        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//a[@href='/registration_form']")).click();
        WebElement ikaz = driver.findElement(By.xpath("//small[@data-bv-for='firstname' and @data-bv-validator='stringLength']"));

        Assert.assertFalse(ikaz.isDisplayed());
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("a");
        Assert.assertTrue(ikaz.isDisplayed());
    }

    @Test
    public void testCase4(){
        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//a[@href='/registration_form']")).click();
        WebElement ikaz = driver.findElement(By.xpath("//small[@data-bv-for='lastname' and @data-bv-validator='stringLength']"));

        Assert.assertFalse(ikaz.isDisplayed());
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("a");
        Assert.assertTrue(ikaz.isDisplayed());
    }

    @Test
    public void testCase5(){
        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//a[@href='/registration_form']")).click();

        driver.findElement(By.name("firstname")).sendKeys("omer");
        driver.findElement(By.name("lastname")).sendKeys("erden");
        driver.findElement(By.name("username")).sendKeys("omer18");
        driver.findElement(By.name("email")).sendKeys("omererden18@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Ankara01");
        driver.findElement(By.name("phone")).sendKeys("571-000-0000");
        driver.findElement(By.xpath("//*[@type='radio'][1]")).click();
        driver.findElement(By.name("birthday")).sendKeys("07/05/1980");

        WebElement dropdownElement = driver.findElement(By.name("department"));
        Select departments = new Select(dropdownElement);
        departments.getFirstSelectedOption().click();

        WebElement jobTypesSelect = driver.findElement(By.name("job_title"));
        Select jobTitles = new Select(jobTypesSelect);
        jobTitles.getFirstSelectedOption().click();

        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String message = "You've successfully completed registration!";

        String realmessage = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/p")).getText();

        Assert.assertEquals(message,realmessage);


    }

    @Test
    public void testCase6() throws InterruptedException {
        driver.get("https://www.tempmailaddress.com/");
        String email = driver.findElement(By.xpath("//span[@id='email']")).getText();
        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//a[@href='/sign_up']")).click();
        driver.findElement(By.name("full_name")).sendKeys("omer erden");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String message = "Thank you for signing up. Click the button below to return to the home page.";
        String actual = driver.findElement(By.name("signup_message")).getText();

        Assert.assertEquals(message,actual);
        driver.get("https://www.tempmailaddress.com/");
        String expected = "Thanks for subscribing to practice.cybertekschool.com!";
        String mailmessage = driver.findElement(By.xpath("//*[@id=\"schranka\"]/tr[1]/td[2]")).getText();
        Assert.assertEquals(expected,mailmessage);

        driver.findElement(By.xpath("//*[@id=\"schranka\"]/tr")).click();

        String actualMail = "do-not-reply@practice.cybertekschool.com";
        String mailadress = driver.findElement(By.xpath("//*[@id=\"odesilatel\"]")).getText();
        Assert.assertEquals(actualMail,mailadress);


    }




}
