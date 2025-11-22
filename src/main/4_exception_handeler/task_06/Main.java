package task_06;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());   // This will throw NullPointerException

            int x = 10 / 0;                     // This will throw ArithmeticException

        } catch (NullPointerException e) {
            System.out.println("Error: You tried to use a null object!");
        } catch (ArithmeticException e) {
            System.out.println("Error: You tried to divide by zero!");
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
