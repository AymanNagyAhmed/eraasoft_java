package task_02;

import task_02.StringToInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (as a string): ");
        String input = scanner.nextLine();

        StringToInt obj = new StringToInt(input);
        obj.getNum1();
    }
}
