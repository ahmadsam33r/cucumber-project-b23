package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// THIS AIN'T NO TEST CLASS SO WE CAN NOT EXTEND TESTBASE
// IT SIMPLY DOES NOT MAKE SENSE
public class WebOrderUtility {


    public static void login(WebDriver driverParam){

        // BELOW LINE WILL NOT WORK BECAUSE IT WILL OPEN NEW DRIVER EACH TIME
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // enter username
        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // enter password
        driverParam.findElement(By.id("ctl00_MainContent_password")) .sendKeys("test");
        // click login
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    public static void login(WebDriver driverParam, String username ,String password){

        // BELOW LINE WILL NOT WORK BECAUSE IT WILL OPEN NEW DRIVER EACH TIME
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // enter username
        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        // enter password
        driverParam.findElement(By.id("ctl00_MainContent_password")) .sendKeys(password);
        // click login
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    public static void logout(WebDriver driverParam){

        // logout link has id of ctl00_logout
        driverParam.findElement(By.id("ctl00_logout")).click();

    }
}
