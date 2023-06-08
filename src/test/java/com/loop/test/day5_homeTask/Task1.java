package com.loop.test.day5_homeTask;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/**1. go to http://the-internet.herokuapp.com/dropdown
        2. validate "Please select an option" is selected by default
3. Choose option 1 and validate that it is selected
        4. Choose option 2 and validate that it is selected
        5. Validate dropdown name is "Dropdown List**/

public class Task1 {
    WebDriver driver;
    String expected="Please select an option";
    @BeforeMethod
    public void methodSetUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //go to  link
        driver.get("http://the-internet.herokuapp.com/dropdown");
        //wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void dropDownTest(){
        //validate that please selected option is default
       Select dropdown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

       Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),expected);
        //choose option 1 and check it selected
   dropdown.selectByVisibleText("Option 1");
   Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"Option 1");
        //choose option 2 and check it selected
   dropdown.selectByIndex(2);
   Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"Option 2");
   //Validate dropdown name is "Dropdown List
    WebElement dropDownList=driver.findElement(By.xpath("//div[@id='content']/div/h3[.='Dropdown List']"));
    Assert.assertEquals(dropDownList.getText(),"Dropdown List","no matched");
    }


}
