package com.ex02SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest_Assertion_TestNG {

    @Description ("Verify that title is visible")
    @Test
    public void selenium_test_assertion () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

//TestNG Assertion
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com");
//AssertJ

        driver.quit();
    }
}
