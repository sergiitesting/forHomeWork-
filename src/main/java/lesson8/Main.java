package lesson8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        try {
            obj.myHomework();
        } catch (MyAwesomeException e) {
            System.out.println("MyAwesomeException occurred: " + e.getMessage());
        }
    }
    public void myHomework() {
        try {
            FileInputStream fileInputStream = new FileInputStream("myJavaCertificate.txt");
            System.out.println("No Exception in code"); // Якщо файл є і він прочитаний
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw new MyAwesomeException("File not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new MyAwesomeException("IOException");
        }
    }
    public class MyAwesomeException extends RuntimeException{
        public MyAwesomeException(String message) {
            super(message);
        }
    }
}
