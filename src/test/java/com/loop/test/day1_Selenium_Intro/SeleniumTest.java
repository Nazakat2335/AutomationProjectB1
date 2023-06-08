package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        //setting up the web driver
        WebDriverManager.chromedriver().setup();//abstract class.webdriver is interface,

        //create an instance of driver
        WebDriver driver=new ChromeDriver();
        Thread.sleep(3000);
        //reference type        object type
       // driver.get("https://www.etsy.com/?ref=lgo");
        //maximize
        driver.manage().window().maximize();//use one time and enough
        Thread.sleep(3000);
        //driver.manage().window().fullscreen(); i should call everytime

        //navigate to
        driver.navigate().to("https://www.etsy.com/?ref=lgo");
        Thread.sleep(3000);

        //let slow things a bit in order to be able to see what is going on
        Thread.sleep(3000);

        //navigate back take us to  previous
        driver.navigate().back();

        //navigate forward
        driver.navigate().forward();
        //refresh page
        driver.navigate().refresh();



    }
}
