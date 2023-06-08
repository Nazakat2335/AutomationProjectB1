package com.loop.test.day_9_homeTask;

import com.github.javafaker.Faker;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
    @Test
    public void fakerTest() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
        WebElement registForm = Driver.getDriver().findElement(By.xpath("//a[.='Registration Form']"));
        registForm.click();
        Faker faker = new Faker();
        WebElement firstname = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));

        firstname.sendKeys(faker.name().firstName());
        WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());
        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(faker.bothify("###???"));
        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.internet().emailAddress());
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());
        WebElement phoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.numerify("571-###-####"));////input[@value='female']
        WebElement gender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        gender.click();
        WebElement dateOfB = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));

        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
        dateOfB.sendKeys(dateFormatter.format(faker.date().birthday()));
 Select  selectDep=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
      selectDep.selectByIndex(1);
      Select title=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
      title.selectByIndex(4);

      WebElement checkBox=Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']"));
      checkBox.click();
      WebElement signUp=Driver.getDriver().findElement(By.id("wooden_spoon"));
//      signUp.click();
//     WebElement text=Driver.getDriver().findElement(By.xpath("//span[.='This page isn’t working']"));
//     String expected="This page isn’t working";
//       Assert.assertEquals(expected,text.getText(),"expected and actual is NOT match");
    }
}