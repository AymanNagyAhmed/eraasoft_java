package task_03;

import java.util.Scanner;

import static task_03.StringUtils.safeToUpper;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        String result1 = safeToUpper(userInput);
        System.out.println("Converted: " + result1);


        String nullString = null;
        safeToUpper(nullString);

    }
}
