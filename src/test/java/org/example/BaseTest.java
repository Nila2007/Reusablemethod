package org.example;

import org.testng.ITestResult;
import org.testng.annotations.*;

public class BaseTest extends Utils1{
    BrowserMeneger browserManager = new BrowserMeneger();


    @BeforeTest
    public void toVerifyThatUserOnHomePage(){
        browserManager.setBrowser();
        browserManager.typeTheUrl();
    }

//    @AfterTest
//    public void CloseBrowser(ITestResult result) { //Method to close browser
//        if (ITestResult.FAILURE == result.getStatus()) {
//            ScreenShotCapture(result.getName()+timestamp());
//
//        }
//        //browserManager.closeBrowser();
//    }

}
