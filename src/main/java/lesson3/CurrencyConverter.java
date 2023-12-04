package lesson3;

public class CurrencyConverter {
    private double commission;  //для роботи з грошима краще використовувати BigDecimal але з ним не розібрався((
    private double exchangeRate;
    private double number;

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    private static double convertUsdToUah(double exchangeRate, double number) {
        return exchangeRate * number;
    }

    private static double calculateCommission(double commission, double resultConvert) {
        return commission * resultConvert;
    }

    public double getResultConvert() {
        return convertUsdToUah(exchangeRate, number);
    }

    public double getResultCommission() {
        double resultConvert = getResultConvert();
        return calculateCommission(commission, resultConvert);
    }

    public double calculateTotalAmount() {
        double resultConvert = getResultConvert();
        double resultCommission = getResultCommission();
        return resultConvert - resultCommission;
    }

}
