package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1_PracticeTask3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://beta.docuport.app/login/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys("b1g1_advisor@gmail.com");

        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys("Group1" + Keys.ENTER);
    }
}