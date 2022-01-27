package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    // amazon.com
    // selenium ara
    // click search
    // verify 1-48 of 304 results for "selenium

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        String search = "selenium";

        WebElement input = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        input.sendKeys("selenium");

        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

        WebElement searchResult = driver.findElement(By.xpath("//span[contains(.,'results for')]"));
        String resultText = searchResult.getText();

        String actualText = "verify 1-48 of 304 results for "+search ;

        if (resultText.equalsIgnoreCase(actualText)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.quit();


    }
}
