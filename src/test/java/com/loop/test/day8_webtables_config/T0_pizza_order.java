package com.loop.test.day8_webtables_config;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.PizzaOrderWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
  /*
    1. go to https://loopcamp.vercel.app/web-tables.html
    2. create a method to test given field for a given name
     */


public class T0_pizza_order extends TestBase {

    @Test
    public void validate_card_for_alexandra(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name="Alexandra Gray";
        String expectedCardNumber="321456789012";
        String actualCardNumber =driver.findElement(By.xpath("//td[contains(text(),'321456789012')]")).getText();
      Assert.assertEquals(actualCardNumber,expectedCardNumber,"actual text and expected text does NOT match");
      Assert.assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"Card number"),expectedCardNumber);

    }

    @Test
    public void test_pizza_type(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Alexandra Gray";
        String expectedPizzaType = "Thin Crust";
        Assert.assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Pizza type"), expectedPizzaType);
    }

    @Test
    public void test_amount(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "John Doe";
        String expectedAmount = "3";
        Assert.assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Amount"), expectedAmount);
    }

    @Test
    public void test_date(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Stewart Dawidson";
        String expectedDate = "03/29/2021";
        Assert.assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Date"), expectedDate);
    }

    @Test
    public void test_street(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name ="Bart Fisher";
        String expectedStreet = "35, Rock st.";
        Assert.assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Street"), expectedStreet);

    }

    @Test
    public void test_city(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name ="Ned Stark";
        String expectedCity = "Newcastle";
        Assert.assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "City"), expectedCity);

    }

    @Test
    public void test_state(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");

        String name ="Bob Martin";
        String expectedState = "US";
        Assert.assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "State"), expectedState);
    }

    @Test
    public void test_zip(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");

        String name ="Samuel Jackson";
        String expectedZip = "53665";
        Assert.assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Zip"), expectedZip);
    }

    @Test
    public void test_card(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name ="Robert Baratheon";
        String expectedCard = "MasterCard";
        Assert.assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Card"), expectedCard);
    }

    @Test
    public void test_card_number(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Alexandra Gray";
        String expectedCardNumber = "321456789012";
        Assert.assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Card Number"), expectedCardNumber);

    }

    @Test
    public void test_exp(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");

        String name = "John Doe";
        String expectedExp = "01/23";
        Assert.assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Exp"), expectedExp);

    }


}
