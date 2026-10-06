package com.selenium;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TitanicDebugTest {

    public static void main(String[] args) {

        WebDriver driver = null;

        try {

            ChromeOptions options = new ChromeOptions();

            options.setBinary(
                "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"
            );

            driver = new RemoteWebDriver(
                new URL("http://localhost:49200"),
                options
            );

            String appURL =
                "https://titanic-survival-prediction-awqphahbpmrkn5xd2haysv.streamlit.app/";

            System.out.println("Opening Titanic application...");

            driver.get(appURL);

            Thread.sleep(20000);

            System.out.println("\n=================================");
            System.out.println(" TITANIC STREAMLIT DEBUG");
            System.out.println("=================================");

            System.out.println("TITLE: " + driver.getTitle());
            System.out.println("URL: " + driver.getCurrentUrl());

            // Find all iframes
            int iframeCount =
                    driver.findElements(By.tagName("iframe")).size();

            System.out.println("\nIframe Count: " + iframeCount);

            // Switch to first iframe
            if (iframeCount > 0) {

                WebElement appFrame =
                        driver.findElements(By.tagName("iframe")).get(0);

                System.out.println(
                    "Switching to Streamlit application iframe..."
                );

                driver.switchTo().frame(appFrame);

                Thread.sleep(10000);

                System.out.println(
                    "\n========== INSIDE STREAMLIT IFRAME =========="
                );

                System.out.println(
                    "TITLE: " + driver.getTitle()
                );

                System.out.println(
                    "URL: " + driver.getCurrentUrl()
                );

                // BODY TEXT
                System.out.println(
                    "\n========== BODY TEXT =========="
                );

                String bodyText =
                    driver.findElement(By.tagName("body")).getText();

                System.out.println(bodyText);

                // BUTTONS
                System.out.println(
                    "\n========== BUTTONS =========="
                );

                for (WebElement button :
                        driver.findElements(By.tagName("button"))) {

                    System.out.println(
                        "BUTTON: [" +
                        button.getText() +
                        "]"
                    );
                }

                // INPUTS
                System.out.println(
                    "\n========== INPUTS =========="
                );

                for (WebElement input :
                        driver.findElements(By.tagName("input"))) {

                    System.out.println(
                        "INPUT TYPE: " +
                        input.getAttribute("type") +
                        " | PLACEHOLDER: " +
                        input.getAttribute("placeholder")
                    );
                }

                // TEXTAREAS
                System.out.println(
                    "\n========== TEXTAREAS =========="
                );

                for (WebElement textarea :
                        driver.findElements(By.tagName("textarea"))) {

                    System.out.println(
                        "TEXTAREA: " +
                        textarea.getAttribute("placeholder")
                    );
                }

                // SELECTS
                System.out.println(
                    "\n========== SELECT ELEMENTS =========="
                );

                int selectCount =
                    driver.findElements(By.tagName("select")).size();

                System.out.println(
                    "SELECT COUNT: " + selectCount
                );

                // LINKS
                System.out.println(
                    "\n========== LINKS =========="
                );

                for (WebElement link :
                        driver.findElements(By.tagName("a"))) {

                    System.out.println(
                        "LINK: [" +
                        link.getText() +
                        "]"
                    );
                }

                System.out.println(
                    "\n================================="
                );

                System.out.println(
                    " STREAMLIT DEBUG COMPLETED"
                );

                System.out.println(
                    "================================="
                );

            } else {

                System.out.println(
                    "ERROR: Streamlit iframe not found."
                );
            }

        } catch (Exception e) {

            System.out.println(
                "\nDEBUG ERROR:"
            );

            e.printStackTrace();

        } finally {

            if (driver != null) {
                driver.quit();
            }
        }
    }
}