package com.loop.test.day4_homeTask;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task1 {
    @Test
    public void DocuportTest() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");
        WebElement byUserName = driver.findElement(By.xpath("//input[@id='input-14']"));

        byUserName.sendKeys(DocuportConstants.USERNAME_ADVISOR);

        WebElement byUserPassword = driver.findElement(By.xpath("//input[@id='input-15']"));
        byUserPassword.sendKeys(DocuportConstants.PASSWORD);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        Thread.sleep(2000);
//
//       WebElement homePage=driver.findElement(By.xpath("//span[contains(.,'Home')]"));
//      if(homePage.isDisplayed()){
//          System.out.println("Home page is displayed==>TEST PASSED");
//      }else{
//          System.out.println("Home page is not displayed==>Test Failed");
//      }
        WebElement homePage = driver.findElement(By.xpath("//span[.='Home']"));
        if (homePage.isDisplayed()) {
            System.out.println("Home page is displayed==>TEST PASSED");
        } else {
            System.out.println("Home page is not displayed==>TEST FAILED");
//            WebElement receivedDocs = driver.findElement(By.xpath("//span[contains(.,'Received docs')]"));
//            if (receivedDocs.isDisplayed()) {
//                System.out.println("Receive document   is displayed==>TEST PASSED");
//            } else {
//                System.out.println("Receive document is not displayed==>Test Failed");
//            }
//            WebElement invitations = driver.findElement(By.xpath("//span[contains(.,'Invitation')]"));
//            if (invitations.isDisplayed()) {
//                System.out.println("Invitations is displayed==>TEST PASSED");
//            } else {
//                System.out.println("Receive document is not displayed==>TEST FAILED");
//            }



            // threeLines.click();
            Thread.sleep(4000);
            WebElement threeLines = driver.findElement(By.xpath("//i[@class='v-icon notranslate mdi mdi-menu theme--light']"));
            threeLines.click();
            System.out.println("--------AFTER CLICKING THREE LINES-------");
            WebElement homePageAfterThreeLines = driver.findElement(By.xpath("//span[contains(.,'Home')]"));
            if (homePageAfterThreeLines.isDisplayed()) {
                System.out.println("Home page is displayed==>TEST FAILED");
            } else {
                System.out.println("Home page is not displayed==>Test PASSED");

                WebElement receivedDocsAfterThreeLines = driver.findElement(By.xpath("//span[contains(.,'Received docs')]"));
                if (receivedDocsAfterThreeLines.isDisplayed()) {
                    System.out.println("Receive document   is displayed==>TEST FAILED");
                } else {
                    System.out.println("Receive document is not displayed==>Test PASSED");
                }

                WebElement invitationsAfterThreeLines = driver.findElement(By.xpath("//span[contains(.,'Invitation')]"));
                if (invitationsAfterThreeLines.isDisplayed()) {
                    System.out.println("Invitations is displayed==>TEST FAILED");
                } else {
                    System.out.println("Receive document is not displayed==>TEST PASSED");
                }


//        1. go to docuport app
//        2. validate that Home, Received docs, My uploads, Invitations are displayed
//        3. press three lines
//        4. Home, Received docs, My uploads, Invitations will disappear
//        5. Validate the buttons are not displayed


            }
        }
    }
}
