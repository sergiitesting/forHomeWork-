package lesson13.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutOverviewPage {
    private final SelenideElement taxElement = $(".summary_tax_label");
    private final SelenideElement totalElement = $(".summary_total_label");
    private final SelenideElement finishButton = $("#finish");

    public CheckoutOverviewPage calculatePercentageTax(){
        String taxText = taxElement.getText();
        float taxValue = Float.parseFloat(taxText.split("\\$")[1]);
        String totalText = totalElement.getText();
        float totalValue = Float.parseFloat(totalText.split("\\$")[1]);
        float percentage = (taxValue / totalValue) * 100;
        System.out.println("tax percentage = " + percentage);
        return this;
    }
    public CheckoutOverviewPage clickFinishButton(){
        finishButton.click();
        return this;
    }

}
