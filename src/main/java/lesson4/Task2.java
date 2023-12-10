package lesson4;

public class Task2 {
    public static void main(String[] args) {

        int[] intArray = {31, 432, 3, 42, 51, 999, -1};
        int temp;
        for (boolean flag = true; flag; ) {
            flag = false;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        for (int num : intArray) {
            System.out.print(num + " ");
        }
    }
}
