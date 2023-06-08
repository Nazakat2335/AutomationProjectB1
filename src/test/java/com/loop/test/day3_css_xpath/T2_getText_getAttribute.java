package com.loop.test.day3_css_xpath;

import com.loop.test.utilities.DemoQaConstant;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        String actualHeaderFormFor= driver.findElement(By.tagName("h5")).getText();
     //   driver.quit();
        if(actualHeaderFormFor.equals(DemoQaConstant.EXPECT_HEADER_FOR_FORM)){
            System.out.println("Expected Header For Form\" "+DemoQaConstant.EXPECT_HEADER_FOR_FORM+"\", matches actual Header For Form\" "+actualHeaderFormFor+"\" ==>TEST PASSED");

        }else{
            System.out.println("Expected Header For Form\""+DemoQaConstant.EXPECT_HEADER_FOR_FORM+"\", does not matches actual Header For form"+actualHeaderFormFor+"\"==TEST FAILED\"");



            WebElement firstNamePlaceHolder= driver.findElement(By.id("firstName"));
            String actualFistNamePlaceHolder=firstNamePlaceHolder.getAttribute("placeholder");

            if(actualFistNamePlaceHolder.equals(DemoQaConstant.EXPECTED_PLACE_HOLDER_FIRST_NAME)){
                System.out.println("Expected Place Holder\""+DemoQaConstant.EXPECTED_PLACE_HOLDER_FIRST_NAME+"\",matches actual First name Holder:\""+firstNamePlaceHolder+"\"==>TEST PASSED");

            }else{ System.out.println("Expected Place Holder\""+DemoQaConstant.EXPECTED_PLACE_HOLDER_FIRST_NAME+"\", does not matches actual First name Holder:\""+firstNamePlaceHolder+" ==>TEST FAILED");

            }
        }

driver.quit();
    }
}
