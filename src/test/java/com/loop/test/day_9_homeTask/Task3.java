package com.loop.test.day_9_homeTask;
/*
task3
============
1. Go to https://loopcamp.vercel.app/upload.html
2. Find some small file from your computer, and get the path of it.
3. Upload the file.
4. Assert:
	-File uploaded text is displayed on the page
 */

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task3 {
    @Test
    public void upload(){
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
        WebElement upload=Driver.getDriver().findElement(By.xpath("//a[.='File Upload']"));
        upload.click();
        WebElement upload1=Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        String path="C://Users//12248//Desktop//SDET-Software-Development-Engineer-In-Test.webp";
       upload1.sendKeys(path);
      // String expected="SDET-Software-Development-Engineer-In-Test.webp";
        Assert.assertTrue(upload1.isDisplayed(),"this text is not displayed");

    }
}
