package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        return browserType.equalsIgnoreCase("chrome") ? new ChromeDriver() : new FirefoxDriver();

    }
}
