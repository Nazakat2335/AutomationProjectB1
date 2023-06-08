package com.loop.test.day6_homeTask;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1 extends TestBase {


    /**
     * task1
     * =============
     * 1. go to https://demoqa.com/alerts
     * 2. click - click button to see alert
     * 3. handle alert
     * 4. click - On button click, alert will appear after 5 seconds
     * 5. handle alert
     * 6. click - On button click, confirm box will appear
     * 7. click ok and validate - You selected Ok
     * 8. after that do it again this time cancel and validate - You selected Cancel
     * 9. click - On button click, prompt box will appear
     * 10. enter "Loop Academy" and validate You entered Loop Academy
     **/

    @Test
    public void test1() throws InterruptedException {
        //1. go to https://demoqa.com/alerts
        driver.get("https://demoqa.com/alerts");
        //2. click - click button to see alert
        WebElement clickButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
        clickButton.click();
        // 3. handle alert
        driver.switchTo().alert().accept();
        //4. click - On button click, alert will appear after 5 seconds
    }

    @Test
    public void test2() throws InterruptedException {
        //1. go to https://demoqa.com/alerts
        driver.get("https://demoqa.com/alerts");
        WebElement onButtonClickAlertWillAppearAfter5Seconds = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
      //  Thread.sleep(3000);
        onButtonClickAlertWillAppearAfter5Seconds.click();
        //5. handle alert
       driver.switchTo().alert().accept();
    }

    @Test
    public void test3() throws InterruptedException {
        //1. go to https://demoqa.com/alerts
        driver.get("https://demoqa.com/alerts");
        //   * 6. click - On button click, confirm box will appear
        WebElement clickConfirmButton= driver.findElement(By.xpath("//button[@id='confirmButton']"));
        clickConfirmButton.click();
        driver.switchTo().alert().accept();
        // * 7. click ok and validate - You selected Ok
        WebElement successMessage= driver.findElement(By.xpath("//span[@id='confirmResult']"));

        String actual=successMessage.getText();
        String expected="You selected Ok";
        Assert.assertEquals(expected,actual,"this is not selected");
        //* 8. after that do it again this time cancel and validate - You selected Cancel
         Thread.sleep(3000);
         clickConfirmButton.click();
         driver.switchTo().alert().dismiss();
         WebElement cancelMessage= driver.findElement(By.xpath("//span[@id='confirmResult']"));
         String  actual3=cancelMessage.getText();
         String expected3="You selected Cancel";
         Assert.assertEquals(expected3,actual3," this is not cancel");

    }
    @Test
    public void test4(){
        //1. go to https://demoqa.com/alerts
        driver.get("https://demoqa.com/alerts");
        //WebElement prompt= driver.findElement(By.xpath("/button[@id='promtButton']"));
        //  * 9. click - On button click, prompt box will appear
WebElement promptButton= driver.findElement(By.xpath("//button[@id='promtButton']"));
promptButton.click();
//* 10. enter "Loop Academy" and validate You entered Loop Academy
        driver.switchTo().alert().sendKeys("Loop Academy");
        driver.switchTo().alert().accept();
        WebElement successMessage= driver.findElement(By.xpath("//span[@id='promptResult']"));
        String actual=successMessage.getText();
        String expected="You entered Loop Academy";
        Assert.assertEquals(expected,actual,"this is not loop academy text");


    }
}
