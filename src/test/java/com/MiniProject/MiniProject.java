package com.MiniProject;

import com.Utils.CommonToAll;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MiniProject extends CommonToAll {

    @Owner("Shital")
    @Severity(SeverityLevel.BLOCKER)
    @Description ("Verify that error message comes with the invalid email on signup")
    @Test
    public void vwo_free_trial_error_verify () {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com");

        WebElement a_tag_partial_match = findElementByPartialText(driver, "trial");
        a_tag_partial_match.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");

        closeBrowser(driver);
    }
}
