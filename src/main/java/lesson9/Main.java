package lesson9;

import java.util.stream.Stream;

public class Main {
    // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
    public static void main(String[] args) {

        int fibNumber = 11;
        int result = calculateFibonacci(fibNumber);
        System.out.println(result);
    }

    public static int calculateFibonacci(int n) {
        if (n == 0) {             //якщо без цих if то не оброблюються значення 0 та 1 обійти це не зміг(
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                    .limit(n)
                    .map(fib -> fib[0])
                    .reduce((fib1, fib2) -> fib2)
                    .get();
        }
    }
}
