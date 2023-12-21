package lesson5;

public class TestFraction {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(2,4);
        Fraction fraction2 = new Fraction(4,8);
        Fraction fraction3 = new Fraction(3,5);
        Fraction fraction4 = new Fraction(4,8);

        System.out.println(fraction1.equals(fraction2));
        System.out.println(fraction3.equals(fraction4));
    }
}
