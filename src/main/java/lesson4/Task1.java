package lesson4;

public class Task1 {
    public static void main(String[] args) {
        int a = 9;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= 9 - i; j++) {
                System.out.print("  ");             // два пробіли бо кривий трикутник (можна один пробіл якщо не робити пробіли між цифрами)
            }
            for (int j = i; j > 1; j--) {           // блок який виводить числа до 1
                System.out.print(j + " ");
            }
            int j = 1;                              // блок який виводить числи після 1
            while (j <= i) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" ");
                }
                j++;                                // збільшую j доки не буде дорівнювати i
            }
            System.out.println();                   // новий рядок
        }

    }
}
