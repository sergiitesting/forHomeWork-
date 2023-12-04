package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of dollars you want to exchange:");
        double number;
        if (sc.hasNextDouble()) {
             number = sc.nextDouble();
        } else {
            System.out.println("Sorry, please enter a number. Restart the program and try again!");
            number = 0;
        }
        sc.close();
        CurrencyConverter CurrencyConverter = new CurrencyConverter();
        CurrencyConverter.setNumber(number);
        CurrencyConverter.setCommission(0.01);
        CurrencyConverter.setExchangeRate(36.55);
        var convertResult = CurrencyConverter.getResultConvert();
        var commission1 = CurrencyConverter.getResultCommission();
        var resultTotalNotFormat = CurrencyConverter.calculateTotalAmount();
        var resultTotal = String.format("%.2f", resultTotalNotFormat);  //Для зручнсті форматую число щоб не було менше копійки
        System.out.println("You'll get " + resultTotal + " UAH");
        System.out.println();
    }

}
