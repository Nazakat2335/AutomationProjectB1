package com.loop.test.day10_jsexecutor_pom;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T1_JSEexecutor_scroll {

    @Test
    public void test() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy"));

WebElement emailBox = Driver.getDriver().findElement(By.id("email-list-signup-email-input"));
       Actions actions = new Actions(Driver.getDriver());
     //  actions.moveToElement(emailBox).perform();

        //#2 just use Key press
    // actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
  //  actions.scrollToElement(emailBox).perform();


    /*
    /*
    1. Go to https://www.etsy.com
    2. Scroll down
    3. Generate random email and enter into subscribe box
    4. Click on Subscribe
    5. Verify "Great! We've sent you an email to confirm your subscription." is displayed
  */
        JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) Driver.getDriver();

        //#3 move horizontally and vertically
     //js.executeScript("window.scrollBy(0,5000)");

        //#t
        js.executeScript("arguments[0].scrollIntoView(true)",(emailBox));
       // js.executeScript("arguments[0].click",(emailBox));




    }
}