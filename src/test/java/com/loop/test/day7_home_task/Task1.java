package com.loop.test.day7_home_task;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
/*

    0. complete the method - returnAnyField - that it can handle "phone number", "role", "advisor" fields

    1. login as an advisor
    2. go to users


    3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
    4. validate that user name for alex.de.souza@gmail.com is alexdesouze
    5. validate that phone number for alex.de.souza@gmail.com is +994512060042
    6. validate that role for alex.de.souza@gmail.com is client
    7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1

    repeat the same thing for
    - 	b1g1_supervisor@gmail.com
    -   b1g1_advisor@gmail.com
 */

public class Task1 extends TestBase {

    @Test
    public void testTableContinue(){
        DocuportUtils.login(driver, DocuportConstants.ADVISOR);

        WebElement users= driver.findElement(By.xpath("//span[.='Users']"));
        users.click();
        //3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
       // String actual= driver.findElement()
                ////tr[4]/td/div/span/following-sibling::span[1]



    }
}
