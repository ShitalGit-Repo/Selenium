package com.ex01SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver ;
import org.testng.Assert ;
import org.testng.annotations.Test;

public class SeleniumTest01 {

    @Test
    public void Test_Code () {
        Assert.assertEquals("promod","Promod");
    }
    @Test
    public void Test_openTestingAcademy () {
        FirefoxDriver driver = new FirefoxDriver() ;
        driver.get("https://thetestingacademy.com");
    }
}
