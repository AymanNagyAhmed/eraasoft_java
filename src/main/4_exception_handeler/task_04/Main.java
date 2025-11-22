package task_04;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an index (0 to 4) or -1 to cancel.");

        while (true) {
            System.out.print("Enter index: ");

            try {
                int index = Integer.parseInt(scanner.nextLine());

                if (index == -1) {
                    System.out.println("Program cancelled.");
                    break;  // exit loop
                }

                System.out.println("Value at index " + index + " = " + numbers[index]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index must be between 0 and 4.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number.");
            }
        }

        scanner.close();

    }
}
