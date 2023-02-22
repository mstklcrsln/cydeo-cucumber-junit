package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {
     /*
    this meth will accept int seconds and execute thread sleep
     */

    public static void sleep(int second){
        second *= 1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }


    /*
    this method accepts 3 args
         */
    public static void switchToWindowAndVerify( String expectedInUrl, String expectedIntitle){
        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        // Assert: title contains  etsy
        for (String each :allWindowsHandles){
            Driver.getDriver().switchTo().window(each);
            System.out.println("current url: " + Driver.getDriver().getCurrentUrl());

            if(Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        String actualtitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualtitle.contains(expectedIntitle));

    }

    /*
    this method accepts a string expectedtitle and asserts if it is true
         */

    public static void verifyTitle ( String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

}