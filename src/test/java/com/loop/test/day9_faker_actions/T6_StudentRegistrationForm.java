package com.loop.test.day9_faker_actions;

import com.github.javafaker.Faker;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T6_StudentRegistrationForm {
    @Test
    public void form(){
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
        WebElement registForm=Driver.getDriver().findElement(By.xpath("//a[.='Registration Form']"));
        Actions action=new Actions(Driver.getDriver());
        action.moveToElement(registForm).click().perform();
      //  registForm.click();
        Faker faker=new Faker();
        WebElement firstName=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());
        WebElement lastName=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());
        WebElement userName=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(faker.bothify("???###"));
        WebElement email=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.internet().emailAddress());
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());
        WebElement phone=Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys(faker.numerify("571-###-####"));
        WebElement otherCheck = Driver.getDriver().findElement(By.xpath("//input[@value='other']"));
        otherCheck.click();
    }

}
