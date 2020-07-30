package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils1{
    private final By _clickOnGiftCard = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]");

    public void GiftCardCetagoris(){
        clickOnElement(_clickOnGiftCard,30);

    }
}
