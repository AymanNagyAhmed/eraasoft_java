package task_01;


import java.util.Scanner;

public class Dev2Num {
    private int num1;
    private int num2;
    public Dev2Num(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void divide() {
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    }

    public static class Main {
        static void main() {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Enter first integer: ");
                int n1 = scanner.nextInt();

                System.out.print("Enter second integer: ");
                int n2 = scanner.nextInt();

                Dev2Num devObj = new Dev2Num(n1, n2);
                devObj.divide();

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter integers only.");
            }
        }
    }
}
