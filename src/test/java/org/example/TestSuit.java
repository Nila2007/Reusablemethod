package org.example;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class  TestSuit extends Utils1 {
BrowserMeneger browserMeneger=new BrowserMeneger();
HomePage homePage = new HomePage();
GiftCard giftCard = new GiftCard();
@Test
public void userClickOnGiftCardCategoris(){
    browserMeneger.setBrowser();
   browserMeneger.typeTheUrl();
    homePage.GiftCardCetagoris();
}
@Test
public void addGiftCards(){
    browserMeneger.setBrowser();
    browserMeneger.typeTheUrl();
    homePage.GiftCardCetagoris();
    giftCard.addGiftCard();
}
}

