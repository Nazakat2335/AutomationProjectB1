package com.loop.test.day7_windows_webtables;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T1_windows extends TestBase {
    /*
    1. Open a chrome browser
    2. Go to :/*
    1. Open a chrome browser
    2. Go to : http://the-internet.herokuapp.com/windows
    3. Assert: Title is “The Internet”
    4. Click to: “Click Here” link
    5. Switch to new Window.
    6. Assert: Title is “New Window”
   */
    @Test
    public void test_window_handle() {
        driver.get("http://the-internet.herokuapp.com/windows");
        Assert.assertTrue(driver.getTitle().contains("The Internet"));
        WebElement clickHere= driver.findElement(By.xpath("//a[@href='/windows/new']"));
     //   clickHere.click();


       WebElement newWindow= driver.findElement(By.xpath("//H3[contains(text(),'New Window'"));
   //     System.out.println(newWindow.getText());

    //    System.out.println("this is my window handle"+driver.getWindowHandles());
    //    Set<String> windowHandles=driver.getWindowHandles();
    //    for(String each:windowHandles) {
    //        System.out.println("each window's handle" + each);


        //    System.out.println("This is my current Url" + each);
      }
//        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
//        System.out.println("driver.getTitle() = " + driver.getTitle());
    }


