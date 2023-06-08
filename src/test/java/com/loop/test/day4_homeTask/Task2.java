package com.loop.test.day4_homeTask;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Task2 {
    @Test
    public void DocuportTest() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");
        WebElement username= driver.findElement(By.xpath("//input[@id='input-14']"));
        username.sendKeys(DocuportConstants.USERNAME_ADVISOR);
        WebElement passWord= driver.findElement(By.xpath("//input[@id='input-15']"));
        passWord.sendKeys(DocuportConstants.PASSWORD);

WebElement logIn=driver.findElement(By.xpath("//button[@type='submit']"));
logIn.click();

 List<WebElement> leftNavigateItems=driver.findElements(By.xpath("//div[@role='listbox']/a"));
        System.out.println("leftNavigateItems = " + leftNavigateItems.size());
      for(WebElement eachItem:leftNavigateItems){
          System.out.println("Item text"+eachItem.getText());
          System.out.println("item value"+eachItem.getAttribute("href"));
      }
        }
        }



//task 2
       // =============
//        1. go to docuport
//        2. sign as adviser
//        3. store left navigate items to (Home, Received docs, My uploads, Invitations etc) to the List
//        4. iterate and print out href values
//
//        optional step:
//        5. Validate that expected matching to actual
//
//        Home, Received docs, My uploads, Clients, Invitations, Users, Leads, Bookkeeping, 1099 form, Reconciliation
//        {
//}
