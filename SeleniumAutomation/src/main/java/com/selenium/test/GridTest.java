package com.selenium.test;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

    public static void main(String[] args) throws Exception {

        ChromeOptions options = new ChromeOptions();

        options.setBinary(
            "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"
        );

        WebDriver driver = new RemoteWebDriver(
            new URL("http://localhost:4444"),
            options
        );

        driver.get("https://www.google.com");

        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
}