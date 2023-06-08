package com.loop.test.day7_windows_webtables;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtills {
    public static void switchWindowsAndValidate(WebDriver driver,String expectedUrl,String expectedTitle){
        Set<String> windowsHandles=driver.getWindowHandles();
        for(String each:windowsHandles){

        }
    }
}
