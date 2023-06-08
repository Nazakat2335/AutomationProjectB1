package com.loop.test.day4_xpath_findElements;

import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_testNG_intro {

    @Test
    public void tes1() {
        System.out.println("tesNg is running");
        String actual="feyruz";
    String expected="nadir";
        Assert.assertEquals(actual,expected);

    }
}





