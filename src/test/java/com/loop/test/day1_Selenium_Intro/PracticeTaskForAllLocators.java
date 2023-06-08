package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTaskForAllLocators {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.aliexpress.us/?spm=a2g0o.home.1000002.1.ccb52145m93ALK&gatewayAdapt=glo2usa&_randl_shipto=US");

 driver.manage().window().maximize();
 driver.navigate().forward();
 driver.navigate().refresh();
 driver.findElement(By.id("SearchText"));
// driver.close();
// driver.quit();

    }
}