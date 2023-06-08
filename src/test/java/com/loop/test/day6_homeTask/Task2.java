package com.loop.test.day6_homeTask;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2 extends TestBase {
    /**
     * task2
     * =============
     * 1. go to https://demoqa.com/nestedframes
     * 2. Validate "Child Iframe" text
     * 3. Validate "Parent Iframe" text
     * 4. Validate the "Sample Nested Iframe page. There are nested iframes in this page.
     * Use browser inspecter or firebug to check out the HTML source.
     * In total you can switch between the parent frame and the nested child frame."
     */

    @Test
    public void nestedFrames(){

        driver.get("https://demoqa.com/nestedframes");
        driver.switchTo().frame("frame1");// by id
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
        //* 2. Validate "Child Iframe" text
        WebElement childIframe=driver.findElement(By.xpath("//p[.='Child Iframe']"));
       String actual= childIframe.getText();
        String expected="Child Iframe";
        Assert.assertEquals(expected,actual,"is not match");
      //  * 3. Validate "Parent Iframe" text
        driver.switchTo().parentFrame();
        WebElement parentFrame=driver.findElement(By.xpath("//body[.='Parent frame']"));
        String actual1=parentFrame.getText();
        String expected1="Parent frame";
        Assert.assertEquals(expected1,actual1,"result is not match");
        //  * 4. Validate the "Sample Nested Iframe page. There are nested iframes in this page.
        driver.switchTo().defaultContent();
        WebElement sampleNestedIframePage= driver.findElement(By.xpath("//div[@id='framesWrapper']/div[contains(text(),'Sample Nested')]"));
        sampleNestedIframePage.isDisplayed();
        Assert.assertTrue(sampleNestedIframePage.isDisplayed(),"if there is not math");





    }
}
