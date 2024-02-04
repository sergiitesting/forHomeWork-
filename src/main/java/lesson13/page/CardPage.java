package lesson13.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CardPage {
    private final SelenideElement firstGoodsName = $x("(//div[@class='inventory_item_name'])[1]");
    private final SelenideElement secondGoodsName = $x("(//div[@class='inventory_item_name'])[2]");

    private final SelenideElement checkoutButton = $("#checkout");

    public CardPage checkFirstGoodsName(){
        firstGoodsName.shouldBe(Condition.text("Sauce Labs Bike Light"));
        return this;
    }
    public CardPage checkSecondGoodsName(){
        secondGoodsName.shouldBe(Condition.text("Sauce Labs Onesie"));
        return this;
    }
    public CardPage clickCheckoutButton(){
        checkoutButton.click();
        return this;
    }

}
//Sauce Labs Bike Light
//Sauce Labs Onesie