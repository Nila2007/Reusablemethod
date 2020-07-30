package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;


//import java.time.Clock;

// create a class UserRegister

public class UserRegister {

    static WebDriver driver;

    // static WebDriverWait wait=new WebDriverWait(driver,timestamp());
    // public static void waitUntilElementIsClickable(By by,int a){
    // wait.until(ExpectedConditions.elementToBeClickable(by)); }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void clickOnElement(By by, int time) {
        driver.findElement(by).click();
    }

    public static long timestamp() {
        return (System.currentTimeMillis());
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static void selectFromDropDownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void selectFromDropDownByVisibleValue(By by, String n) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(n);
    }
    // method
    // @BeforeMethod
    // public static void setBrowser() {
    // // seting up chrome browser path

    // System.setProperty("webdriver.chrome.driver", " C:\\Soft\\chromedriver.exe");
    // driver = new ChromeDriver();
    //driver.manage().window().maximize();
    // driver.get("https://demo.nopcommerce.com/");

    // @AfterMethod
    public static void closeBrowser() {
        driver.close();
    }

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", " C:\\Soft\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        clickOnElement((By.linkText("\"ico-Register\"")), 20);
        // getTextFromElement(By.partialLinkText("Your Personal Details"));
        clickOnElement(By.xpath("//input[@id=\"gender-female\"]"), 40);
        // driver.findElement(By.id("gender-female"));
        typeText(By.name(("[name=\"FirstName\"]")), ("nila"));


    }

}









