package lesson13.page;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class ProductsPage {
    private final ElementsCollection productList = $$x("//div[@class = 'inventory_container']/div/div");

    private final SelenideElement addBikeButton = $("button[id=add-to-cart-sauce-labs-bike-light]");

    private final SelenideElement addOnesieButton = $("button[id=add-to-cart-sauce-labs-onesie]");

    private final SelenideElement cardButton = $("#shopping_cart_container");

    public ProductsPage checkProductList(){
        productList.shouldHave(CollectionCondition.size(6));
        return this;
    }
    public ProductsPage addBike(){
        addBikeButton.click();
        return this;
    }

    public ProductsPage addOnesie(){
        addOnesieButton.click();
        return this;
    }

    public ProductsPage openCard(){
        cardButton.click();
        return this;
    }

}
