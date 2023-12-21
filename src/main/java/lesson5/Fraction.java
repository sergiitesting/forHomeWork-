package lesson5;

public class Fraction {
        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Fraction that)) return false;
            return this.numerator * that.denominator == this.denominator * that.numerator;
        }
}
