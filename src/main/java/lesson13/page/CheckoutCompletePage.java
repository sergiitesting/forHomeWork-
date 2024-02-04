package lesson13.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutCompletePage {
    private final SelenideElement completeText = $(".complete-header");
    public CheckoutCompletePage checkCompleteText(){
        completeText.shouldBe(Condition.text("Thank you for your order!"));
        return this;
    }
}
