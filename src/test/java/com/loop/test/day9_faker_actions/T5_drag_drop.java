package com.loop.test.day9_faker_actions;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T5_drag_drop {
    @Test
    public void drag_drop_test() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("guru.drag"));
        WebElement bank=Driver.getDriver().findElement(By.xpath("//a[.=' BANK ']"));
WebElement account=Driver.getDriver().findElement(By.xpath("//ol[@id='bank']/li"));
        Actions action=new Actions(Driver.getDriver());
        action.dragAndDrop(bank,account).perform();

        WebElement fiveK=Driver.getDriver().findElement(By.xpath("//a[.=' 5000 ']"));
        WebElement debit=Driver.getDriver().findElement(By.xpath("//ol[@id='amt7']"));
        Actions action1=new Actions(Driver.getDriver());
        action1.dragAndDrop(fiveK,debit).perform();
        Thread.sleep(3000);
       WebElement sales=Driver.getDriver().findElement(By.xpath("//a[.=' SALES ']"));
      WebElement creditAccount=Driver.getDriver().findElement(By.xpath("//ol[@id='loan']"));
       Actions action2=new Actions(Driver.getDriver());
        action2.dragAndDrop(sales,creditAccount).perform();
        Thread.sleep(3000);
        WebElement fiveKK=Driver.getDriver().findElement(By.xpath("//a[.=' 5000 ']"));
        WebElement creditSideAmount=Driver.getDriver().findElement(By.id("amt8"));
        Actions action3=new Actions(Driver.getDriver());
        action3.dragAndDrop(fiveKK,creditSideAmount).perform();
     WebElement successMessage=Driver.getDriver().findElement(By.xpath("//a[.='Perfect!']"));
     String expected="Perfect!";
     String actual=successMessage.getText();
        Assert.assertEquals(expected,actual);
        Driver.closeDriver();

    }
}
