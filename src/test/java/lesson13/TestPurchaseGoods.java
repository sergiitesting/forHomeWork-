package lesson13;

import lesson13.config.Browser;
import lesson13.page.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestPurchaseGoods{

    private final LoginPage loginPage = new LoginPage();
    private final ProductsPage productsPage = new ProductsPage();
    private final CardPage cardPage = new CardPage();
    private final CheckoutPage checkoutPage = new CheckoutPage();
    private final CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
    private final CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();
    String newUrl = "https://www.saucedemo.com/";


    @Test
    public void validPurchase(){
        Browser browser = new Browser();
        browser.setBrowser("testName");
        open(newUrl);
        loginPage.setLogin("standard_user")
                .setPassword("secret_sauce")
                .clickLoginButton();
        productsPage.checkProductList()
                .addBike()
                .addOnesie()
                .openCard();
        cardPage.checkFirstGoodsName()
                .checkSecondGoodsName()
                .clickCheckoutButton();
        checkoutPage.setFirstName("Test")
                .setLastName("Test")
                .setPostalCode("Test")
                .clickContinueButton();
        checkoutOverviewPage.calculatePercentageTax()
                .clickFinishButton();
        checkoutCompletePage.checkCompleteText();
    }
}
