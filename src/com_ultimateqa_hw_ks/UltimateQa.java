package com_ultimateqa_hw_ks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Project-5 - ProjectName : com-utimateqa
BaseUrl = https://courses.ultimateqa.com/
1. Setup chrome browser.
2. Open URL.
3. Print the title of the page.
4. Print the current url.
5. Print the page source.
6. Click on ‘Sign In’ link
7. Print the current url
8. Enter the email to email field.
9. Enter the password to password field.
10. Click on Login Button.
11. Navigate to baseUrl.
12. Navigate forward to Homepage.
13. Navigate back to baseUrl.
14. Refresh the page.
15. Close the browser.
 */
public class UltimateQa {

    static String baseUrl = "https://courses.ultimateqa.com/";

    public static void main(String[] args) {
        //1. Setup chrome browser.
        ChromeDriver driver = new ChromeDriver();
        // 2. Open URL.
        driver.get(baseUrl);
        //3. Print the title of the page.
        System.out.println("The title of the page: " + driver.getTitle());
        //4. Print the current url.
        System.out.println("The current url: " + driver.getCurrentUrl());
        //5. Print the page source.
        System.out.println("The page source: " + driver.getPageSource());
        //6. Click on 'Sign In' link
        WebElement signLink = driver.findElement(By.linkText("Sign In"));
        signLink.click();
        //7. Print the current url
        System.out.println("Sign In Url: " + driver.getCurrentUrl());
        //8. Enter the email to email field.
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("xyz@gmail.com");
        //9. Enter the password to password field.
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("xyz123");
        //10 Click on Login Button.
        WebElement loginButton = driver.findElement(By.linkText("Sign In"));
        loginButton.click();
        //11. Navigate to baseUrl.
        driver.navigate().to(baseUrl);
        //12. Navigate forward to Homepage.
        driver.navigate().forward();
        //13. Navigate back to baseUrl.
        driver.navigate().to(baseUrl);
        // 14. Refresh the page.
        driver.navigate().refresh();
        //15. Close the browser.
        driver.quit();
    }
}
