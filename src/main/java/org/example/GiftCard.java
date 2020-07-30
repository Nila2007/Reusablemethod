package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class GiftCard extends Utils1{
    private  By _AddToBasket = By.xpath("//h2[@class='product-title']//a[contains(text(),'$25 Virtual Gift Card')]");
    private  By _recipientName = By.cssSelector("//input[@id='giftcard_43_RecipientName']");
    private  By _recipientEmail = By.xpath("//input[@id='giftcard_43_RecipientEmail']");
    private  By _yourName = By.cssSelector("#giftcard_43_SenderName");
    private  By _yourEmail = By.cssSelector("#giftcard_43_SenderEmail");
    private  By _message = By.cssSelector("#giftcard_43_Message");
    private  By _addToCartButton =By.id("add-to-cart-button-43");
    private  By _actualResult = By.xpath("//h1[contains(text(),'Gift Cards')]");
     String expectedResult = "Gift Cards";

    public void addGiftCard(){
        System.out.println(_actualResult);
        //Assert.assertEquals(_actualResult,expectedResult);
        clickOnElement(_AddToBasket,30);
        TypeText(_recipientName,"nila",30);
        TypeText(_recipientEmail,"neev123"+timestamp()+"@gmail.com",30);
        TypeText(_yourName,"nil",30);
        TypeText(_yourEmail,"siya"+timestamp()+"@gmail.com",30);
        TypeText(_message,"Hello",30);
        clickOnElement(_addToCartButton,30);

    }





}
