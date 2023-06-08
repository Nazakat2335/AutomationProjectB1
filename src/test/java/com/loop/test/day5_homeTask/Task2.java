package com.loop.test.day5_homeTask;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Scanner;

/**
 * 1. go to https://www.etsy.com/
 * 2. search for rings
 * 3. validate that Estimated Arrival shows any time
 * 3. click Estimated Arrival dropdown
 * 4. click Select custom date
 * 5. choose may 30 from dropdown
 * 6. validate Estimated Arrival shows may 30
 */

public class Task2 {
    WebDriver driver;


    @BeforeMethod
    public void beforeSetUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //go to  link
        driver.get("https://www.etsy.com/");
        //wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }



    @Test
    public void test1() {
        WebElement search = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));

        //search for rings
        search.sendKeys("rings" + Keys.ENTER);
        WebElement searchButton = driver.findElement(By.xpath("//button[@aria-label='Search']"));
        //3. validate that Estimated Arrival shows any time
        WebElement dropdownEstimate = driver.findElement(By.xpath("//span[@class='wt-menu__trigger__label']/span[contains(text(),'Estimated Arrival')]"));
        Assert.assertEquals(dropdownEstimate.getText(), "Estimated Arrival Any time");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        dropdownEstimate.click();
        //4. click Select custom date
        WebElement customDate = driver.findElement(By.xpath("//select[@aria-label='Select custom date']"));
        customDate.isSelected();
        customDate.click();
        //5. choose may 30 from dropdown
        Select customDateShow= new Select(driver.findElement(By.xpath("//select[@id='edd_select_tf']")));
        customDateShow.selectByIndex(2);
        WebElement estimateArrivalElement=driver.findElement(By.xpath("//span[@class='wt-menu__trigger__label']/span"));
        //6. validate Estimated Arrival shows may 30
        Assert.assertEquals(estimateArrivalElement.getText(),"Estimated Arrival By May 30");
    }
//span[@class='wt-menu__trigger__label']/span
}