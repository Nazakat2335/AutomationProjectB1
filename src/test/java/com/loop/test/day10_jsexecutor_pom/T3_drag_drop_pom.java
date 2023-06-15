package com.loop.test.day10_jsexecutor_pom;

import com.loop.pages.LoopPracticeDragDropPage;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T3_drag_drop_pom {
    /*
   Loop Practice Drag and Drop Test
   1. Open a chrome browser
   2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
   3. Verify expected default text appears on big circle
   Expected = "Drag the small circle here."

   Loop Practice Drag and Drop Test
   1. Open a chrome browser
   2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
   3. Click and hold small circle
   4. Verify "Drop here." text appears on big circle

   1. Open a chrome browser
   2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
   3. Click and hold small circle
   4. Move it on top of the big circle
   5. Verify “Now drop…” text appears on big circ

   1. Open a chrome browser
   2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
   3. Click and hold small circle
   4. Dropped anywhere outside of big circle
   5. Verify “Try again!” text appears on big circle
    */
    LoopPracticeDragDropPage loopPracticeDragDropPage;
    Actions actions;

    @BeforeMethod
    public void setUpMethod() {
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        LoopPracticeDragDropPage loopPracticeDragDropPage = new LoopPracticeDragDropPage();
         actions = new Actions(Driver.getDriver());



    }

    @Test
    public void test_drag_small_here() {

        String expected = "Drag the small circle here.";
        LoopPracticeDragDropPage loopPracticeDragDropPage = new LoopPracticeDragDropPage();
        String actual = loopPracticeDragDropPage.bigCircle.getText();
        Assert.assertEquals(actual, expected, "expected and actual does not match");


    }

    @Test
    public void drop_here() {

        loopPracticeDragDropPage.smallCircle.getText();
        actions.moveToElement(loopPracticeDragDropPage.smallCircle).clickAndHold().moveByOffset(100, 100).pause(2000).perform();
        Assert.assertEquals(loopPracticeDragDropPage.bigCircle.getText(), "drop here.");

    }
    @Test
    public  void test(){
loopPracticeDragDropPage.smallCircle.getText();
actions.moveToElement(loopPracticeDragDropPage.smallCircle).clickAndHold().moveToElement(loopPracticeDragDropPage.bigCircle).pause(200).perform();
Assert.assertEquals(loopPracticeDragDropPage.bigCircle.getText(),"Now drop…");
    }
    @Test
    public  void test3(){
        loopPracticeDragDropPage.smallCircle.getText();
        actions.moveToElement(loopPracticeDragDropPage.smallCircle).clickAndHold().moveByOffset(100,100).pause(2000).release().perform();
        Assert.assertEquals(loopPracticeDragDropPage.bigCircle.getText(),"Try again!");

    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

}


