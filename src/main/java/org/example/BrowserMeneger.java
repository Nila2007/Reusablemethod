package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BrowserMeneger extends Utils1 {
    @BeforeTest
    public void setBrowser() {
        // obj ect for chrome driver
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        // to maximize window
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    // type the url
    public void typeTheUrl () {
        driver.get("https://demo.nopcommerce.com/ ");
    }
//    @AfterMethod
//    public void closeBrowser(){
//        driver.close();
//    }


}
