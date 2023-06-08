package com.loop.test.day1_Selenium_Intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        /**
         * Navigate to Google search
         * maximize the page
         * get title of the page
         * get url of the page
         * validate the title, expected title is "Google"
         * validate the url of the page, expected url is "https://www.google.com/"
         * close the brower
         */
        WebDriverManager.chromedriver().setup();

        // create driver object
        WebDriver driver = new ChromeDriver();

        // navigate to google page
        driver.get("https://www.google.com/");

        // maximize the window
        driver.manage().window().maximize();
        String expectedTitle="Google";
        String expectedUrl="https://www.google.com/";
        String actualTitle=driver.getTitle();
        if(actualTitle.contains(expectedTitle)) {
            System.out.println("actualTitle:" + actualTitle + ", matches expected title " + expectedTitle + "==> TEST PASS");
        } else{

            System.out.println("actualTitle:"+actualTitle+", DOES NOT matches expected title "+expectedTitle+",==>TEST FAIL");
        }

                              String actualUrl=driver.getCurrentUrl();
        if(actualUrl.contains(expectedUrl)){
            System.out.println("actual URL:" + actualUrl + ", matches expected URL " + expectedUrl + "==> TEST PASS");
        } else{

            System.out.println("actual URL:"+actualUrl+", DOES NOT matches expected URL " +expectedUrl+ ",==>TEST FAIL");
        }

        }


        // quit the browser
        //  driver.quit();


    }


