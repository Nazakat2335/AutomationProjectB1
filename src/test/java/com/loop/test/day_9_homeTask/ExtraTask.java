package com.loop.test.day_9_homeTask;
/*
============
1. login docuport as a advisor
2. go to my loads
3. try to upload a file
(do not spend more than 20 mins, if you can not, can not)
 */

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ExtraTask {
    @Test
    public void docuport(){

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        DocuportUtils.login(Driver.getDriver(),"advisor");
        WebElement myUpload=Driver.getDriver().findElement(By.xpath("//span[.='My uploads']"));
        myUpload.click();
        WebElement uploadDoc=Driver.getDriver().findElement(By.xpath("//span[.='Upload documents']"));
uploadDoc.click();//Upload file
        WebElement uploadFile=Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
        String path="C://Users//12248//Desktop//some-file.txt";
   uploadFile.sendKeys(path);
//        WebElement documentName=Driver.getDriver().findElement(By.xpath("(//input[@type='text'])[1]"));
//        documentName.click();
//        WebElement client=Driver.getDriver().findElement(By.xpath("//label[.='Client']"));
//        client.click();
//        WebElement service=Driver.getDriver().findElement(By.xpath("//label[.='Service']"));////label[.='Description']
// service.click();
// WebElement description=Driver.getDriver().findElement(By.xpath("//label[.='Description']"));
// description.click();
// WebElement checkbox=Driver.getDriver().findElement(By.xpath("//input[@type='checkbox']"));
// checkbox.click();



    }
}