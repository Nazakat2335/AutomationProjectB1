package com.loop.test.day5_homeTask;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * go to https://app.docuport.app/company-formation/resident
 * What type of business do you want to start? - choose corporation
 * Validate that corporation has been selected
 * Formation State - choose Virginia
 * Validate Virginia is selected
 * Validate order summer as below:
 *
 * State registration fee $100
 * Payment processing $6
 * Service fee $150
 * Total $256
 *
 * Formation State - choose Maryland
 * Validate Maryland is selected
 * Validate order summer as below:
 *
 * State registration fee $170
 * Payment processing $10.20
 * Service fee $150
 * Total $330.20
 */
public class Task3_extra {

    WebDriver driver;

    @BeforeMethod
    public void BeforeSetUp() {
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://app.docuport.app/company-formation/resident");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDownMethod(){
      //  driver.close();
    }

    @Test
    public void test1() throws InterruptedException {
        //* What type of business do you want to start? - choose corporation
        WebElement corporationButton = driver.findElement(By.xpath("//label[.='Corporation']"));
        corporationButton.click();
        // * Validate that corporation has been selected
        WebElement radioCorporation = driver.findElement(By.xpath("(//input[@aria-checked='true'])[1]"));
//      radioCorporation.click();
        if (radioCorporation.isSelected()) {
            System.out.println("Radio button for corporation is selected==>TEST PASSED");
        } else {
            System.out.println("radio button is not selected==>TEST FAILED");
        }
        //* Formation State - choose Virginia
        WebElement virginiaButton = driver.findElement(By.xpath("//label[.='Virginia']"));
        virginiaButton.click();
        //* Validate Virginia is selected
        WebElement radioButton = driver.findElement(By.xpath("(//input[@aria-checked='true'])[5]"));
        if (radioButton.isSelected()) {
            System.out.println("Radio button for Virginia is selected==>TEST PASSED");
        } else {
            System.out.println("Radio button for Virginia is  not selected==>TEST FAILED");
          //  Validate order summer as below:
          //State registration fee $100

            WebElement orderElement = driver.findElement(By.xpath("//p[.=' State registration fee ']"));
            WebElement orderForPrice = driver.findElement(By.xpath("//p[.=' $50 ']"));

List<WebElement>containsElementAndPrice=new ArrayList<>(Arrays.asList(orderElement,orderForPrice));
        System.out.println(containsElementAndPrice);

        String actual="State registration fee $100";
        if(containsElementAndPrice.equals(actual)){
            System.out.println(containsElementAndPrice+" is equal "+actual+"==>TEST Failed");

            }else{
            System.out.println(containsElementAndPrice+" is not  equal "+actual+"==>TEST PASSED");
        }

            }
            }


        }


        //   Thread.sleep(3000);
        //   radioCorporation.click();


//        WebElement radioCorporationAfterClick=driver.findElement(By.xpath("(//input[@aria-checked='true'])[1]"));
//        Thread.sleep(3000);
//
//   System.out.println(radioCorporationAfterClick.isSelected() + " after clicking");








