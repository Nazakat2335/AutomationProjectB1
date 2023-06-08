package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Navigate to Google search
 * maximize the page
 * get title of the page
 * get url of the page
 * validate the title, expected title is "Ali Express"
 * validate the url of the page, expected url is "https://www.aliexpress.com/"
 * close the brower
 */

public class AliExpressSearch {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.aliexpress.us/?spm=a2g0o.home.1000002.1.2a482145xMIYBl&gatewayAdapt=glo2usa&_randl_shipto=US");
driver.manage().window().maximize();
String expectedTitle="Online Shopping for Popular Electronics, Fashion, Home & Garden, Toys & Sports, Automobiles and More products - AliExpress";
        String expectedUrl="https://www.aliexpress.us/?spm=a2g0o.home.1000002.1.2a482145xMIYBl&gatewayAdapt=glo2usa&_randl_shipto=US";
        String actualTitle=driver.getTitle();

      if(actualTitle.contains(expectedTitle)){
          System.out.println("actualTitle:" + actualTitle + ", matches expected title " + expectedTitle + "==> TEST PASS");


      }else{
          System.out.println("actualTitle:"+actualTitle+", DOES NOT matches expected title "+expectedTitle+",==>TEST FAIL");


      }
        String actualUrl=driver.getCurrentUrl();
      if(actualUrl.contains(expectedTitle)){
          System.out.println("actual URL:" + actualUrl + ", matches expected URL " + expectedUrl+  "==> TEST PASS");
      } else{

          System.out.println("actual URL:"+actualUrl+", DOES NOT matches expected URL " +expectedUrl+ ",==>TEST FAIL");
      }
      driver.close();
      }


    }

