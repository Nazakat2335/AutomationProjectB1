package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_allerts  extends TestBase {

/*
    Information alert practice
    1. Open browser
    2. Go to website: http://the-internet.herokuapp.com/javascript_alerts
    3. Click to “Click for JS Alert” button
    4. Click to OK button from the alert
    5. Verify “You successfully clicked an alert” text is displayed

    Confirmation alert practice
    1. Click to “Click for JS Confirm” button
    2. Click to OK button from the alert
    3. Verify “You clicked: Ok” text is displayed.

    Prompt alert practice
    1. Click to “Click for JS Prompt” button
    2. Send "Loop Academy"
    3. Click Ok
    4. Validate "You entered: Loop Academy" text is displayed
*/
    @Test
    public void informationAlert() throws InterruptedException {

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        WebElement clickForJSAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
        clickForJSAlert.click();
        Alert alert = driver.switchTo().alert();
        // driver.switchTo().alert().accept();
        Thread.sleep(3000);
        alert.accept();
        WebElement successMessageForInformationAlert= driver.findElement(By.xpath("//p[@id='result']"));
        String actual=successMessageForInformationAlert.getText();

        String expected="You successfully clicked an alert";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void confirmationAlert() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        WebElement clickForJSConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
        clickForJSConfirm.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        WebElement successMessageConfirmationAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = successMessageConfirmationAlert.getText();
        String expected = "You clicked: Ok";
        Assert.assertEquals(expected, actual,"expected does not match the actual");
        clickForJSConfirm.click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();//will click cancel-will dismiss
        actual=successMessageConfirmationAlert.getText();
        expected="You clicked: Cancel";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void promAlert(){
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        WebElement clickForJSPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
        clickForJSPrompt.click();
        String text = "Loop Academy";
//        driver.switchTo().alert().sendKeys("Loop Academy");
//        driver.switchTo().alert().accept();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();

        WebElement successMessagePromptAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = successMessagePromptAlert.getText();
        String expected = "You entered: " + text;
        Assert.assertEquals(actual, expected, "actual does not match the expected");
    }
}
