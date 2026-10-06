package com.selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstSeleniumTest {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        // Chrome location
        options.setBinary(
            "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"
        );

        // ChromeDriver location
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\tanuj\\.cache\\selenium\\chromedriver\\win64\\153.0.8010.52\\chromedriver.exe"
        );

        // Use fixed port 9515
        ChromeDriverService service =
                new ChromeDriverService.Builder()
                        .usingPort(9515)
                        .build();

        // Start Chrome
        WebDriver driver = new ChromeDriver(service, options);

        // Open Google
        driver.get("https://www.google.com");

        // Print title
        System.out.println("Page Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}