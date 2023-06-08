package com.loop.test.day_9_homeTask;
/*
task4
============
1. Open a chrome browser
2. Go to: https://loopcamp.vercel.app/
3. Scroll down to “Powered by LOOPCAMP”
4. Scroll using Actions class “moveTo(element)” method
 */

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task4 {
    @Test
    public  void scroll_down(){
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
        Actions action=new Actions(Driver.getDriver());
        WebElement loopcamp=Driver.getDriver().findElement(By.xpath("//a[.='LOOPCAMP']"));
        action.scrollToElement(loopcamp).perform();
//
        //1. Continue from where the Task 4 is left in the same test.
        //2. Scroll back up to Loop Academy link/picture using PageUP button
        WebElement loopAcademyLink=Driver.getDriver().findElement(By.xpath("//a[@href='index.html']"));
        //using action
        action.moveToElement(loopAcademyLink).perform();
    }
}
