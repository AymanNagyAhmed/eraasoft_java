package task_12;


public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Outer try block starts");

            try {
                System.out.println("Inner try block starts");
                int result = 10 / 0; // This will cause ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                // This won't catch ArithmeticException
                System.out.println("Inner catch: Array index out of bounds");
            }

            System.out.println("Outer try block ends normally");
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Caught ArithmeticException -> " + e.getMessage());
        }

        System.out.println("Program continues after nested try-catch");

    }


}
