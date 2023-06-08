package com.loop.test.day5_testNG_dropdown;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class T00_testNG_intro_continue {

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is run");

    }

    @Test(priority = 2)
    public void test1(){
        System.out.println("TestNG test1 is running");
        String actual="Loop";
        String expected="Loop";
        Assert.assertEquals(actual,expected,actual+":is not matching with "+actual);

    }

    @Test(priority = 1)
    public void test2(){
        System.out.println("TestNG test 2 is running");

}
}