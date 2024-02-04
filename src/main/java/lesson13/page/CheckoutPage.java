package lesson13.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {
    private final SelenideElement firstNameField = $("#first-name");
    private final SelenideElement lastNameField = $("#last-name");
    private final SelenideElement postalCodeField = $("#postal-code");
    private final SelenideElement continueButton = $("#continue");


    public CheckoutPage setFirstName(String firstName){
        firstNameField.setValue(firstName);
        return this;
    }
    public CheckoutPage setLastName(String lastName){
        lastNameField.setValue(lastName);
        return this;
    }
    public CheckoutPage setPostalCode(String postalCode){
        postalCodeField.setValue(postalCode);
        return this;
    }
    public CheckoutPage clickContinueButton(){
        continueButton.click();
        return this;
    }
}
