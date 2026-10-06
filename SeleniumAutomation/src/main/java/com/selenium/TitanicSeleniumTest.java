package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class TitanicSeleniumTest {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        // Chrome location
        options.setBinary(
            "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"
        );

        // ChromeDriver location
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\tanuj\\.cache\\selenium\\chromedriver\\win64\\154.0.8037.57\\chromedriver.exe"
        );

        // ChromeDriver is running on port 9516
        ChromeDriverService service =
                new ChromeDriverService.Builder()
                        .usingPort(49200)
                        .build();

        // Start Chrome
        WebDriver driver = new ChromeDriver(service, options);

        // Open Titanic Survival Prediction app
        driver.get(
            "https://titanic-survival-prediction-awqphahbpmrkn5xd2haysv.streamlit.app/"
        );

        // Print page title
        System.out.println("Page Title: " + driver.getTitle());

        // Keep browser open
        // driver.quit();
    }
}