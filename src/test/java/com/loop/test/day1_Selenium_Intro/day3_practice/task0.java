package com.loop.test.day1_Selenium_Intro.day3_practice;
//1. go to http://the-internet.herokuapp.com/forgot_password
//2. locate 5 elements, forgot password, email, email input, retrieve password, powered selenium
//3. use css
//4. verify those elements are displayed

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class task0 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/forgot_password");
        WebElement forgetPassword= driver.findElement(By.cssSelector("div[class='example']"));
        if (forgetPassword.isDisplayed()){
            System.out.println("Forget password is displayed==> Test Passed");

        }else{
            System.out.println("Forget password is not  displayed==> Test Failed");
        }
  WebElement email= driver.findElement(By.cssSelector("label[for='email'"));
        if(email.isDisplayed()){
            System.out.println("Email is displayed==>Test Passed");
        }else{
            System.out.println("Email is displayed==>Test Failed");

        }
        WebElement emailInput=driver.findElement(By.cssSelector("input[type= 'text']"));
        if(emailInput.isDisplayed()){
            System.out.println("Email input is displayed==>Test Passed");
        }else{
            System.out.println("Email input is displayed==>Test Failed");
        }

        WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']"));
        if(email.isDisplayed()){
            System.out.println("Retrieve passwords displayed - TEST PASS");
        }else{
            System.out.println("Retrieve password  input is NOT displayed - TEST FAIL ");
        }

        WebElement poweredSelenium=driver.findElement(By.cssSelector("div[text-align: center;']"));
        if (poweredSelenium.isDisplayed()){
            System.out.println("PoweredSelenium displayed - TEST PASS");
        }else{
            System.out.println("PoweredSelenium displayed - TEST FAILED");
        }
        driver.quit();
    }
}
