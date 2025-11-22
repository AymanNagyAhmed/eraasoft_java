package task_01;

import task_01.Dev2Num;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first integer: ");
            int n1 = scanner.nextInt();

            System.out.print("Enter second integer: ");
            int n2 = scanner.nextInt();

            Dev2Num obj = new Dev2Num(n1, n2);
            obj.divide();

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        }
    }
}
