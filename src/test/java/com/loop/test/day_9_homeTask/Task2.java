package com.loop.test.day_9_homeTask;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

//task2
//        ============
//        1. Go to https://loopcamp.vercel.app/hovers.html
//        2. Hover over to first image
//        3. Assert:
//        a. “name: user1” is displayed
//        b. “view profile” is displayed
//        4. Hover over to second image
//        5. Assert:
//        a. “name: user2” is displayed
//        b. “view profile” is displayed
//        6. Hover over to third image
//        7. Confirm:
//        a. “name: user3” is displayed
//        b. “view profile” is displayed

public class Task2 {
    @Test
    public void hover_over() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
        WebElement hovers=Driver.getDriver().findElement(By.xpath("//a[@href='hovers.html']"));
        Actions action=new Actions(Driver.getDriver());
        action.moveToElement(hovers).click().perform();////img[@alt='User Avatar']
        //li[.='Hovers']
        WebElement firstImage=Driver.getDriver().findElement(By.xpath("//img[@alt='User Avatar']"));
        action.moveToElement(firstImage).perform();
        WebElement text=Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        action.moveToElement(firstImage);
        Assert.assertTrue(text.isDisplayed(),"this text is not displayed");
        WebElement viewProfil=Driver.getDriver().findElement(By.xpath("//a[.='View profile']"));
        action.moveToElement(firstImage);
        Assert.assertTrue(viewProfil.isDisplayed(),"this text is NOT displayed");
        WebElement secondImage=Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
        action.moveToElement(secondImage).perform();
        WebElement text2=Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        action.moveToElement(secondImage);
        Assert.assertTrue(text2.isDisplayed(),"this text is not displayed");
        WebElement viewProfil2=Driver.getDriver().findElement(By.xpath("//a[@href='users/2.html']"));
        Assert.assertTrue(viewProfil2.isDisplayed(),"this text is displayed");
        WebElement thirdImage=Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));

        action.moveToElement(thirdImage).perform();
        WebElement text3=Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        Assert.assertTrue(text3.isDisplayed(),"this text is not displayed");
        WebElement viewProfil3=Driver.getDriver().findElement(By.xpath("//a[@href='users/3.html']"));
        Assert.assertTrue(viewProfil3.isDisplayed(),"this text is not displayed");




    }
}