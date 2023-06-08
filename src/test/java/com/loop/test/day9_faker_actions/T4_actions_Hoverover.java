package com.loop.test.day9_faker_actions;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class T4_actions_Hoverover {

    @Test
    public void google_actions_hover() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
        WebElement googleSearch=Driver.getDriver().findElement(By.xpath("//input[@value='Google Search']"));
       WebElement iAmFeelingLucky=Driver.getDriver().findElement(By.xpath("//input[@value='Google Search']/following-sibling::input"));
        Actions action=new Actions(Driver.getDriver());
       Thread.sleep(3000);
       action.moveToElement(googleSearch).perform();
       Thread.sleep(3000);
       action.moveToElement(iAmFeelingLucky).perform();

    }



}
